public class BuggyCalculator {

    // Nepoužívaná premenná, ktorá zaberá pamäť bez účelu.
    private int lastResult = 0;

    // Správne implementovaná metóda na sčítanie dvoch čísel.
    public int add(int a, int b) {
        return a + b;
    }

    // Správne implementovaná metóda na odčítanie dvoch čísel.
    public int subtract(int a, int b) {
        return a - b;
    }

    // Porušenie konvencie pomenovania metód v jazyku Java (camelCase).
    // Názov metódy by mal byť 'multiply' namiesto 'MULTIPLY'.
    public int MULTIPLY(int a, int b) {
        return a * b;
    }

    // Metóda na delenie dvoch čísel.
    // Chýba kontrola delenia nulou, čo môže viesť k výnimke počas behu programu.
    public int divide(int a, int b) {
        return a / b;
    }

    // Komplexná operácia, ktorá kombinuje sčítanie a násobenie alebo odčítanie.
    // Kód je zbytočne zložitý a môže byť ťažšie čitateľný.
    public int complexOperation(int a, int b, int c) {
        int result = a + b;
        if (c > 0) {
            result *= c;
        } else {
            result -= c;
        }
        return result;
    }
}
