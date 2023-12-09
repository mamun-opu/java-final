class Number extends ArithmeticExp {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public int evaluate() {
        return num;
    }
}
