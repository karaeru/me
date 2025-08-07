
package tugas;

import java.util.ArrayList;

public class nestedArrTest {
    public static void main(String[] args) {
        
        ArrayList<String> roti = new ArrayList<>();
        roti.add("Donut");
        roti.add("Roti Sobek");
        roti.add("holand Bakerty");
        
        ArrayList<String> minuman = new ArrayList<>();
        minuman.add("Susu");
        minuman.add("Teh");
        minuman.add("Kopi");
        
        
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        list.add(roti);
        list.add(minuman);
        
        System.out.println(roti.get(0));
        System.out.println(roti);
        
        System.out.println("");
        
        System.out.println(minuman.get(0));
        System.out.println(minuman);
        
        System.out.println("");
        System.out.println(list.getLast().getLast());
    }
}
