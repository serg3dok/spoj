package tutorials;

import java.util.Scanner;

/**
 * Created by Sergey on 2/4/2016.
 */
public class DIVSUM {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int n = stdin.nextInt();



        for (int i = 0; i < n; i++)
        {
            int result = 0;
            int divisor = 1;
            int number = stdin.nextInt();
            if (number > 2)
            {
                while (divisor < number)
                {
                    if (number%divisor == 0)
                    {
                        result=result+divisor;
                    }
                    divisor++;
                    if (divisor > number/2+1)
                    {
                        break;
                    }
                }
                System.out.println(result);
            }
            else
            {
                System.out.println("1");
            }


        }
    }
}
