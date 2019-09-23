package sample.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CategoriaDAOimpl implements CategoriasDAO {

    private static  String INSERT = "INSERT INTO categorias(nome) VALUES(?)";

    @Override
    public void insere(Categorias c) throws SQLException {

        Connection con = FabricaConexao.getConnection();

        PreparedStatement stm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);

        stm.setString(1,c.getNome());
        stm.executeUpdate();


    }

    @Override
    public Categorias buscaid(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Categorias> lista() throws SQLException {
        return null;
    }

    @Override
    public void atualizar(Categorias c) throws SQLException {

    }

    @Override
    public void delete(Categorias c) throws SQLException {

    }
}
