package tutorials.test;

/**
 * Created by Sergey on 2/8/2016.
 */
public class test01 {
    public static void main(String[] args) {
        System.out.println(calc(10));
    }

    public static int calc(int num)
    {
        if (num > 0) {
            System.out.println(num);
            calc(num-1);
            System.out.println(num);
        }

        return num;
    }
}
