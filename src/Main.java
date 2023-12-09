public class Main {
    public static void main(String[] args) {
        ArithmeticExp equation = new Product(
                new Number(3),
                new Sum(
                        new Number(2),
                        new Number(5)
                )
        );
        System.out.println("Equation: " + equation.toString());
        System.out.println("result: " + equation.evaluate());
    }
}