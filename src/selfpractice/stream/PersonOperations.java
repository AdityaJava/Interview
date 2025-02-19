package selfpractice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
You have a list of Person objects,
where each Person has a name, age, and city.
Write a Java Stream expression to group the Person objects by their city and,
 for each city, list the names of people in that city in a comma-separated string.


 */
public class PersonOperations {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 25, "Los Angeles"),
                new Person("Charlie", 35, "New York"),
                new Person("David", 28, "Los Angeles"),
                new Person("Eve", 22, "Chicago")
        );

        Map<String, String> stringStringMap = people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.mapping(Person::getName, Collectors.joining(","))));
        Map<String, String> stringStringMap2 = people.stream().collect(Collectors.groupingBy(Person::getCity, Collectors.mapping(Person::getName, Collectors.joining())));

        System.out.println(stringStringMap);
        System.out.println(stringStringMap2);
    }
}
