import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = sc.next();
        String[] numArr = num.split("");
        int sum = 0;

        for(int i=0; i< numArr.length; i++){
            sum += Integer.parseInt(numArr[i]);
        }

        System.out.println(sum);
    }
}