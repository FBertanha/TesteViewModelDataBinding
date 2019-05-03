package br.com.felipebertanha.testeviewmodeldatabinding.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import br.com.felipebertanha.testeviewmodeldatabinding.R;
import br.com.felipebertanha.testeviewmodeldatabinding.databinding.FragmentItensPedidoBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class ItensPedidoFragment extends Fragment {
    private PageViewModel pageViewModel;
    private FragmentItensPedidoBinding binding;

    public static ItensPedidoFragment newInstance() {
        ItensPedidoFragment fragment = new ItensPedidoFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(getActivity()).get(PageViewModel.class);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,
                R.layout.fragment_itens_pedido,
                container,
                false);
        binding.setLifecycleOwner(getActivity());
        binding.setViewModel(pageViewModel);

        binding.recyclerView.setAdapter(new PedidoAdapter());
        return binding.getRoot();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("", "onDestroy: ");
    }
}