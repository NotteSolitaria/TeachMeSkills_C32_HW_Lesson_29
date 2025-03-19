package O;

public class CircleForCorrect implements ShapeForCorrect{

    @Override
    public double calculateArea(double ... parameters) {
        return parameters[0] * parameters[1];
    }
}
