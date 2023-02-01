import java.math.BigInteger;

public class StringIncrementer {

    public static String incrementString(String str) {
        if (!str.equals("")) {
            char[] chars = str.toCharArray();
            int stringLength = str.length();

            for (int i = stringLength - 1; i >= 0; i--) {
                try {
                    try {
                        BigInteger testIfNumber = new BigInteger(str);
                        return convertNumberToStringNumberWithAllZerosNeeded(str);
                    } catch (NumberFormatException ignored) {}
                    Integer.parseInt(String.valueOf(chars[i]));
                } catch (NumberFormatException numberFormatException) {
                    if (i == stringLength - 1) {
                        return str + 1;
                    }
                    String substring = str.substring(i + 1);
                    String incrementNumber = convertNumberToStringNumberWithAllZerosNeeded(substring);
                    return str.substring(0, i + 1) + incrementNumber;
                }
            }
        }
        return str + 1;
    }

    private static String convertNumberToStringNumberWithAllZerosNeeded(String str) {
        int stringLength = str.length();
        BigInteger incrementNumber = new BigInteger(str).add(BigInteger.ONE);
        int numberLength = String.valueOf(incrementNumber).length();
        int x1 = stringLength - numberLength;
        if (x1 > 0) {
            return "0".repeat(x1) + incrementNumber;
        }
        return String.valueOf(incrementNumber);
    }
}

// ""
// 3
// 2319
// 2309
// 002
// 09
// 9
// 17263012837460236472869
// scoop321
// scoop09321
// foo032721483741092734019231



