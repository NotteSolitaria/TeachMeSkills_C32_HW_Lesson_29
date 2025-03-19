package I;

public class Phone implements DeviceCapabilities{
    @Override
    public void costCalculate() {
        System.out.println("Phone cost can be calculated");
    }

    @Override
    public void info() {
        System.out.println("Phone can show info");
    }

    @Override
    public void benchmark() {
        System.out.println("Phone can do benchmark");
    }
}
