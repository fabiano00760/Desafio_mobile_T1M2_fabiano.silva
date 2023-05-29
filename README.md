# Desafio Mobile T1M2 - Automatização de Testes em Aplicativos Mobile

Este projeto apresenta um exemplo de como automatizar testes em aplicativos mobile usando Cucumber e Selenium em Java.

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.

Consulte **[Implantação](#-implanta%C3%A7%C3%A3o)** para saber como implantar o projeto.

### 📋 Pré-requisitos

De que coisas você precisa para instalar o software e como instalá-lo?

```
Para executar a automação, é necessário ter as seguintes ferramentas instaladas:
Java.
Android SDK.
Appium.
Maven.
Intellij (ou EDE de sua preferencia).
```

### 🔧 Instalação
```
Java :
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
Android SDK:
https://developer.android.com/studio
Appium:
https://github.com/appium/appium-inspector
intellij:
https://www.jetbrains.com/idea/download/#section=windows
https://www.postgresql.org/download/windows/
```
Obs: intalar banco de dados postgresql .


Inicie o servidor Appium.
Conecte um dispositivo móvel ou inicie um emulador.
Abra um terminal na pasta raiz do projeto.
Execute o comando mvn test.
Os testes serão executados automaticamente e o resultado será exibido no terminal.
```

## ⚙️ A estrutura de diretórios do projeto é a seguinte:
Copy code


├── src
│   ├── main
│   │   ├── java
│   │   │   ├── configuration
│   │   │   ├── Others
│   │   │   ├── Steps
│   │   │   ├── Utils
│   │   │   └── Hooks
│   │   │   └── Runner
│   │   └── resources
│   │
│   └── test
│       ├── java
│       │   └── Steps
│       └── resources
│           └── features
├── pom.xml
└── README.md


### 🔩 

src/main/java/configuration: Contém classes para a configuração do ambiente de teste, como inicialização do driver do Selenium e definições de variáveis globais.
src/main/java/Others: Contém outras classes ou utilitários, classes Usuarios, UsuariosDAO e Teste,que implementam as funcionalidades de acesso ao banco de dados para o cadastro e consulta de usuários, Para utilizar essa integração, é necessário configurar as informações de conexão com o banco de dados no arquivo src/main/java/configuration/DatabaseConfig.java. As informações necessárias incluem o endereço do banco de dados, o nome do banco de dados, o nome de usuário e a senha..
Para criar uma instância do PostgreSQL com um banco de dados chamado "cadastro" e uma tabela "usuario" com as colunas "id", "nome", "senha", "nome_teste", "status" e "data_execução", siga os seguintes passos:

```
Certifique-se de que o PostgreSQL está instalado e em execução em seu sistema
crie sua tabela exemplo a baixo o seginte comando :(tabela usuario)
```
CREATE TABLE usuario (
    id SERIAL PRIMARY KEY,
    senha VARCHAR(255) NOT NULL,
    nome VARCHAR(255) NOT NULL,
    nome_teste VARCHAR(255) NOT NULL,
    status VARCHAR(100) NOT NULL,
    data_execução DATE NOT NULL

);
```
```

### ⌨️ E testes de estilo de codificação

Explique que eles verificam esses testes e porquê.

```
Abra um terminal ou linha de comando e acesse o PostgreSQL digitando "psql" e pressionando Enter.
Digite o comando "CREATE DATABASE cadastro;" e pressione Enter para criar o banco de dados "cadastro".
Digite o comando "USE cadastro;" e pressione Enter para entrar no banco de dados "cadastro".
Digite o comando "CREATE TABLE usuario (id INT PRIMARY KEY, nome VARCHAR(50), senha VARCHAR(50), nome_teste VARCHAR(50), status BOOLEAN, data_execucao DATE);" e pressione Enter para criar a tabela "usuario" com as seis colunas especificadas: "id", "nome", "senha", "nome_teste", "status" e "data_execucao".
Para inserir dados na tabela "usuario", digite o comando "INSERT INTO usuario (id, nome, senha, nome_teste, status, data_execucao) VALUES (1, 'João', 'senha123', 'teste', true, '2023-04-25');" e pressione Enter.
Para visualizar os dados da tabela "usuario", digite o comando "SELECT * FROM usuario;" e pressione Enter.
Pronto! Agora você criou uma instância do PostgreSQL com um banco de dados "cadastro" e uma tabela "usuario" com as colunas especificadas e um registro inserido. Você pode continuar adicionando mais registros à tabela "usuario" conforme necessário.
```

## 🛠️ Construído com

Mencione as ferramentas que você usou para criar seu projeto

* [intellij](https://www.jetbrains.com/idea/download/#section=windows) - IDE.
* [Maven](https://maven.apache.org/) - Gerente de Dependência.
* [Android studio](https://developer.android.com/studio) - Usada para gerar RSS.
* [Maven Repository](https://mvnrepository.com/) - dependecias do pom.

## 🖇️ Colaborando

* Fabiano De Barros Silva. 
* https://gist.github.com/fabiano00760.
* Email Fabiano.silva@inmetrics.com.

## 📌 Versão
1.1.0

## ✒️ Autores

* **Um desenvolvedor** - ** Fabiano De Barros Silva.* - [umdesenvolvedor](https://gist.github.com/fabiano00760).
* **Fabiano De Barros Silva** - *Documentação* - [Fabiano De Barros Silva](https://gist.github.com/fabiano00760).

Você também pode ver a lista de todos os [colaboradores](https://gitlab.inlabs.app/pfqe) que participaram deste projeto.

## 📄 Licença

Este projeto está sob a licença (Renato Dos Santos Vieira) - veja o arquivo [LICENSE.md](renato.vieira@inmetrics.com.br) para detalhes.

## 🎁 Expressões de gratidão

* Conte a outras pessoas sobre este projeto 📢;
* Convide alguém da equipe para uma cerveja 🍺;
* Um agradecimento publicamente 🫂;
* etc.

---
⌨️ com ❤️ por [Fabiano De Barros Silva ](https://gist.github.com/fabiano00760) 😊