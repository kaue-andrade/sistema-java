# Nome do Projeto

## História dos Usuários

| Código    | User Story                                                   |
| --------- | ------------------------------------------------------------ |
| **US001** | Como um usuário típico, eu gostaria de realizar empréstimos de livros |
| **US002** | Como um usuário típico, eu gostaria de devolver um livro que tomei emprestado |
| **US003** | Como um usuário típico, eu gostaria de renovar empréstimos de livros |
| **US004** | Como um usuário típico, eu gostaria de pesquisar por livros  |
| **US005** | Como um usuário típico, eu gostaria de reservar livros que estão emprestados |
| **US006** | Como um usuário típico, eu gostaria de receber e-mails com novas aquisições |
| **US007** | Como um professor, eu gostaria de realizar empréstimos de maior duração |
| **US008** | Como um professor, eu gostaria de sugerir a compra de livros |
| **US009** | Como um professor, eu gostaria de doar livros para a biblioteca |
| **US010** | Como um professor, eu gostaria de devolver livros em outras bibliotecas |
| ...       | ...                                                          |



## Testes de Aceitação

| Código | Código da US | Teste de Aceitação                                           |
| ------ | ------------ | ------------------------------------------------------------ |
| TA001  | US004        | **Dado** que sou um usuário típico. **Quando** eu preencher o campo de pesquisa com o ISBN do livro que desejo pesquisar, selecionar o opção de busca por ISBN e clicar no botão de busca. **Então** o sistema deve exibir a tela de detalhes daquele livro, caso |
| TA002  | US004        | **Dado** que sou um usuário típico. **Quando** eu preencher o campo de pesquisa com o título, ou parte do título, do livro que desejo pesquisar, selecionar a opção de busca por título e clicar no botão de busca. **Então** o sistema deve exibir a tela com uma lista de todos os livros existentes na biblioteca cujos títulos contenham a string de busca |
| TA003  | US004        | **Dado** que sou um usuário típico. **Quando** eu preencher o campo de pesquisa com o nome, ou parte do nome, de um autor que desejo pesquisar, selecionar a opção de busca autor e clicar no botão de busca. **Então** o sistema deve exibir a tela com uma lista de todos os autores de livros existentes na biblioteca cujos nomes contenham a string de busca |
| ...    | ...          | ...                                                          |

