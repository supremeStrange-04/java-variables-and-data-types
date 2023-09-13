public class SwapNum {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("The values of a and b before swapping is " + a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The values of a and b after swapping is " + a + " " + b);
    }
}
