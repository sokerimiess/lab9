import java.util.Scanner;

public class binomial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int n = scanner.nextInt();
        System.out.print("k: ");
        int k = scanner.nextInt();
        scanner.close();

        int result = calculation(n, k);
        System.out.println(result);
    }
    public static int calculation(int n, int k)
    {
        if (k == 0 || k == n)
        {
            return 1;
        } else {
            return calculation(n - 1, k - 1) + calculation(n - 1, k);
        }
    }
}