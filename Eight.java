import java.util.*;
public class Eight{
    static boolean isMirrorInv(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
 
            if (arr[arr[i]] != i)
                return false;
        }
 
        return true;
    }
 
    public static void main(String[] args)
    {
       // int arr[] = { 1, 2, 3, 0 };
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
        n=sc.nextInt();  
        int arr[] = new int[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        arr[i]=sc.nextInt();  
        }  
        System.out.println("Array elements are: ");  
        
        for (int i=0; i<n; i++)   
        {  
        System.out.println(arr[i]);  
        }  
    
        if (isMirrorInv(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
//output
/*Enter the number of elements you want to store: 4
Enter the elements of the array: 
4
6
3
8
Array elements are: 
4
6
3
8
No
*/