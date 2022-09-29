package entidades;

public class AtributoSImple implements Atributo {
    private float value;

    public AtributoSImple(float value) {
        this.value = value;
    }

    /**Metodo getValor devuelve el el valor del atributo
     * @param e no hace nada pero el metodo esta implementado asi.
     * @return devuelve el valor del atributo value.
     * */
    @Override
    public float getValor(Enfrentable e) {
        /*Preguntar a nestor*/
       float atributo1 = this.value;
        return atributo1;
    }
    /**Metodo set valor
     * @param value modifica el valor del atributo value
     * */
    public void setValor(float value) {
        this.value = value;
    }


}
