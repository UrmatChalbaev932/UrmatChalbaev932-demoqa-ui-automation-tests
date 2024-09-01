import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _17_Stream {
    public static void main(String[] args) {
//
//        List<String> list = new ArrayList<>();
//        list.add("U");
//        list.add("r");
//        list.add("m");
//        list.add("a");
//        list.add("t");
//        Stream<String> stream = list.stream();
//
//
//        // пример без потока/ stream:
//        int[] arr = {50, 60, 100, 70, 80, 90, 110};
//        int count = 0;
//        for (int x : arr) {
//            if (x >= 90) continue;
//            x += 10;
//            count++;
//            if (count > 3) break;
//            System.out.println(x);
//        }
//        // пример с потоком/stream:
//        IntStream.of(50, 60, 100, 70, 80, 90, 110).filter(x -> x < 90)
//                .map(x -> x + 10).limit(3).forEach(System.out::println);
//
//
//        Map<Integer, String> map = new LinkedHashMap<>();
//        map.put(30, "Urmat");
//        map.put(24, "Badam");
//        map.put(12, "Max");
//        List list1 = new ArrayList(map.entrySet().stream().filter(x -> x.getKey() >= 20).map(Map.Entry::getValue).toList());
//        System.out.println(list1);
//
//
//        int[] nums = {10, 3, 5, 6};
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int f = 0; f < nums.length; f++) {
//                if (nums[i] < nums[f]) {
//                    int a = nums[i];
//                    nums[i] = nums[f];
//                    nums[f] = a;
//                }
//            }
//        }
//
//        int aa = nums[nums.length - 1] - nums[0];
//        System.out.println(aa);


        int [] array = {5,6,45,99,13,5,6};
        System.out.println(ar(array, 3));
    }

    public static boolean ar (int[] nums, int len){
        boolean bl = false;
        for(int i =0; i<len; i++) {
            if (nums[i] == nums[(nums.length - len) + i]) {
                bl = true;
            }
        }
        return bl;
    }

}
