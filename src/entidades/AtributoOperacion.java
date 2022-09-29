package entidades;

public class AtributoOperacion implements Atributo{
    protected String key1;
    protected String key2;

    public AtributoOperacion(String key1, String key2){
        this.key1 = key1;
        this.key2 = key2;
    }

    /**Metodo getValor
     * @param e obtenemos de el los valores de los atributos
     * @return devuelve cero 0 en casos que los valores de los atributos sea 0,
     *  o devuelve la divicion de los atributos otenidos.
     * */
    @Override
    public float getValor(Enfrentable e) {
        float a1 = e.getValorAtributo(key1);
        float a2 = e.getValorAtributo(key2);

        return (a1 == 0 || a2 == 0)? 0 : a1 / a2;
    }
}
