package entidades;

public class AtributoOperacion implements Atributo{
    protected String key1;
    protected String key2;

    public AtributoOperacion(String key1, String key2){
        this.key1 = key1;
        this.key2 = key2;
    }

    @Override
    public float getValor(Enfrentable e) {
        float a1 = e.getValorAtributo(key1);
        float a2 = e.getValorAtributo(key2);

        return (a1 == 0 || a2 == 0)? 0 : a1 / a2;
    }
}
