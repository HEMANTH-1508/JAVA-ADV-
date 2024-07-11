import java.util.*;

public class Basic
{
    public static void main(String[] args)
    {
        int mat1[][]={{1,2},{3,4}};
        int mat2[][]={{5,6},{7,8}};
        int mat3[][]=new int[2][2];
        int a=mat1.length;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("ADDITION OF TWO MATRIX IS : ");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print("\t"+mat3[i][j]);
            }
            System.out.println(" ");
        }
    }
}


/*
OUTPUT-----------
ADDITION OF TWO MATRIX IS : 
	6	8 
	10	12 
*/
