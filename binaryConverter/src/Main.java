import java.util.Scanner;
public class Main {

    public static void main(String [] args) {
        int n;
        int power = 0;
        int sum =0;
        int x = 0;
        Scanner sc = new Scanner(System.in);
        while(x==0) {
        System.out.print("\n ( Choose one of these ) \n------------------------\n  b = binary to decimal \n------------------------\n  o = octal to decimal\n------------------------\n \nChoose a letter: ");
        String choose = sc.next();
        System.out.print("Enter number: ");
        n = sc.nextInt();

            switch (choose) {
                case "b" -> {
                    while (n > 0) {
                        int digit = n % 10;
                        int eqPow = (int) Math.pow(2, power);
                        int fin = digit * eqPow;

                        sum = sum + fin;
                        power++;
                        n = n / 10;

                        if (digit != 1 && digit != 0) {
                            System.out.println("Wrong Choose a correct number");
                            sum = 0;
                            break;
                        }
                    }

                    System.out.println("decimal = " + sum);
                    sum = 0;
                    power = 0;
                    System.out.print("Try again ? y/n: ");
                    String reload = sc.next();
                    if ("n".equals(reload)) {
                        x++;
                    }
                }

                case "o" -> {
                    while (n > 0) {
                        int digit = n % 10;
                        int eqPow = (int) Math.pow(8, power);
                        int fin = digit * eqPow;

                        sum = sum + fin;
                        power++;
                        n = n / 10;

                        if (digit == 8 || digit == 9) {
                            System.out.println("Wrong Choose a correct number");
                            sum = 0;
                            break;
                        }
                    }

                    System.out.println("decimal = " + sum);
                    sum=0;
                    power=0;
                    System.out.print("Try again ? y/n: ");
                    String reload = sc.next();
                    if ("n".equals(reload)) {
                        x++;
                    }
                }

                default -> System.out.println("Wrong Choose correct letter");
            }
        }
    }
}