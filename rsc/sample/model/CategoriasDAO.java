package sample.model;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public interface CategoriasDAO {

        //cria
        void insere(Categorias c)throws SQLException;

        //recupera
        Categorias buscaid(int id) throws SQLException;

        //lista
        List<Categorias> lista() throws SQLException;

        //atualizar
        void atualizar (Categorias c) throws SQLException;

        // deleta
        void delete (Categorias c) throws SQLException;
}

