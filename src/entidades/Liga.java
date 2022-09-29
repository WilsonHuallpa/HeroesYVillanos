package entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

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

    /**Metodo addIntegrantes agrega un objeto tipo Enfrentable.
     * @param e objeto a gregar.
     * @return true si se agrego, false si el objeto es nulo.
     * */
    public boolean addIntegrante(Enfrentable e){
        return (e != null ) ? integrantes.add(e) : false;
    }

    /**Metodo getValorAtributo obtiene el valor del atributo pasado por parametro.
     * @param key nombre del atributo
     * @return Un promedio de los valores del atributo especifico de cada integrantes.
     * */
    @Override
    public float getValorAtributo(String key) {
         return  (float) integrantes.stream()
                    .mapToDouble(a -> a.getValorAtributo(key))
                    .average().orElse(0);

    }
    /**Metodo getPersonaje
     * @return Listado de personajes que se encuentran en la liga.
     * */
    @Override
    protected List<Personaje> getPersonajes() {
        return integrantes.stream().map(Enfrentable::getPersonajes)
                                    .flatMap(List::stream)
                                    .distinct()
                                    .collect(Collectors.toList());
    }
}
