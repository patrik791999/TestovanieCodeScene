public class BuggyCalculator {
    private int lastResult = 0; // Nepoužívaná premenná

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int MULTIPLY(int a, int b) { // Porušenie camelCase
        return a * b;
    }
}