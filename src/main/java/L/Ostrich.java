package L;

public class Ostrich extends Bird{
    @Override
    public void fly() { //  According to the Liskov Substitution Principle, methods must be selected according to the class, since sometimes Java allows you to do something that will later lead to an error.
        System.out.println("Ostrich flying");
    }
}
