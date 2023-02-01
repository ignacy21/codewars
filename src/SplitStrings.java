public class SplitStrings {


    public static String[] solution(String s) {
        int length = s.length();
        if (length % 2 != 0) {
            length++;
            s += "_";
        }
        String[] pairs = new String[length/2];
        for (int i = 0, index = 0; index < length/2; i += 2, index++) {
            pairs[index] = s.substring(i, i + 2);
        }

        return pairs;
    }
}
