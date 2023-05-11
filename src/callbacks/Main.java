package callbacks;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        hello("John",null,val ->
                System.out.println("last name not provided for " + val));
        helloRun("John",null,() ->
                System.out.println("last name not provided."));


    }
    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void helloRun(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
