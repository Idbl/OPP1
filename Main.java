package pakiet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {

    static class NapojeComparator implements Comparator<Napoje> {
        @Override
        public int compare(Napoje o1, Napoje o2) {
            int compareResult = o1.getNazwa().compareTo(o2.getNazwa());
            if (compareResult != 0){
                return compareResult;
            }
            else {
                compareResult = o1.getClass().getName().compareTo(o2.getClass().getName());
                return compareResult;
            }
        }
    }

    public static void main(String[] args) {

        Woda w1 = new Woda("a");
        Sok s1 = new Sok("b");
        Oranżada o1 = new Oranżada("c");

        List<Napoje> lista = new ArrayList<>();

        lista.add(w1);
        lista.add(s1);
        lista.add(o1);
        lista.add(new Woda("d"));
        lista.add(new Sok("a"));
        lista.add(new Sok("c"));

        for (Napoje x : lista){
            x.pij();
        }

        lista.sort(new Comparator<Napoje>() {
            @Override
            public int compare(Napoje o1, Napoje o2) {
                int compareResult = o1.getNazwa().compareTo(o2.getNazwa());
                if (compareResult != 0){
                    return compareResult;
                }
                else {
                    compareResult = o1.getClass().getName().compareTo(o2.getClass().getName());
                    return compareResult;
                }
            }
        });

        for (Napoje x : lista){
            System.out.println(x);
        }

        KochajacyProgramowac kp = new KochajacyProgramowac() {
            public void programuj(){
                System.out.println("programuje");
            }
        };

        kp.programuj();


    }
}