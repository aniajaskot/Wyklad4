public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.sumAndReturn(2, 5);// oblicza - wynik można użyć ponownie
        System.out.println(sum);// wyświetla

        calculator.sumAndShow(3,6); // oblicza i wyświetla
        double multiply = calculator.multiply(2, 2);
        System.out.println(multiply);
        calculator.subtractAndShow(5,2);

    }
}
