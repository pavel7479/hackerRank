import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        System.out.println(list);
        int count = 0;
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                System.out.println("i =  " + i + " list(i) = " + list.get(i));
                System.out.println("j = " + j + " list(j) = " + list.get(j));
                System.out.println();
                if (list.get(i) == list.get(j)) {
                    System.out.println(list.get(i) + " " + list.get(j));
                    list.remove(i);
                    list.remove(j);
                    count++;

                }
            }
        }
        System.out.println(list);
        System.out.println(count);
    }
}
