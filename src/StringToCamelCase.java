public class StringToCamelCase {

    public static String toCamelCase(String s) {
        String[] singleWords = new String[0];
        StringBuilder sb = new StringBuilder();
        if (s.contains("-")) {
            singleWords = s.split("-");
        } else if (s.contains("_")) {
            singleWords = s.split("_");
        }
        if (singleWords.length != 0) {
            sb.append(singleWords[0]);
        }
        for (int i = 1; i < singleWords.length; i++) {
            sb.append(String.valueOf(singleWords[i].charAt(0)).toUpperCase());
            sb.append(singleWords[i].substring(1));
        }
        return sb.toString();
    }
}
