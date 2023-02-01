public class GetTheMiddleCharacter {

    public static void main(String[] args) {
        String middle = getMiddle("0000r0000");
        System.out.println(middle);
    }



    public static String getMiddle(String word) {
        int length = word.length();
        if (length % 2 == 0) {
            return word.substring(length/2 - 1, length/2 + 1);
        }
        return word.substring(length/2, length/2 + 1);
    }
}
