import java.util.Scanner;

public class UsingVariablesWithScanner {
    public static void main(String[] args) {
        double a = 10;
        double b = 23;
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        String d = scanner.next();
        boolean e = scanner.nextBoolean();
        System.out.println(a / b);
        System.out.println(c + " " + d + " " + e);


    }

}
