import java.util.Arrays;

public class A_Main {

    public static void main(String[] args) {

        double[] tribonacci = TribonacciSequence.tribonacci(new double[]{1, 1, 1}, 1000);
        System.out.println(Arrays.toString(tribonacci));

        String toCamelCase = StringToCamelCase.toCamelCase("You_have_chosen_to_translate_this_kata_For_your_convenience_we_have_provided_the_existing_test_cases_used_for_the_language_that_you_have_already_completed_as_well_as_all_of_the_other_related_fields");
        System.out.println(toCamelCase);

        String rqaEzty = Mumbling.accum("RqaEzty");
        System.out.println(rqaEzty);

        String skippy = CreditCardMask.maskify("Skippy");
        System.out.println(skippy);

        int i1 = SumOfDigits.digitalRootLoop(123419982);
        System.out.println("digitalRootLoop: " + i1);

        String[] strings = BuildTower.towerBuilder(20);
        for (String string : strings) {
            System.out.println(string);
        }

        String s = "abc";
        SplitStrings.solution(s);

        System.out.println(CountIPAddresses.ipsBetween("10.0.0.0", "10.0.0.50"));
        System.out.println(CountIPAddresses.ipsBetween("10.0.0.0", "10.0.1.0"));
        System.out.println(CountIPAddresses.ipsBetween("20.0.0.10", "20.0.1.0"));

        System.out.println(StringIncrementer.incrementString("udhafjhalbd36196288817142840350615"));

    }
}
