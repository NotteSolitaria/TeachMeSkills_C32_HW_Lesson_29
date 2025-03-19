package I.correct;

public class Watch implements Informative, Calculable {
    @Override
    public void calculateCost() {
        System.out.println("Watch cost can be calculated");
    }

    @Override
    public void info() {
        System.out.println("Watch can show info");
    }
}
