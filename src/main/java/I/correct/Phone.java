package I.correct;

public class Phone implements Benchmark, Calculable, Informative {
    @Override
    public void benchmark() {
        System.out.println("Phone can do benchmark");
    }

    @Override
    public void calculateCost() {
        System.out.println("Phone cost can be calculated");
    }

    @Override
    public void info() {
        System.out.println("Phone can show info");
    }
}
