import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //khai báo HashMap thêm phần tử vào
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("three", 2);
        hashMap.put("two", 1);
        hashMap.put("one", 55);
        hashMap.put("four", 33);
        // Tạo một danh sách các cặp key-value từ HashMap.
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        // Collections.sort() để sắp xếp danh sách các phần tử theo giá trị tăng dần của chúng
        Collections.sort(entryList, Comparator.comparingInt(Map.Entry::getValue));
        //Duyệt qua danh sách đã sắp xếp các phần tử và giá trị của chúng sẽ được in theo thứ tự tăng dần.
        for (Map.Entry<String, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}