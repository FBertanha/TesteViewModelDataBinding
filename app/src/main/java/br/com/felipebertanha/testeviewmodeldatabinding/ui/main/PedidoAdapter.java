package br.com.felipebertanha.testeviewmodeldatabinding.ui.main;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import br.com.felipebertanha.testeviewmodeldatabinding.R;
import br.com.felipebertanha.testeviewmodeldatabinding.model.Produto;
import br.com.felipebertanha.testeviewmodeldatabinding.ui.main.bindadapters.BindableAdapter;

import java.util.ArrayList;
import java.util.List;

public class PedidoAdapter extends RecyclerView.Adapter<PedidoAdapter.ViewHolder> implements BindableAdapter<List<Produto>> {
    private List<Produto> itens = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater from = LayoutInflater.from(parent.getContext());

        return new ViewHolder(from.inflate(R.layout.item_pedido, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(itens.get(position));
    }

    @Override
    public int getItemCount() {
        return itens.size();
    }

    @Override
    public void setData(List<Produto> items) {
        itens.clear();
        itens.addAll(items);
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView descricao;
        private TextView valor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            descricao = itemView.findViewById(R.id.item_pedido_produto_descricao);
            valor = itemView.findViewById(R.id.item_pedido_produto_valor);
        }

        public void bind(Produto produto) {
            descricao.setText(produto.getDescricao());
            valor.setText(produto.getTotal().toString());
        }

    }
}
