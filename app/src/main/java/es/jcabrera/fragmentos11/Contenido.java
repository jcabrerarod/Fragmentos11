package es.jcabrera.fragmentos11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Contenido {
    public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();
    public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();
    static {

        aniadirEntrada(new Lista_entrada("0", R.drawable.caravaggio, "CARAVAGGIO", "Pintor italiano entre los años de 1593 y 1610. Es considerado como el primer gran exponente de la pintura del Barroco."));
        aniadirEntrada(new Lista_entrada("1", R.drawable.rafael, "RAFAEL SANZIO", "Pintor y arquitecto italiano del Renacimiento, realizó importantes aportes en la arquitectura y, como inspector de antigüedades."));
        aniadirEntrada(new Lista_entrada("2", R.drawable.velazquez, "VELAZQUEZ", "Pintor Barroco nacido en Sevilla en 1599, es considerado uno de los máximos exponentes de la pintura española y maestro de la pintura universal."));
        aniadirEntrada(new Lista_entrada("3", R.drawable.miguelangel, "MIGUEL ANGEL", "Arquitecto, escultor y pintor italiano renacentista, considerado uno de los más grandes artistas de la historia."));
        aniadirEntrada(new Lista_entrada("4", R.drawable.rembrant, "REMBRANDT", "Pintor y grabador holandés. La historia del arte le considera uno de los mayores maestros barrocos de la pintura y el grabado."));
        aniadirEntrada(new Lista_entrada("5", R.drawable.boticelli, "BOTICELLI", "Apodado Sandro Botticelli, fue un pintor cuatrocentista italiano.su obra se ha considerado representativa de la pintura del primer Renacimiento."));
        aniadirEntrada(new Lista_entrada("6", R.drawable.leonardo, "LEONARDO DA VINCI", "Notable polímata del Renacimiento italiano (a la vez anatomista, arquitecto, artista, botánico, científico, escritor, escultor, filósofo, ingeniero...)"));
        aniadirEntrada(new Lista_entrada("7", R.drawable.renoir, "RENOIR", "Pintor francés impresionista, interesado por la pintura de cuerpos femeninos en paisajes, inspirados a menudo en pinturas clásicas renacentistas y barrocas."));

    }
    private static void aniadirEntrada(Lista_entrada entrada) {
        ENTRADAS_LISTA.add(entrada);
        ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
    }
    public static class Lista_entrada {
        public String id;
        public int idImagen;
        public String textoEncima;
        public String textoDebajo;

        public Lista_entrada (String id, int idImagen, String textoEncima, String textoDebajo) {
            this.id = id;
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
        }
    }

}
