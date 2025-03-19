package O;

public class AreaNotCorrect {
    public double calculateArea(String shape, double ... parameters) {
        switch (shape){ // Because of the need to change logic within the class, the class does not comply with the Open Closed Principle
            case "circle": return Math.pow(parameters[0], 2);
            case "rectangle": return Math.pow(parameters[1], 2);
            case "triangle": return Math.pow(parameters[2], 2);
            default: return 0;
        }
    }
}
