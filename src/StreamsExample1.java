import java.util.Arrays;
import java.util.List;

public class StreamsExample1 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carrol",20),
                new Person("Uday","Bhaskar",21),
                new Person("Anna","Carlyle",55)
        );

        people.stream()
                .filter(p-> p.getLastName().startsWith("C"))
                .forEach(p-> System.out.println(p.getFirestName()));

        long count = people.stream()
                .filter(p-> p.getLastName().startsWith("C"))
                .count();

        System.out.println(count);

        long count2  = people.parallelStream()
                .filter(p-> p.getLastName().startsWith("C"))
                .count();

        System.out.println(count2);
    }
}
