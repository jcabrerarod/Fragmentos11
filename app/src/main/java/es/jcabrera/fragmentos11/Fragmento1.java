package es.jcabrera.fragmentos11;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class Fragmento1 extends ListFragment {

    private Callbacks mCallbacks = CallbacksVacios;

    public interface Callbacks {
        public void onEntradaSelecionada(String id);
    }

    private static Callbacks CallbacksVacios = new Callbacks() {
        @Override
        public void onEntradaSelecionada(String id) {
        }
    };

    public Fragmento1() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new Adaptador(getActivity(), R.layout.layout_listado, Contenido.ENTRADAS_LISTA){
            @Override
            public void onEntrada(Object entrada, View view) {
                if (entrada != null) {
                    TextView texto_superior_entrada = (TextView) view.findViewById(R.id.textotitulo);
                    if (texto_superior_entrada != null)
                        texto_superior_entrada.setText(((Contenido.Lista_entrada) entrada).textoEncima);

                    ImageView imagen_entrada = (ImageView) view.findViewById(R.id.imagenlista);
                    if (imagen_entrada != null)
                        imagen_entrada.setImageResource(((Contenido.Lista_entrada) entrada).idImagen);
                }
            }
        });

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof Callbacks)) {
            throw new IllegalStateException("Error: La actividad debe implementar el callback del fragmento");
        }

        mCallbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCallbacks = CallbacksVacios;
    }

    @Override
    public void onListItemClick(ListView listView, View view, int posicion, long id) {
        super.onListItemClick(listView, view, posicion, id);
        mCallbacks.onEntradaSelecionada(Contenido.ENTRADAS_LISTA.get(posicion).id);
    }

}
