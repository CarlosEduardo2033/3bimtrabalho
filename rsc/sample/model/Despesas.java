package sample.model;

import sample.model.Categorias;

import java.time.LocalDateTime;
import java.util.Calendar;

public class Despesas {

    private int id;
    private String descricao;
    private Categorias Categoria;
    private Double valor;
    private boolean continua;
    private boolean paga;
    private LocalDateTime realizacao;
    private LocalDateTime dataCadastro;

public Despesas(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categorias getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categorias categoria) {
        Categoria = categoria;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isContinua() {
        return continua;
    }

    public void setContinua(boolean continua) {
        this.continua = continua;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    public LocalDateTime getRealizacao() {
        return realizacao;
    }

    public void setRealizacao(LocalDateTime realizacao) {
        this.realizacao = realizacao;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public double getPaga() {
        return 0;
    }
}