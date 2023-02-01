public class Mumbling {

    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(String.valueOf(s.charAt(i)).toUpperCase());
            sb.append(String.valueOf(s.charAt(i)).toLowerCase().repeat(i));
            if (i == s.length() - 1) {
                return sb.toString();
            }
            sb.append("-");
        }
        return null;
    }
}
