public class SumOfProducts 
{
    public static int sumOfProducts(int[] array1, int[] array2) 
    {
        if (array1.length != array2.length) 
        {
            throw new IllegalArgumentException("Arrays must have the same length");
        }

        int sum = 0;
        for (int i = 0; i < array1.length; i++) 
        {
            sum += array1[i] * array2[i];
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};
        int sum = sumOfProducts(array1, array2);
        System.out.println("Sum of products: " + sum);
    }
}

/*
OUTPUT------
  Sum of products: 32
*/
