/* Question:

Write a Java program to check whether a given array is sorted in ascending order. */
class GFG{
    public static void main(String[] args)
    {
    int arr[] = {1, 2, 3, 4, 5};
    if(isSorted(arr))
    {
        System.out.println("THE ARRAY IS SORTED");
    }
    else{
        System.out.println("THE ARRAY IS NOT SORTED");
    }
    }
    
    public static boolean isSorted(int arr[])
    {
        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }
}
