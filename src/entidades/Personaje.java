package entidades;

import java.util.*;

public class Personaje extends Enfrentable {
    private Map<String, Atributo> atributos;
    public Personaje(String nombre, String nombreFantasia){

        super(nombre,nombreFantasia);
        atributos = new HashMap<>();

    }
    /**Metodo getValorAtributo
     * @param key es el nombre del atributo buscado
     * @return El valor del atributo, en caso no encontrarse 0.
     * */
    public float getValorAtributo(String key){
        Atributo atributo;
        atributo = atributos.get(key);
        if (atributo != null){
            return atributo.getValor(this);
        }
        return 0;
    }
    /**Metodo getPersona
     * @return lista personaje consigo mismo.
     */
    protected List<Personaje> getPersonajes(){
        List<Personaje> listPersonaje = new ArrayList<>();
        listPersonaje.add(this);
        return listPersonaje;
    }
    /**Metodo addAtributo
     * ..Continuar.....
     *...ver como mejorar mi documentacion.
     * */
    public boolean addAtributo(String k, Atributo a){
        return this.atributos.put(k, a) != null;
    }

    @Override
    public String toString() {
        String retorno = super.toString() + "\n";
        Iterator it = atributos.keySet().iterator();
        while(it.hasNext()){
            String key = (String) it.next();
            retorno += "Clave: " + key + " -> Valor: " + getValorAtributo(key) + "\n";
        }
        return retorno;
    }
}
