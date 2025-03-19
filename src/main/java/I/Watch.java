package I;

public class Watch implements DeviceCapabilities{
    @Override
    public void info() {
        System.out.println("Watch can show info");
    }

    @Override
    public void costCalculate() {
        System.out.println("Watch cost can be calculated");
    }

    @Override
    public void benchmark() {
        throw new UnsupportedOperationException("Not supported yet."); // Due to the non-applicability of the method from the interface, this class does not comply Interface Segregation Principle
    }
}
