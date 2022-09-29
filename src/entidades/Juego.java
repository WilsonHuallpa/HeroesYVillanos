package entidades;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public final class Juego{
    private List<Enfrentable> enfrentables;

    public Juego() {
        this.enfrentables = new ArrayList<>();
    }

    /**Metodo lista a todos los personaje/ligas que venza aun personaje dado por un criterio.
     * @param e
     * @param c
     * @return lista de Enfrentable
     * */
    public List<Enfrentable> getQuienesVencen(Enfrentable e, Comparator<Enfrentable> c){
        return enfrentables.stream()
                .filter(preventable -> c.compare(preventable,e) == 1)
                .collect(Collectors.toList());

       /* List<Enfrentable> list = new ArrayList<>();
        for (Enfrentable enfrentable: enfrentables) {
            int value = c.compare(enfrentable,e);
            if ( value == 1){
                list.add(enfrentable);
            }
        }
        return list;*/
    }
    /**Metodo decide quien es el vencedor de una disputa acorde a un criterio.
     * @param  e1
     * @param e2
     * @param c
     * @return un enfrentable.
     * */
    public Enfrentable enfrentar(Enfrentable e1, Enfrentable e2, Comparator c){
      return e1.enfrentar(e2,c);
    }

    public boolean addEnfretable(Enfrentable e){
        return this.enfrentables.add(e);
    }
    /**Metodo de ordenerPersonaje debemos de ver que criterio podemos ordenarlo
     * @param c
     * @return lista de Personajes.
     * */
    public List<Personaje> ordernarPersonajes(Comparator<Enfrentable> c){

        List<Personaje> lista = new ArrayList<>();
        for (Enfrentable enfrentable: enfrentables) {
            lista.addAll(enfrentable.ordenar(c));
        }
        lista.sort(c);
        return lista;
       // return enfrentables.stream().map(Enfrentable::getPersonajes).distinct().sorted(c).collect(Collectors.toList())
    }

}
