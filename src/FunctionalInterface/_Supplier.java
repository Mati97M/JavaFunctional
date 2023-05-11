package FunctionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier { //suppliers takes no arg. it just provides (we can get from him)
    public static void main(String[] args) {
        System.out.println(getDBConnectionURLsSupplier.get());
    }
    static Supplier<List<String>> getDBConnectionURLsSupplier = () ->
            List.of(
                    "jdbc:mysql://localhost:3306/mysql",
                    "jdbc:mysql://localhost:3306/UrSql"
            );

}
