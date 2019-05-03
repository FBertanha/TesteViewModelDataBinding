package br.com.felipebertanha.testeviewmodeldatabinding.ui.main.bindadapters;

import android.util.Log;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;

public class BindAdapters {

    @BindingAdapter("data")
    public static <T> void setRecyclerViewProperties(RecyclerView recyclerView, T items) {
        Log.e("", "setRecyclerViewProperties: bindou");
        if (recyclerView.getAdapter() instanceof BindableAdapter<?>) {
            ((BindableAdapter<T>) recyclerView.getAdapter()).setData(items);
        }
    }
}
