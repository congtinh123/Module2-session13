import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Example input array
        String[] arr = {"apple", "banana", "apple", "orange", "banana", "grape", "grape", "pear"};

        // Step 1: Declare a HashMap to store the unique elements and their counts
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Step 2: Traverse each element in the array and update the count in the HashMap
        for (String str : arr) {
            if (hashMap.containsKey(str)) {
                hashMap.put(str, hashMap.get(str) + 1);
                System.out.println("Phần tử " + str + " đã tồn tại trong mảng, giá trị đã tăng thành: " + hashMap.get(str));
            } else {
                hashMap.put(str, 1);
                System.out.println("Phần tử " + str + " đã thêm vào mảng, giá trị ban đầu là: " + hashMap.get(str));
            }
        }

        // Step 3: Traverse the HashMap and store elements with a count of 1 in a new array
        String[] result = new String[hashMap.size()];
        int index = 0;
        for (String key : hashMap.keySet()) {
            if (hashMap.get(key) == 1) {
                result[index++] = key;
            }
        }

        // Step 4: Trim the result array to the correct size
        result = Arrays.copyOf(result, index);

        // Print the result array
        System.out.println("Các phần tử có giá trị bằng 1 trong mảng: " + Arrays.toString(result));
    }
}
