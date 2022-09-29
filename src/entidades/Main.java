package entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Personaje p1 = new Personaje("Clark kent", "superman");
        Personaje p2 = new Personaje("Peter Parker", "spiderman");
        Personaje p3 = new Personaje("Bruce Wayne", "batman");

        p1.addAtributo("velocidad", new AtributoSImple(100));
        p1.addAtributo("edad", new AtributoSImple(30));
        p1.addAtributo("fuerza", new AtributoSImple(30));
        p1.addAtributo("tecnologia", new AtributoSImple(50));
        p1.addAtributo("superpoder", new AtributoSImple(100));
        p1.addAtributo("invisibilidad", new AtributoSImple(20));
        p1.addAtributo("Resitencia", new AtributoOperacion("fuerza","velocidad"));
        p1.addAtributo("Camuflaje", new AtributoCondicional("invisibilidad","fuerza",new AtributoSImple(50), new AtributoSImple(100) ));
        p1.addAtributo("Modernidad", new AtributoCondicional("tecnologia","superpoder",new AtributoSImple(30), new AtributoSImple(10)));


        p2.addAtributo("velocidad", new AtributoSImple(90));
        p2.addAtributo("edad", new AtributoSImple(40));
        p2.addAtributo("fuerza", new AtributoSImple(80));
        p2.addAtributo("tecnologia", new AtributoSImple(50));
        p2.addAtributo("superpoder", new AtributoSImple(10));
        p2.addAtributo("invisibilidad", new AtributoSImple(60));
        p2.addAtributo("Resitencia", new AtributoOperacion("fuerza","velocidad"));
        p2.addAtributo("Camuflaje", new AtributoCondicional("invisibilidad","fuerza",new AtributoSImple(50), new AtributoSImple(100) ));
        p2.addAtributo("Modernidad", new AtributoCondicional("tecnologia","superpoder",new AtributoSImple(30), new AtributoSImple(10)));

        p3.addAtributo("velocidad", new AtributoSImple(70));
        p3.addAtributo("edad", new AtributoSImple(80));
        p3.addAtributo("fuerza", new AtributoSImple(90));
        p3.addAtributo("tecnologia", new AtributoSImple(50));
        p3.addAtributo("superpoder", new AtributoSImple(40));
        p3.addAtributo("invisibilidad", new AtributoSImple(80));
        p3.addAtributo("Resitencia", new AtributoOperacion("fuerza","velocidad"));
        p3.addAtributo("Camuflaje", new AtributoCondicional("invisibilidad","fuerza",new AtributoSImple(50), new AtributoSImple(100) ));
        p3.addAtributo("Modernidad", new AtributoCondicional("tecnologia","superpoder",new AtributoSImple(30), new AtributoSImple(10)));


        ComparatorCriterioSimple simple = new ComparatorCriterioSimple("fuerza");
        ComparatorCriterioSimple simple1 = new ComparatorCriterioSimple("invisibilidad");
        ComparatorCriterioSimple simple2 = new ComparatorCriterioSimple("velocidad");

        ComparatorCompuesto compuesto = new ComparatorCompuesto();
        compuesto.addComparator(simple);
        compuesto.addComparator(simple1);
        compuesto.addComparator(simple2);

        List<Enfrentable> justicieros = new ArrayList<>();
        justicieros.add(p3);
        justicieros.add(p2);
        justicieros.add(p1);
        justicieros.add(p1);

        Liga ligaDeLaJusticia = new Liga("wilson", "Liga De La Justicia", justicieros);

        List<Enfrentable> menores = new ArrayList<>();
        menores.add(p3);
        menores.add(p2);

        Liga ligaMenores = new Liga("ariel", "los vengadores",menores);
        ligaDeLaJusticia.addIntegrante(ligaMenores);

        Liga noTiene = new Liga("tavo", "lospichis");
        //System.out.println(ligaDeLaJusticia.getPersonajes());

        Juego juego = new Juego();
        juego.addEnfretable(p1);
        juego.addEnfretable(p3);
        juego.addEnfretable(ligaDeLaJusticia);

        //Enfrentable ganador = juego.enfrentar(p1,ligaDeLaJusticia,compuesto);

        //retorna una cadena vacia en caso de ser empate.

        //List<Enfrentable> ganandores = juego.getQuienesVencen(p2, simple);

        List<Personaje> ordenarliata = juego.ordernarPersonajes(simple1);
        System.out.println(ordenarliata);

    }
}
