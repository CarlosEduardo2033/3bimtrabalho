package sample;

import java.sql.SQLException;
import sample.model.Categorias;
import sample.model.CategoriasDAO;
import sample.model.CategoriaDAOimpl;
public class Main2 {

    public static  void main (String[] args) {
        Categorias c = new Categorias();
        c.setNome("Carl");
        CategoriasDAO clienteDAO = new CategoriaDAOimpl();

        try{
            clienteDAO.insere(c);
        }catch (SQLException e){
            e.printStackTrace();

        }
    }

}
