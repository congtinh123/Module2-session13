import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 4, 5, 5, 3, 26, 7, 5, 7};
        System.out.println(countShow(array));
        Map<Integer, Integer> show = countShow(array);
        Set<Integer> keySet = show.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + show.get(key));
        }
    }

    public static Map<Integer, Integer> countShow(int[] array) {
        Map<Integer, Integer> cont = new HashMap<>();
        for (int e : array) {
            if (cont.containsKey(e)) {
                cont.put(e, cont.get(e) + 1);
            } else cont.put(e, 1);
        }
        return cont;
    }
}