package entidades;

import java.util.Comparator;

public class ComparatorCriterioSimple implements Comparator<Enfrentable> {
    private String atributo;

    public ComparatorCriterioSimple(String attribute) {
        super();
        this.atributo = attribute;
    }

    @Override
    public int compare(Enfrentable o1, Enfrentable o2) {
        float a1 = o1.getValorAtributo(atributo);
        float a2 = o2.getValorAtributo(atributo);
        if (a1 < a2){
            return -1;
        }else {
            return (a1 > a2)? 1 : 0;
        }
    }
}
