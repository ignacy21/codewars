public class CreditCardMask {

    public static String maskify(String str) {
        int length = str.length();
        if (length <= 4) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("#".repeat(length - 4));
        sb.append(str.substring(length - 4));
        return sb.toString();
    }
}
