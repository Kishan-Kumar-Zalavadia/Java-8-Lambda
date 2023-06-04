public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args){
        Greeter greeter = new Greeter();
        Greeting lambdaGreeting = () -> System.out.println("JSK!");

        //anonymous inner class
        Greeting innerClassGreeting = new Greeting(){
            public void perform(){
                System.out.println("JSK!");
            }
        };



        greeter.greet(() -> System.out.println("JSK!"));
        greeter.greet(innerClassGreeting);
    }
}
