package sample.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAOimpl implements CategoriasDAO {

    private static  String INSERT = "INSERT INTO categorias(nome) VALUES(?)";
    private static String LISTA = "SELECT * FROM categorias";
    private static String BUSCA_ID ="SELECT * FROM categorias WHERE id=?";

    @Override
    public void insere(Categorias c) throws SQLException {

        Connection con = FabricaConexao.getConnection();

        PreparedStatement stm = con.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);

        stm.setString(1,c.getNome());
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
    public Categorias buscaid(int id) throws SQLException {
        Categorias c = null;

            Connection con = FabricaConexao.getConnection();

            PreparedStatement stm = con.prepareStatement(BUSCA_ID);

            stm.setInt(1,id);

            ResultSet rs = stm.executeQuery();

            while (rs.next()){

                String nome = rs.getString("Nome");
                c = new Categorias();
                c.setId(id);
                c.setNome(nome);

            }

            rs.close();
            stm.close();
            con.close();

            return c;
        }
    }

    @Override
    public List<Categorias> lista() throws SQLException {
        List<Categorias> lista = new ArrayList<>();

        Connection con = FabricaConexao.getConnection();

        PreparedStatement stm = con.prepareStatement(LISTA);

        ResultSet rs = stm.executeQuery();

        while (rs.next()){

            int id = rs.getInt("id");
            String nome = rs.getString("Nome");
            Categorias c = new Categorias();
            c.setId(id);
            c.setNome(nome);

            lista.add(c);

        }
        rs.close();
        stm.close();
        con.close();

        return lista;
    }

    @Override
    public void atualizar(Categorias c) throws SQLException {

    }

    @Override
    public void delete(Categorias c) throws SQLException {

    }
}
