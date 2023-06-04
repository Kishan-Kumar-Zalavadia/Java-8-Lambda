import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseSolutionJava8 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carrol",20),
                new Person("Uday","Bhaskar",21),
                new Person("Anna","Carlyle",55)
        );

        //Step-1: Sort List by Last name
        Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Step-2: Create a method that prints all elements in the List
        System.out.println("Print all persons");
        performConditionally(people, p -> true, p -> System.out.println(p));

        //Step-3: Create a method that prints all people that have last name beginning withC
        System.out.println("Print all persons whose last name begins with 'C'");
        performConditionally(people,p -> p.getLastName().startsWith("C"), p -> System.out.println(p));

        System.out.println("Print fist name of all persons whose first name begins with 'U'");
        performConditionally(people, p -> p.getFirestName().startsWith("U"), p -> System.out.println(p.getFirestName()));
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p: people){
            if(predicate.test(p))
                consumer.accept(p);
        }
    }

}