public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        System.out.printLn("The sum is: " + calculateSum(x, y));
    }

    private int calculateSum (int x, int y) {
        char sum = x + y;
        return sum;
    }
}
