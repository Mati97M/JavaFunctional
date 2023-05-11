package FunctionalInterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValidPredicate.test("08400"));
        System.out.println(isPhoneNumberValidPredicate.test("084008"));
        System.out.println(containsNumber3.test("084008"));
        System.out.println(containsNumber3.test("3084008"));
        System.out.println(
                "isPhoneNumberValid and containsNumber3:\t" +
                isPhoneNumberValidPredicate.and(containsNumber3).test("12345")
        );

        System.out.println(
                "isPhoneNumberValid and containsNumber3:\t" +
                        isPhoneNumberValidPredicate.and(containsNumber3).test("08333")
        );

        System.out.println(
                "isPhoneNumberValid or containsNumber3:\t" +
                        isPhoneNumberValidPredicate.or(containsNumber3).test("3")
        );
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("08") && phoneNumber.length() == 5;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
