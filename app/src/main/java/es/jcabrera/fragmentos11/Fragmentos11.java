package es.jcabrera.fragmentos11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class Fragmentos11 extends FragmentActivity implements Fragmento1.Callbacks {

    private boolean dosFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentos11);
        if (findViewById(R.id.frame_contenedor) != null) {
            dosFragmentos = true;
        }
    }


    @Override
    public void onEntradaSelecionada(String id) {
        if (dosFragmentos) {
            Bundle arguments = new Bundle();
            arguments.putString(Fragmento2.ARG_ID_ENTRADA_SELECIONADA, id);
            Fragmento2 fragment = new Fragmento2();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_contenedor, fragment).commit();

        } else {
            Intent detailIntent = new Intent(this, Fragmentos.class);
            detailIntent.putExtra(Fragmento2.ARG_ID_ENTRADA_SELECIONADA, id);
            startActivity(detailIntent);
        }
    }
}

