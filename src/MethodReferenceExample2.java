import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodReferenceExample2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carrol",20),
                new Person("Uday","Bhaskar",21),
                new Person("Anna","Carlyle",55)
        );


        System.out.println("Print all persons");
//        performConditionally(people, p -> true, p -> System.out.println(p));
        performConditionally(people, p -> true,System.out::println);
    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for(Person p: people){
            if(predicate.test(p))
                consumer.accept(p);
        }
    }

}