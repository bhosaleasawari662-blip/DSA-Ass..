import java.util.*;

class Demo{
public static void main(String[]args){
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int num : arr) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    for (int num : arr) {
        if (map.get(num) == 1) {
            System.out.print(num + " ");
        }
    }
}
}