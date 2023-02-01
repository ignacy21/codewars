public class SumOfDigits {

    private static void digital_root_void(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int sum = 0;
        for (char aChar : chars) {
            int integer = Integer.parseInt(String.valueOf(aChar));
            sum += integer;
        }
        if (sum >= 10) {
            digital_root_void(sum);
        }
        System.out.println(sum);
    }
    public static int digitalRootLoop(int n) {
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int sum = 0;
        for (char aChar : chars) {
            int integer = Integer.parseInt(String.valueOf(aChar));
            sum += integer;
        }
        if (sum >= 10) {
            return digitalRootLoop(sum);
        }
        return sum;
    }


    private static int digital_root(int n) {
        int sum = digitalRootHelpMethod(n);
        if (sum >= 10) {
            int sum1 = digitalRootHelpMethod(sum);
            if (sum1 >= 10) {
                return digitalRootHelpMethod(sum1);
            } else {
                return sum1;
            }
        }
        return sum;
    }

    private static int digitalRootHelpMethod(int i) {
        char[] chars = String.valueOf(i).toCharArray();
        int sum = 0;
        for (char aChar : chars) {
            int integer = Integer.parseInt(String.valueOf(aChar));
            sum += integer;
        }
        return sum;
    }

}
