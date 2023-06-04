public class Person {
    private String firestName;
    private String lastName;
    private  int age;

    public Person(String firestName, String lastName, int age) {
        super();
        this.firestName = firestName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirestName() {
        return firestName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirestName(String firestName) {
        this.firestName = firestName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firestName='" + firestName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
