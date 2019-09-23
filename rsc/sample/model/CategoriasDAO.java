package sample.model;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public interface CategoriasDAO {

    //criar
    void insere(Categorias c)throws SQLException;

//recuperar
        Categorias buscaid(int id) throws SQLException;
        List<Categorias> lista() throws SQLException;

        //atualizar
    void atualizar (Categorias c) throws SQLException;
    // delet
    void delete (Categorias c) throws SQLException;
}
