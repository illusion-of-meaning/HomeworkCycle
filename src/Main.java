public class Main {
    public static void main(String[] args) {
        // 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 3
        for (int i = 0; i <= 17; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }
}