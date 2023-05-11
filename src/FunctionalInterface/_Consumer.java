package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Customer maria = new Customer("Maria", "999999");
        greetCustomerConsumer.accept(maria);
        greetCustomerConsumer2.accept(maria,false);
    }
    // Consumer returns nothing (void).  accepts arg
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", "
            + "thanks for registering phone number " + customer.customerPhoneNumber);

    static BiConsumer<Customer,Boolean> greetCustomerConsumer2 = (customer, showNumber) ->
            System.out.println("Hello " + customer.customerName + ", "
                    + "thanks for registering phone number "
                    + (showNumber? customer.customerPhoneNumber: "*".repeat(customer.customerPhoneNumber.length())));


    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
