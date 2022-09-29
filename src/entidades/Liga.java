package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Liga extends Enfrentable {
    private List<Enfrentable> integrantes;

    public Liga(String nombre, String nombreFantasia, List<Enfrentable> integrantes) {
        super(nombre, nombreFantasia);
        this.integrantes = integrantes;
    }

    public Liga(String nombre, String nombreFantasia) {
        super(nombre, nombreFantasia);
        this.integrantes = new ArrayList<>();
    }
    /*Que un liga pertenesca a una liga mas grande.
     * Poder agregar tanto personaje como liga.*/
    public boolean addIntegrante(Enfrentable e){
        if (e != null){
            if (e instanceof Personaje){
                return integrantes.add(e);
            }else if (e instanceof Liga){
                for (Enfrentable integrante: ((Liga) e).integrantes) {
                    integrantes.add(integrante);
                }
                return true;
            }
        }
        return false;
    }

    /* Recore un lista de enfrentable.*/
    @Override
    public float getValorAtributo(String key) {
        float sum = 0;
        Integer size = integrantes.size();
        for (Enfrentable e: integrantes) {
            sum += e.getValorAtributo(key);
        }
        return sum / size ;
    }
    /*Aplicar funcionalidad */
    /* Podemos rertornar una exepcion de lista null.*/
    @Override
    protected List<Personaje> getPersonajes() {
        List<Personaje> listaPersonaje = null;
        if (integrantes.size() > 0){
            listaPersonaje = new ArrayList<>();
            for (Enfrentable e: integrantes) {
                if (e instanceof Personaje){
                    listaPersonaje.add((Personaje)e);
                }
            }
        }
        return listaPersonaje;
    }

}
