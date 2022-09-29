package entidades;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Enfrentable{

    protected String nombre;
    protected String nombreFantasia;

    public Enfrentable(String nombre, String nombreFantasia) {
        super();
        this.nombre = nombre;
        this.nombreFantasia = nombreFantasia;
    }
    public String getNombre() {
        return nombre;
    }

    public String getNombreFantasia() {
        return nombreFantasia;
    }

    public abstract float getValorAtributo(String key);
    protected abstract List<Personaje> getPersonajes();

    /**
    * Es metodo se encarga de enfrentar dos personaje o ligas}
    * @param e es un enfrentable
    * @param c es un comparator
    * @return Enfrentable
    * */
    public Enfrentable enfrentar(Enfrentable e, Comparator<Enfrentable> c){
        return (c.compare(this , e) == -1 ) ? e : this;
    }
    /**Ordenar todos los items que obtengar el comparator y devol
     * ver un lista de personaje.
     *
     * */
    public List<Personaje> ordenar(Comparator<Enfrentable> c) {
        return this.getPersonajes().stream().distinct().sorted(c).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", nombreFantasia: " + nombreFantasia;
    }
}

