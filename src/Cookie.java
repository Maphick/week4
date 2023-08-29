public class Cookie {
    public static void main(String[] args) {
        noReturn();
        System.out.println(sum(2, 3));
    }

    private static void noReturn() {
        System.out.println("No return");
    }

    private static int sum(int a, int b){
        return a + b;
    }
}
