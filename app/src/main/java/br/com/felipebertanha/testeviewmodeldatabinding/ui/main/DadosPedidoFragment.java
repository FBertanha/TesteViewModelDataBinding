package br.com.felipebertanha.testeviewmodeldatabinding.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import br.com.felipebertanha.testeviewmodeldatabinding.R;
import br.com.felipebertanha.testeviewmodeldatabinding.databinding.FragmentDadosPedidoBinding;

/**
 * A placeholder fragment containing a simple view.
 */
public class DadosPedidoFragment extends Fragment {
    private PageViewModel pageViewModel;
    private FragmentDadosPedidoBinding binding;

    public static DadosPedidoFragment newInstance() {
        DadosPedidoFragment fragment = new DadosPedidoFragment();
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
                R.layout.fragment_dados_pedido,
                container,
                false);
        binding.setLifecycleOwner(getActivity());
        binding.setViewModel(pageViewModel);
        return binding.getRoot();
    }
}