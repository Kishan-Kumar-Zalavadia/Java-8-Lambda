import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carrol",20),
                new Person("Uday","Bhaskar",21),
                new Person("Anna","Carlyle",55)
        );

        //Step-1: Sort List by Last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        //Step-2: Create a method that prints all elements in the List
        System.out.println("Print all persons");
        printAll(people);

        //Step-3: Create a method that prints all people that have last name beginning withC
        System.out.println("Print all persons whose last name begins with 'C'");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println("Print all persons whose first name begins with 'U'");
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getFirestName().startsWith("U");
            }
        });
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for(Person p: people){
            if(condition.test(p))
                System.out.println(p);
        }
    }

    private static void printAll(List<Person> people) {
        for(Person p: people){
            System.out.println(p);
        }
    }
}
interface Condition{
    boolean test(Person p);
}