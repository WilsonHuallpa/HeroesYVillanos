package entidades;

public class AtributoCondicional implements Atributo{
    private String key1;
    private String key2;
    private Atributo keyThen;
    private Atributo keyElse;

    public AtributoCondicional(String key1, String key2, Atributo atributoThen, Atributo atributoElse ) {
        this.key1 = key1;
        this.key2 = key2;
        this.keyThen = atributoThen;
        this.keyElse = atributoElse;
    }
    @Override
    public float getValor(Enfrentable e) {
        float a1 = e.getValorAtributo(key1);
        float a2 = e.getValorAtributo(key2);
        return (a1 > a2)?keyThen.getValor(e): keyElse.getValor(e);
    }
}
