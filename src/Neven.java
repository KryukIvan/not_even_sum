import java.util.Scanner;

public class Neven {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите положительное число: ");
        int n = in.nextInt();
        if (n>0) {
            int arr [];
            int sum;
            sum = 0;
            arr = new int[n+1];
            int length = arr.length;
            for ( n = 1; n < arr.length; n+=2) {
                sum = sum + n;
            //   System.out.println(sum);
            }
            System.out.print("Сумма нечетных чисел: " + sum);
        }
        else {
            System.out.print("Число должно быть больше нуля!");
        }
    }
}
