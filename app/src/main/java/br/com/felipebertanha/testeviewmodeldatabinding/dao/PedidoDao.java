package br.com.felipebertanha.testeviewmodeldatabinding.dao;


import android.annotation.SuppressLint;
import br.com.felipebertanha.testeviewmodeldatabinding.model.Cliente;
import br.com.felipebertanha.testeviewmodeldatabinding.model.Pedido;
import br.com.felipebertanha.testeviewmodeldatabinding.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PedidoDao {

    public static List<Pedido> getPedidos() {

        ArrayList<Pedido> pedidos = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            pedidos.add(getPedidoSample());

        }

        return pedidos;
    }

    @SuppressLint("NewApi")
    private static Pedido getPedidoSample() {
        Pedido pedido = new Pedido();
        pedido.setObservacao("OBSSSSS");
        pedido.setCliente(new Cliente("Felipe-" + UUID.randomUUID().toString().substring(1, 3), "Bertanha"));

        for (int i = 0; i < 3; i++) {
            pedido.addProduto(new Produto("Abacaxi-" + UUID.randomUUID().toString().substring(1, 3) + i, Math.random()));
        }

        return pedido;
    }
}
