package lab_sheet_3;

class MathOperation {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Experiment_3 {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println("add(5, 10) → " + m.add(5, 10));
        System.out.println("add(5, 10, 15) → " + m.add(5, 10, 15));
        System.out.println("add(5.5, 4.5) → " + m.add(5.5, 4.5));
    }
}
