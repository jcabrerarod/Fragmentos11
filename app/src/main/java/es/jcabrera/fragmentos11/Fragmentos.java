package es.jcabrera.fragmentos11;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Fragmentos extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_unpanel);

        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putString(Fragmento2.ARG_ID_ENTRADA_SELECIONADA, getIntent().getStringExtra(Fragmento2.ARG_ID_ENTRADA_SELECIONADA));
            Fragmento2 fragment = new Fragmento2();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().add(R.id.frame_contenedor, fragment).commit();
        }
    }

}

