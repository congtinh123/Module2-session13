import java.util.TreeMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Khai báo một đối tượng TreeMap để lưu trữ các phần tử .
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        // Với TreeMap các phần tử sẽ được sắp xếp theo thứ tự tăng dần của khóa.
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(3, "Three");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");
        // In ra tất cả các phần tử trong TreeMap.
        System.out.println("Các phần tử có trong TreeMap là: ");
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + " Value: " + treeMap.get(key));
        }
        //Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap. Đối với mỗi phần tử trong mảng, thêm nó vào TreeMap với giá trị (value) là 0, giá trị key sẽ được sắp xếp tăng dần
        int[] array = {1, 2, 3, 4, 5};
        TreeMap<Integer, Integer> treeMap1 = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            treeMap1.put(array[i], 0);
        }
        //Lấy giá trị của phần tử nhỏ nhất trong TreeMap bằng cách sử dụng phương thức firstEntry() của đối tượng TreeMap.
        Integer smallestValue = treeMap1.firstEntry().getValue();
        System.out.println("Giá trị nhỏ nhất trong TreeMap là: " + smallestValue);
        //Xóa phần tử lớn nhất khỏi TreeMap úc này phần tử lớn nhất trong treemap sẽ là phần tử lớn thứ 2 trong mảng ban đầu, ta dùng phương thức lastKey() để lấy nó ra.
        treeMap1.remove(treeMap1.lastKey());
        System.out.println("Các phần tử sau khi xóa phần tử l��n nhất: ");
        for (Integer key : treeMap1.keySet()) {
            System.out.println("Key: " + key + " Value: " + treeMap1.get(key));
        }
        //TreeMap trong Java sắp xếp các khóa (keys) theo thứ tự tăng dần theo mặc định. Tuy nhiên, bạn dùng Comparator.reverseOrder() được sử dụng để tạo một bộ so sánh ngược (đảo ngược) so với thứ tự mặc định, làm cho TreeMap sắp xếp các khóa theo thứ tự giảm dần
        TreeMap<Integer, String> treeMap2 = new TreeMap<>(java.util.Comparator.reverseOrder());
        treeMap2.put(1, "One");
        treeMap2.put(2, "Two");
        treeMap2.put(3, "Three");
        treeMap2.put(4, "Four");
        treeMap2.put(5, "Five");
        System.out.println("Các phần tử có trong TreeMap là: ");

        for (Integer key : treeMap2.keySet()) {
            System.out.println("Key: " + key + " Value: " + treeMap2.get(key));
        }
    }
}