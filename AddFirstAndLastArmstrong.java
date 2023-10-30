import java.io.*;
import java.util.*;

public class Solution {
    public static int countDigit(int n)
    {
        int count=0;
        while(n > 0)
        {
            count++;
            n/=10;   
        }
        return count;
    }
   
    public static int isArmstrong(int num)
    {
        int dig=countDigit(num);
        int num2=num;
        int armstrong=0;
        while(num > 0 )
        {
            int rem=num % 10;
            armstrong+=Math.pow(rem,dig);
            num/=10;
        }
        if(armstrong!=num2)
            return 0;
        return 1;
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int first=0,last=0;
        for(int i=start;i<=end;i++)
        {
            int num=isArmstrong(i);
            if(num==1)
            {
               if(first==0)
               {
                   first=i;
               }else{
                   last=i;
               }
            }
        }
        System.out.println(first+last);
    }
}
