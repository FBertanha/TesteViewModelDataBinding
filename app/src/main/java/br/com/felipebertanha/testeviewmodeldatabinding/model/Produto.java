package br.com.felipebertanha.testeviewmodeldatabinding.model;

public class Produto {
    private String descricao;
    private Double total;

    public Produto(String descricao, Double total) {
        this.descricao = descricao;
        this.total = total;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", total=" + total +
                '}';
    }
}
