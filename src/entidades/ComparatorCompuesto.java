package entidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorCompuesto implements Comparator<Enfrentable> {
    private List<Comparator> comparators;
    public ComparatorCompuesto() {
        this.comparators = new ArrayList<>();
    }

    public ComparatorCompuesto(List<Comparator> comparators) {
        this.comparators = comparators;
    }
    public boolean addComparator(Comparator c){
        return comparators.add(c);
    }
    public boolean addComparator(Comparator c, int index){
        if (index < 0 || c == null){
            return false;
        }else {
            comparators.add(index,c);
            return true;
        }
    }
    @Override
    public int compare(Enfrentable o1, Enfrentable o2) {
        int valor;
        for (Comparator c: comparators) {
             valor = c.compare(o1,o2);
             if (valor != 0){
                 return valor;
             }
        }
        return 0;
    }
}
