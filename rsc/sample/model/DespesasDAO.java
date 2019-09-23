package sample.model;

import java.awt.*;
import java.sql.SQLException;
import java.util.List;

public interface DespesasDAO {

    //criar
    void insere(Despesas c)throws SQLException;

    //recuperar
    Despesas buscaid(int id) throws SQLException;
    List<Despesas> lista() throws SQLException;

    //atualizar
    void atualizar (Despesas c) throws SQLException;
    // delet
    void delete (Despesas c) throws SQLException;
}

