package br.com.felipebertanha.testeviewmodeldatabinding;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;
import br.com.felipebertanha.testeviewmodeldatabinding.dao.PedidoDao;
import br.com.felipebertanha.testeviewmodeldatabinding.model.Pedido;
import br.com.felipebertanha.testeviewmodeldatabinding.ui.main.PageViewModel;
import br.com.felipebertanha.testeviewmodeldatabinding.ui.main.SectionsPagerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

public class PedidoActivity extends AppCompatActivity {

    private PageViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        setupViewModel();
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Log.e("", "onCreate: " + PedidoDao.getPedidos());

    }

    private void setupViewModel() {
        viewModel = ViewModelProviders.of(this).get(PageViewModel.class);

        Pedido pedido = PedidoDao.getPedidos().get(0);
        Log.e("", "setupViewModel: " + pedido.getObservacao());
        viewModel.setPedido(pedido);
        viewModel.setStringMutableLiveData("Felipinho");
    }
}