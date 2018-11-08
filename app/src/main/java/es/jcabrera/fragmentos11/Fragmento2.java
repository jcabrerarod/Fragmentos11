package es.jcabrera.fragmentos11;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Fragmento2 extends Fragment {

    public static final String ARG_ID_ENTRADA_SELECIONADA = "item_id";

    private Contenido.Lista_entrada mItem;

    public Fragmento2() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ID_ENTRADA_SELECIONADA)) {

            mItem = Contenido.ENTRADAS_LISTA_HASHMAP.get(getArguments().getString(ARG_ID_ENTRADA_SELECIONADA));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.layout_detalle, container, false);

        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.textotitulo)).setText(mItem.textoEncima);
            ((TextView) rootView.findViewById(R.id.textocontenido)).setText(mItem.textoDebajo);
            ((ImageView) rootView.findViewById(R.id.imagen)).setImageResource(mItem.idImagen);
        }

        return rootView;
    }

}
