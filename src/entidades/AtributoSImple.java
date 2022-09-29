package entidades;

public class AtributoSImple implements Atributo {
    private float value;

    public AtributoSImple(float value) {
        this.value = value;
    }

    @Override
    public float getValor(Enfrentable e) {
       float atributo1 = this.value;
        return atributo1;
    }

    public void setValor(float value) {
        this.value = value;
    }


}
