# Portfólio P1 - Herança e Hierarquia de Classes

Este repositório contém a implementação de um projeto que demonstra herança e hierarquia de classes, proposto para o Portfólio P1. O projeto foi desenvolvido em Java, utilizando as boas práticas de encapsulamento, abstração e reutilização de código.

## Estrutura do Projeto
O projeto contém as seguintes classes e serviços principais:

* **Pessoa**: Modelo básico com atributos nome e idade, métodos de acesso (Getters) e alteração (Setters), além de métodos para edição e exibição de dados.
* **Aluno**: Classe que estende Pessoa, adicionando os atributos matricula e curso, com métodos para manipulação e exibição dos dados.
* **Serviços e Interfaces**: Interfaces e Classes de serviços que lida com a criação, edição e exibição de instâncias de Pessoa e Aluno.
* **App/main**: Classe principal onde o ciclo de vida das instâncias é gerenciado, utilizando os serviços criados.
  
## Requisitos
Para executar este projeto, certifique-se de ter as seguintes ferramentas instaladas:

- [Java 23 SDK](https://www.oracle.com/java/technologies/javase-jdk23-downloads.html)
- [Apache Maven 3.9.9](https://maven.apache.org/download.cgi)
- IDEs recomendadas: [Visual Studio Code](https://code.visualstudio.com/) ou [BlueJ](https://bluej.org/)

## Compilação e execução
Realize download do repositório. Navegue até a pasta raiz do projeto e compile o projeto com Maven:

``` CLI
mvn compile
```

Navegue até a pasta target/classes e execute o programa:
``` CLI
java -cp . portfolio.oop.App
```
