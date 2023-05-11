package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Person.Gender.FEMALE;
import static imperative.Main.Person.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John",MALE),
            new Person("Maria", FEMALE),
            new Person("Aisha", FEMALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE)
        );

        //imperative approach -> implements all details. How sth should be done?
        //Declarative approach - what should be done

        //print all females
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);

        List<Person> females = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        females.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "People{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        enum Gender {
            MALE, FEMALE
        };
    }
}


