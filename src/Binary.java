public class Binary extends ArithmeticExp{
    protected ArithmeticExp left;
    protected ArithmeticExp right;
    public Binary(ArithmeticExp left, ArithmeticExp right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int evaluate() {
        return 0;
    }
}
