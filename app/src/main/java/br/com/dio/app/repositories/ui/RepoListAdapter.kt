package br.com.dio.app.repositories.ui

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.dio.app.repositories.data.model.Repo
import br.com.dio.app.repositories.databinding.ItemRepoBinding
import com.bumptech.glide.Glide

class RepoListAdapter : ListAdapter<Repo, RepoListAdapter.ViewHolder>(DiffCallback()) {

    var listenerOpen: (Repo) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemRepoBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(
        private val binding: ItemRepoBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Repo) {
            try {
                binding.tvRepoName.text = item.name
                binding.tvRepoDescription.text = item.description
                binding.tvRepoLanguage.text = item.language

                binding.tvRepoLanguage.setBackgroundColor(Color.parseColor(languageColor(item.language)))

                binding.chipStar.text = item.stargazersCount.toString()

                Glide.with(binding.root.context)
                    .load(item.owner.avatarURL).into(binding.ivOwner)

            /* Verificar se existe o arquivo README.md e deixar o ícone ReadMore no estado clicável ou não
                if (existReadMe) binding.ivReadMore.isClickable = "true"
                    else binding.ivReadMore.isClickable = "false"

            */

            } catch (ex: Exception) {
                ex.printStackTrace()
                Log.e("E/Erro","erro bind ${item.name}. RepoListAdapter")
                binding.tvRepoLanguage.setBackgroundColor(Color.parseColor("#FFFFFF"))
            }
            binding.ivReadMore.setOnClickListener {
                listenerOpen(item)
                Log.d("D/Sucesso","Click em ReadMore (RepoListAdapter) $item")
            }
        }

    }

/* Origem das cores
https://github.com/github/linguist/blob/master/lib/linguist/languages.yml
ou
*/
    private fun languageColor(repoLanguage: String) : String {
        val cor = when (repoLanguage) {
        "Java" -> "#b07219" //"#B07219" //
        "Kotlin" -> "#A97BFF"
        "HTML" -> "#e34c26" //"#E34C26" //
        "CSS" -> "#563d7c" //"#563D7C" //
        "JavaScript" -> "#f1e05a" //"#F1E05A" //
        else -> "white" //fundo branco
    }
        return cor.uppercase()
    }

}


class DiffCallback : DiffUtil.ItemCallback<Repo>() {
    override fun areItemsTheSame(oldItem: Repo, newItem: Repo) = oldItem == newItem
    override fun areContentsTheSame(oldItem: Repo, newItem: Repo) = oldItem.id == newItem.id
}