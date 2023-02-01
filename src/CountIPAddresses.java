public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        long x = IP_AdressToNumber(start);
        long x1 = IP_AdressToNumber(end);
        return x1 - x;
    }

    private static long IP_AdressToNumber(String start) {
        String[] split = start.split("\\.");
        long sum = 0;
        for (int i = 3, k = 1; i >= 0; i--, k *= 256) {
            sum += Long.parseLong(split[i]) * k;
        }
        return sum;
    }
}
