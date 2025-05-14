public class BuggyCalculator {
    private int lastResult = 0;

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int MULTIPLY(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) { // Chýba kontrola delenia nulou
        return a / b;
    }
}