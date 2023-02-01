import java.util.*;

public class WeightForWeight {

    public static void main(String[] args) {

        String example1 = "56 65 74 100 99 68 86 180 90";
        String example2 = "103 123 4444 99 2000";
        String example3 = "2000 10003 1234000 44444444 9999 11 11 22 123";
        String s = orderWeight(example3);
        System.out.println(s);
    }

    public static String orderWeight1(String string) {
        String[] split = string.split(" ");
        Arrays.sort(split, new Comparator<String>() {
            public int compare(String a, String b) {
                int aWeight = a.chars().map(c -> Character.getNumericValue(c)).sum();
                int bWeight = b.chars().map(c -> Character.getNumericValue(c)).sum();
                return aWeight - bWeight != 0 ? aWeight - bWeight : a.compareTo(b);
            }
        });
        return String.join(" ", split);
    }

    public static String orderWeight(String string) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        String[] numbers = string.split(" ");
        Map<String, Integer> weightThatRepeat = new HashMap<>();
        for (String number : numbers) {
            if (weightThatRepeat.containsKey(number)) {
                weightThatRepeat.put(number, weightThatRepeat.get(number) + 1);
            } else {
                weightThatRepeat.put(number, 1);
            }
        }
        for (String s : numbers) {
            int number = 0;
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                number += Integer.parseInt(String.valueOf(aChar));
            }
            map.put(s, number);
        }

        LinkedHashMap<String, String> sortedMap = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), String.valueOf(x.getValue())));
        StringBuilder sb = new StringBuilder();


        sortedMap.put("whatever", "whatever");
        LinkedList<String> occurMoreThanOnce = new LinkedList<>();
        String checkIfTheSame = "";
        for (Map.Entry<String, String> entry : sortedMap.entrySet()) {
            if (!(entry.getValue().equals(checkIfTheSame))) {
                occurMoreThanOnce.sort(Comparator.naturalOrder());
                for (String s : occurMoreThanOnce) {
                    for (int i = 0; i < weightThatRepeat.get(s); i++) {
                        sb.append(s).append(" ");
                    }
                }
                occurMoreThanOnce.clear();
            }
            occurMoreThanOnce.add(entry.getKey());
            checkIfTheSame = entry.getValue();
        }

        sb.replace(sb.length() - 1, sb.length(), "");
        return sb.toString();
    }

}
