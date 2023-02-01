import java.util.Arrays;

public class AreTheyTheSame_N {


    public static void main(String[] args) {
        int[] arr0 = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] arr1 = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(arr0, arr1));
    }

    public static boolean comp(int[] a, int[] b) {
//        try {
//            Arrays.sort(a);
//            Arrays.sort(b);
//            int[] arrayToCheck = new int[a.length];
//            for (int i = 0; i < a.length; i++) {
//                int pow = (int) Math.pow(a[i], 2);
//                arrayToCheck[i] = pow;
//            }
//            return Arrays.equals(arrayToCheck, b);
//        } catch (Exception e) {
//            return false;
//        }

        try {
            Arrays.sort(a);
            Arrays.sort(b);
            int[] arrayToCheck = new int[b.length];
            for (int i = 0; i < b.length; i++) {
                int sqrt = (int) Math.sqrt(b[i]);
                arrayToCheck[i] = sqrt;
            }
            return Arrays.equals(arrayToCheck, a);
        } catch (Exception e) {
            return false;
        }
    }
}
