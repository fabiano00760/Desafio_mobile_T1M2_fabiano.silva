# Teste<h1>Desafio Mobile T1M2 - Automatização de Testes em Aplicativos Mobile</h1>
Este projeto apresenta um exemplo de como automatizar testes em aplicativos mobile usando Cucumber e Selenium em Java.

<h2>Configuração</h2>
Para executar a automação, é necessário ter as seguintes ferramentas instaladas:

Java
Android SDK
Appium
Maven
Clone este repositório em sua máquina local e configure o ambiente de acordo com as instruções fornecidas nas documentações de cada uma das ferramentas acima.

<h1>Executando os testes</h1>
Para executar os testes, siga os seguintes passos:

Inicie o servidor Appium.
Conecte um dispositivo móvel ou inicie um emulador.
Abra um terminal na pasta raiz do projeto.
Execute o comando mvn test.
Os testes serão executados automaticamente e o resultado será exibido no terminal.
Estrutura do projeto
A estrutura de diretórios do projeto é a seguinte:

<h3>css
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
</h1>
<h3>src/main/java/configuration: Contém classes para a configuração do ambiente de teste, como inicialização do driver do Selenium e definições de variáveis globais.
src/main/java/Others: Contém outras classes ou utilitários que contém as classes Usuarios, UsuariosDAO e Teste,que implementam as funcionalidades de acesso ao banco de dados para o cadastro e consulta de usuários, Para utilizar essa integração, é necessário configurar as informações de conexão com o banco de dados no arquivo src/main/java/configuration/DatabaseConfig.java. As informações necessárias incluem o endereço do banco de dados, o nome do banco de dados, o nome de usuário e a senha..
Com a configuração correta, é possível utilizar as funções de cadastro e consulta de usuários nos testes automatizados. Isso pode ser útil para testar funcionalidades que dependem de dados de usuários já cadastrados no banco de dados.
src/main/java/Utils: Contém classes utilitárias que podem ser usadas em diferentes partes do projeto e contém as classes BasePage e PrintScr.
src/main/java/Hooks: Contém classes que definem ganchos ou ações executadas antes ou depois de cada cenário.
src/main/java/Runner: contém a classe onde será executada os teste conforme suas stepes.
src/test/java/Steps: Contém as classes que implementam os passos definidos nos cenários do Cucumber.
src/test/resources/features: Contém os arquivos .feature que definem os cenários do Cucumber.
pom.xml: Arquivo de configuração do Maven.</h3>


<h4>README.md: Arquivo que contém a documentação do projeto.</h4>
