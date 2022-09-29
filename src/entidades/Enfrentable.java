package entidades;

import java.util.Comparator;
import java.util.List;

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
    public Enfrentable enfrentar(Enfrentable e, Comparator c){
        int retorno = c.compare(this , e);
        return (retorno == -1 ) ? e : this;
    }
    /**Ordenar todos los items que obtengar el comparator y devol
     * ver un lista de personaje.
     *
     * */
    public List<Personaje> ordenar(Comparator c) {
        List<Personaje> list = this.getPersonajes();
        list.sort(c);
        return list;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", nombreFantasia: " + nombreFantasia;
    }
}

