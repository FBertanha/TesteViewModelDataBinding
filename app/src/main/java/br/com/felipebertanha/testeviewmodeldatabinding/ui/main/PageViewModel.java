package br.com.felipebertanha.testeviewmodeldatabinding.ui.main;

import android.util.Log;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import br.com.felipebertanha.testeviewmodeldatabinding.dao.PedidoDao;
import br.com.felipebertanha.testeviewmodeldatabinding.model.Pedido;

public class PageViewModel extends ViewModel {

    public MutableLiveData<Pedido> pedidoMutableLiveData = new MutableLiveData<>();
    public MutableLiveData<String> stringMutableLiveData = new MutableLiveData<>();

    public PageViewModel() {
    }

    public void setPedido(Pedido pedido) {
        pedidoMutableLiveData.setValue(pedido);
    }

    public void setStringMutableLiveData(String s) {
        stringMutableLiveData.setValue(s);
    }

    public void salvar() {
        this.stringMutableLiveData.setValue(String.valueOf(Math.random()));
        pedidoMutableLiveData.setValue(PedidoDao.getPedidos().get(0));

        Log.e("", "salvar: " + pedidoMutableLiveData.getValue());
    }
}