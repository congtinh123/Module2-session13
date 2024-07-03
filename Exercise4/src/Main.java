import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
            //khai báo và khởi tạo HashMap và tạo sữ liệu
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put("Ngoc Phat", 28);
            hashMap.put("Hong Gan", 26);
            hashMap.put("Minh Quan", 30);
            hashMap.put("Ngoc Phuong", 18);
            hashMap.put("Cam Tu", 31);
            //khai báo một HashMap mới và sử dụng putAll để copy dữ liệu từ hashMap c�� sang hashMap m
            HashMap<String, Integer> newHashMap = new HashMap<>();
            newHashMap.putAll(hashMap);
            if (newHashMap.containsKey("Ngoc Phat")) {
                    System.out.println("Key 'Ngoc Phat' có tồn tại trong newHashMap");
            }
            //sử dụng containsKey để kiểm tra key có tồn tại trong hashMap,nếu có trả về true ngược lại false
            System.out.println(newHashMap.containsKey("Ngoc Phat"));
            System.out.println(newHashMap.containsKey("Hai Duong"));
    }
}