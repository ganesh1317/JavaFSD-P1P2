package LIS;
import java.util.Scanner;
 
// Class  LIS
public class  LIS
{
    // function LIS
    public int[] lis(int[] arr)
    {        
        int n = arr.length - 1;
        int[] obj1 = new int[n + 1];  
        int[] obj2 = new int[n + 1]; 
        int Large = 0;
 
        for (int i = 1; i < n + 1; i++)
        {
            int j = 0;
 
            
            for (int pos = Large ; pos >= 1; pos--)
            {
                if (arr[obj1[pos]] < arr[i])
                {
                    j = pos;
                    break;
                }
            }            
            obj2[i] = obj1[j];
            if (j == Large || arr[i] < arr[obj1[j + 1]])
            {
                obj1[j + 1] = i;
                Large = Math.max(Large,j + 1);
            }
        }
  
        int[] result = new int[Large];
        int pos = obj1[Large];
        for (int i = Large - 1; i >= 0; i--)
        {
            result[i] = arr[pos];
            pos = obj2[pos];
        }
        return result;             
    }
 
    // Main Function 
    public static void main(String[] args) 
    {    
        Scanner scan = new Scanner(System.in);
        System.out.println("Longest Increasing Subsequence\n");
 
        System.out.println("Enter number of elements");
        int n = scan.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("\nEnter "+ n +" elements");
        for (int i = 1; i <= n; i++)
            arr[i] = scan.nextInt();
 
        LIS obj = new LIS(); 
        int[] result = obj.lis(arr);       
        
        scan.close();
 
        // print result
 
        System.out.print("\nLongest Increasing Subsequence : ");
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] +" ");
        System.out.println();
    }

}