package sample.model;

import java.sql.*;
import java.util.List;

public class DespesasDAOimpl implements DespesasDAO {
    private static  String INSERT = "INSERT INTO categorias(nome) VALUES(?)";
    private static String LISTA = "SELECT * FROM categorias";
    private static String BUSCA_ID ="SELECT * FROM categorias WHERE id=?";

    @Override
    public void insere(Despesas c) throws SQLException {

        Connection con = FabricaConexao.getConnection();

        PreparedStatement stm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);

        stm.setString(1,c.getDescricao());
        stm.setDouble(2,c.getValor());
        stm.setDouble(3,c.getPaga());


        stm.executeUpdate();

        ResultSet rs = stm.getGeneratedKeys();
        rs.next();

        int id = rs.getInt(1);

        c.setId(id);

        rs.close();
        stm.close();
        con.close();

    }

    @Override
    public Despesas buscaid(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Despesas> lista() throws SQLException {
        return null;
    }

    @Override
    public void atualizar(Despesas c) throws SQLException {

    }

    @Override
    public void delete(Despesas c) throws SQLException {

    }
}

