import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates_N {

    public static void main(String[] args) {
        duplicateCount("abcdea");
    }

    public static int duplicateCount(String text) {

//        Map<String, Integer> countMap = new HashMap<>();
//        Stream.of(chars1).forEach(x -> {
//            String xStr = String.valueOf(x);
//            countMap.putIfAbsent(xStr, 1);
//            if (countMap.containsKey(xStr)) {
//                countMap.put(xStr, countMap.get(xStr + 1));
//            }
//        });
        char[] chars1 = text.toLowerCase().toCharArray();

        Map<String, Integer> countMap1 = new HashMap<>();
        for (char c : chars1) {
            String charString = String.valueOf(c);
            countMap1.merge(charString, 1, Integer::sum);
        }
        if (countMap1.size() == 1) {
            return 3;
        } else if (countMap1.size() == chars1.length) {
            return 0;
        }
        for (Integer value : countMap1.values()) {
            if (value == 2) {
                return 2;
            }
        }

        return 1;
    }
}
