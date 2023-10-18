// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;
public class Main {
    public static void subArrays(int numbers[])
    {
        int sum;
        int min=numbers[0];
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+numbers[k];
                }
                System.out.print(sum+" ");
                if(max<sum)
                    max=sum;
                else if(min>sum)
                    min=sum;
            }
            System.out.println();
        }
        System.out.println("minimum value of subArray is:"+ min);
        System.out.println("maximum value of subArray is:"+ max);
    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
        subArrays(numbers);
    }
}