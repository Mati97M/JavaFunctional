package Optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("hello")
                .orElseGet(() -> "default value");

        System.out.println(value);

        Supplier<IllegalStateException> illStExcept = () -> new IllegalStateException();

        try {
            Optional.ofNullable(null)
                    .orElseThrow(illStExcept);
        } catch (Exception e) {
            System.out.println("exception caught");
        }

        Optional.ofNullable("john@gmail.com")
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> {
                            System.out.println("Email is empty");
                        });
        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("Sending email to " + email),
                        () -> {
                            System.out.println("Email is empty");
                        });
    }
}
