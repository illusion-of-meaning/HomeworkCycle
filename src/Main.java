public class Main {
    public static void main(String[] args) {
        {
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

        {
            // 1
            for (int i = 1904; i <= 2096; i += 4) {
                System.out.println(i + " год является високосным");
            }

            // 2
            for (int i = 1; i <= 14; i++) {
                System.out.println(7 * i);
            }

            //3
            int tmp = 1;
            for (int i = 1; i < 10; i++) {
                System.out.println(tmp *= 2);
            }
        }

        {
            // 1
            int salary = 29000;
            int total = 0;
            for (int i = 0; i < 12; i++) {
                total += salary;
            }
            System.out.println(total);

            // 2
            salary = 29000;
            total = 0;
            for (int i = 0; i < 12; i++) {
                total += total/100;
                total += salary;
                System.out.println(String.format("Месяц %d, сумма накоплений равна %d",i+1 ,total));
            }
        }
    }
}