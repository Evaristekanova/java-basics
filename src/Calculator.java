public class Calculator {
    public int add (int a, int b) {
        return a + b;
    }

    public double add (double a, double b) {
        return a + b;
    }

    public double add(double[] a) {
        double result = 0;
        for (double el : a){
            result += el;
        }
        return result;
    }

    public int subtract (int a, int b) {
        return a - b;
    }
}
