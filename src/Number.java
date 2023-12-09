class Number extends ArithmeticExp {
    private int num;

    public Number(int num) {
        this.num = num;
    }
    public int evaluate() {
        return num;
    }
}
