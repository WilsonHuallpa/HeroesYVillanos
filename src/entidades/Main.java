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
        Personaje p4 = new Personaje("Emil Blonski", "Abominación");
        Personaje p5 = new Personaje("Jake", "Mysterio");
        Personaje p6 = new Personaje("Willem", "Duende Verde");

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

        p4.addAtributo("velocidad", new AtributoSImple(70));
        p4.addAtributo("edad", new AtributoSImple(80));
        p4.addAtributo("fuerza", new AtributoSImple(40));
        p4.addAtributo("tecnologia", new AtributoSImple(50));
        p4.addAtributo("superpoder", new AtributoSImple(40));
        p4.addAtributo("invisibilidad", new AtributoSImple(80));
        p4.addAtributo("Resitencia", new AtributoOperacion("fuerza","velocidad"));
        p4.addAtributo("Camuflaje", new AtributoCondicional("invisibilidad","fuerza",new AtributoSImple(50), new AtributoSImple(100) ));
        p4.addAtributo("Modernidad", new AtributoCondicional("tecnologia","superpoder",new AtributoSImple(30), new AtributoSImple(10)));

        p5.addAtributo("velocidad", new AtributoSImple(100));
        p5.addAtributo("edad", new AtributoSImple(80));
        p5.addAtributo("fuerza", new AtributoSImple(0));
        p5.addAtributo("tecnologia", new AtributoSImple(50));
        p5.addAtributo("superpoder", new AtributoSImple(50));
        p5.addAtributo("invisibilidad", new AtributoSImple(80));
        p5.addAtributo("Resitencia", new AtributoOperacion("fuerza","velocidad"));
        p5.addAtributo("Camuflaje", new AtributoCondicional("invisibilidad","fuerza",new AtributoSImple(50), new AtributoSImple(100) ));
        p5.addAtributo("Modernidad", new AtributoCondicional("tecnologia","superpoder",new AtributoSImple(30), new AtributoSImple(10)));

        p6.addAtributo("velocidad", new AtributoSImple(90));
        p6.addAtributo("edad", new AtributoSImple(70));
        p6.addAtributo("fuerza", new AtributoSImple(80));
        p6.addAtributo("tecnologia", new AtributoSImple(60));
        p6.addAtributo("superpoder", new AtributoSImple(40));
        p6.addAtributo("invisibilidad", new AtributoSImple(80));
        p6.addAtributo("Resitencia", new AtributoOperacion("fuerza","velocidad"));
        p6.addAtributo("Camuflaje", new AtributoCondicional("invisibilidad","fuerza",new AtributoSImple(50), new AtributoSImple(100) ));
        p6.addAtributo("Modernidad", new AtributoCondicional("tecnologia","superpoder",new AtributoSImple(30), new AtributoSImple(10)));

        ComparatorCriterioSimple simple = new ComparatorCriterioSimple("fuerza");
        ComparatorCriterioSimple simple1 = new ComparatorCriterioSimple("invisibilidad");
        ComparatorCriterioSimple simple2 = new ComparatorCriterioSimple("velocidad");
        ComparatorNombre nombre = new ComparatorNombre();


        ComparatorCompuesto compuesto = new ComparatorCompuesto();
        compuesto.addComparator(nombre);
        compuesto.addComparator(simple);
        compuesto.addComparator(simple1);
        compuesto.addComparator(simple2);

        /*1. Enfretamiento con dos personajes con valores de caracteristica en un orden establecido*/
        Juego juego = new Juego();
//        Enfrentable ganador = juego.enfrentar(p1,p2,compuesto);
//        System.out.println(ganador);

        /*2.Enfretamiento de un personaje con una liga. */

        Liga ligaDeLaJusticia = new Liga("wilson", "Liga De La Justicia");
        ligaDeLaJusticia.addIntegrante(p1);
        ligaDeLaJusticia.addIntegrante(p2);
        ligaDeLaJusticia.addIntegrante(p3);
//        Enfrentable ganador = juego.enfrentar(p1,ligaDeLaJusticia,compuesto);
//        System.out.println(ganador);

        /*3. Una liga menor pertenesca a una liga mas grande*/

        List<Enfrentable> ligaMenores = new ArrayList<>();
        ligaMenores.add(p4);
        ligaMenores.add(p5);
        Liga ligaVillanos = new Liga("ariel", "los vengadores",ligaMenores);

        ligaDeLaJusticia.addIntegrante(ligaVillanos);
//        Enfrentable ganador = juego.enfrentar(p1,ligaDeLaJusticia,compuesto);
//        System.out.println(ganador);

        /*4. Obtener todos los personaje/Liga que venga a un personaje dado*/

        juego.addEnfretable(p1);
        juego.addEnfretable(p3);
        juego.addEnfretable(ligaDeLaJusticia);
//        List<Enfrentable> vencedores = juego.getQuienesVencen(p4,compuesto);
//        System.out.println(vencedores);

        /*5. Octener un listado Personaje Acendente o decendente, por multiple criterio. */

        List<Personaje> ordenarliata = juego.ordernarPersonajes(compuesto);
        List<Personaje> reverseOrden = juego.ordernarPersonajes(compuesto.reversed());

        System.out.println(reverseOrden);
        System.out.println(ordenarliata);
    }

}
