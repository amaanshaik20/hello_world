import java.util.*;
public class Transpose {
    public static void transpose(int matrix[][])
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            for(int i=0;i<matrix.length;i++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9},
                        {10,11,12}};
        transpose(matrix);
    }
}
