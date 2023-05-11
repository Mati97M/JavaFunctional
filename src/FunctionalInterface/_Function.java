package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);

        Integer increment2 = incrementByOneFunction.apply(increment);
        System.out.println(increment2);

        Integer multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        System.out.println(addBy1andThenMultiplyBy10Function.apply(3));

        //BiFunction (2 args)
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));

    }
    static Function<Integer,Integer> incrementByOneFunction = number -> ++number;
    static Function<Integer,Integer> multiplyBy10Function = number -> number*10;
    static Function<Integer,Integer> addBy1andThenMultiplyBy10Function = incrementByOneFunction
            .andThen(multiplyBy10Function);
    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) ->
                    (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOne(int number) {
        return ++number;
    }

}
