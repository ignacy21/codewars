public class WhoLikesIt {

    public static String whoLikesIt(String... names) {
        int length = names.length;
        String like = " like this";
        String coma = ", ";
        String and = " and ";

        StringBuilder sb = new StringBuilder();
        return switch (length) {
            case 0 -> "no one likes this";
            case 1 -> String.valueOf(sb.append(names[0]).append(" likes this"));
            case 2 -> String.valueOf(sb.append(names[0]).append(and).append(names[1]).append(like));
            case 3 -> String.valueOf(sb.append(names[0]).append(coma).append(names[1]).append(and).append(names[2]).append(like));
            default -> String.valueOf(sb.append(names[0]).append(coma).append(names[1])
                    .append(othersWhoLikeThis(length - 2)));
        };
    }
    private static String othersWhoLikeThis(int numberOfPeopleWhoLikeThisAcceptPreviousTwo) {
        return " and " + numberOfPeopleWhoLikeThisAcceptPreviousTwo + " others like this";
    }
}
