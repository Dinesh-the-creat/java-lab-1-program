import java.util.Scanner;

class PrimeNumbersCheck 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the integer number");
        int n = scan.nextInt();

        System.out.println("Prime numbers up to " + n);

        for(int i = 2; i <= n; i++)
        {
            boolean isPrime = true;

            for(int j = 2; j <= i / 2; j++)
            {
                if(i % j == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            {
                System.out.println(i);
            }
        }

        scan.close();
    }
}