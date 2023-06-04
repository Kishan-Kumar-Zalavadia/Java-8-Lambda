import java.util.Arrays;
import java.util.List;

public class CollectionIteratorExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carrol",20),
                new Person("Uday","Bhaskar",21),
                new Person("Anna","Carlyle",55)
        );
        System.out.println("Using for loop");
        for(int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }

        System.out.println("\nUsing for in loop");
        for(Person p: people){
            System.out.println(p);
        }

        //Above two iterators are called external iterators.

        //Internal iterator
        System.out.println("\nUsing lambda for each loop");
        people.forEach(System.out::println);

    }
}
