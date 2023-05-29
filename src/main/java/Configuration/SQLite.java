package Configuration;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class SQLite {

    private static Connection conexao;

    public static void conectar() throws SQLException {
        String nomeBancoDados = "src/main/Banco_dados/banco_de_dados.db";
        conexao = DriverManager.getConnection("jdbc:sqlite:" + nomeBancoDados);
        System.out.println("Conexão com o banco de dados estabelecida.");

        // Cria a tabela se ela não existir
        String sqlCriarTabela = "CREATE TABLE IF NOT EXISTS usuarios ( id SERIAL PRIMARY KEY,senha VARCHAR(255) NOT NULL, nome VARCHAR(255) NOT NULL, nome_teste VARCHAR(255) NOT NULL, status VARCHAR(100) NOT NULL, data_execucao DATE NOT NULL)";
        PreparedStatement statement = conexao.prepareStatement(sqlCriarTabela);
        statement.execute();
        System.out.println("Tabela criada ou já existente.");

        // Verifica se a coluna data_execucao já existe na tabela usuarios
        DatabaseMetaData meta = conexao.getMetaData();
        ResultSet colunas = meta.getColumns(null, null, "usuarios", "data_execucao");
        boolean colunaExiste = colunas.next();

        // Se a coluna não existir, adiciona a coluna na tabela
        if (!colunaExiste) {
            String sqlAlterarTabela = "ALTER TABLE usuarios ADD COLUMN data_execucao DATE NOT NULL";
            PreparedStatement alterarStatement = conexao.prepareStatement(sqlAlterarTabela);
            alterarStatement.execute();
        }
    }

    public static void salvar(String nome, String senha, String nomeTeste, String status) throws SQLException {
        // Insere dados na tabela
        String sqlInserir = "INSERT INTO usuarios (nome, senha, nome_teste, status, data_execucao ) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = conexao.prepareStatement(sqlInserir);
        ps.setString(1, nome);
        ps.setString(2, senha);
        ps.setString(3, nomeTeste);
        ps.setString(4, status);
        ps.setString(5, String.valueOf(new Timestamp(System.currentTimeMillis())));
        ps.executeUpdate();
        System.out.println("Dados inseridos com sucesso.");
    }

    public static void fecha() {
        try {
            if (conexao != null) {
                conexao.close();
                System.out.println("Conexão com o banco de dados fechada.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
