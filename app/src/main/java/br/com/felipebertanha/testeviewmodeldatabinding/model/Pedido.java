package br.com.felipebertanha.testeviewmodeldatabinding.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Serializable {
    private String observacao;
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<>();

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }


    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "observacao='" + observacao + '\'' +
                ", cliente=" + cliente +
                ", produtos=" + produtos +
                '}';
    }

    public String getTotal() {
        Double total = 0D;
        for (Produto p :
                produtos) {
            total += p.getTotal();

        }

        return total.toString();
    }
}
