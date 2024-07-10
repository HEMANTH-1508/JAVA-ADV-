public class mat
{
    public static void main(String[] arg)
    {
        int a[]={3,8,7,9,5,6,2};
        int min=a[0];
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("MIN NUMBER IN A ARRAY IS "+min);
    }
}

/*
OUTPUT------
MIN NUMBER IN A ARRAY IS 2
*/
