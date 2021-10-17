# Projeto: Criando um App para Apresentar seu Portfólio do GitHub

## Bootcamp Inter Android Developer 

###### (01/08/2021 à 01/11/2021) 

O bootcamp Inter Android Developer faz parte do programa Órbi Academy Techboost, iniciativa da DIO junto ao Órbi Conecta, que até 2022 distribuirá 130 mil bolsas de estudo gratuitas, fortalecendo ainda mais a comunidade tech brasileira.

- Link para o projeto original do instrutor Ezequiel Messore: 

  https://github.com/EzequielMessore/app-repositories

- Link para o projeto modificado: 

  https://github.com/danielvillarintegra/RepoGitHub 

[![Linkedin Badge](https://img.shields.io/badge/-Daniel_Villar-blue?style=flat-square&logo=Linkedin&logoColor=white&link=linkedin.com/in/daniel-villar-326477212)](linkedin.com/in/daniel-villar-326477212)   [![Gmail Badge](https://img.shields.io/badge/-danielvillarintegra@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:danielvillarintegra@gmail.com)](mailto:danielvillarintegra@gmail.com)


#### Alterações realizadas:

- O projeto alterado tem a função de buscar e mostrar o arquivo README.md.

  Após a busca e o sucesso em coletar as informações de repositórios do Git-Hub na internet, o arquivo README.md, caso exista,  estará acessível através do ícone "ReadMore" (Leia mais) no canto direito de cada CardView.  

  Ao pressionar a opção "ReadMore" o app busca na internet em tempo real o arquivo README.md e abre uma nova activity com uma webview.

- No Git-Hub cada linguagem de programação é associada a uma cor. Para fins de teste visual, criei uma função que altera a cor de fundo do TextView onde o nome da linguagem é escrita. Até o momento somente as linguagens Java, Kotlin, HTML, CSS e JavaScript tem cores associadas. 

- Mantive a organização "Clean Architecture" do projeto original que utiliza o Material design, cardView e recyclerView, searchview, webview, MVVM, viewBinding,  listAdapter, LiveData, Koin e "Dependency Injection", coroutines, API Rest Git-Hub e Retrofit2, conversão Json e Gson . 

- Utilizei putExtra e getIntExtra para a comunicação entre a interface principal e a de mostrar o arquivo README.md.

#### Possíveis ações futuras:

- Implementar a associação de cor para todas as linguagens do Git-Hub de forma dinâmica, acessando um repositório que contenham essas informações. Como por exemplo:

   https://gist.github.com/robertpeteuil/bb2dc86f3b3e25d203664d61410bfa30 

  https://github.com/github/linguist/blob/master/lib/linguist/languages.yml

- Alteração da finalidade original (App para Apresentar seu Portfólio do GitHub) para um app que busca e fixa localmente os repositórios de qualquer usuário do GitHub com os assuntos de interesse.

   Os dados para o acesso rápido ao repositório selecionado consistem basicamente no endereço de internet.

  Com a implementação de um novo menu será possível aplicar algorítmos nos dados selecionados como comparar dois repositórios e/ou extrair as diferenças entre eles.

- Implementar a verificação de existência do arquivo ReadMe.md, antes de abrir a nova tela de leitura. 

- Implementar a verificação das permissões conforme versão do Android.

- Testes unitários, Testes não-funcionai etc . "fun onTest -> { Correções }"

- Implementar o room para a persistência dos dados.

- Acompanhamento do ciclo de vida. 

- Novos designs.

