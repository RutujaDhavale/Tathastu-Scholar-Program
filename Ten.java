import java.util.*;
  
public class Ten
{
   public static void main(String args[])
   {
      int row, col,i,j,temp,n;
      Scanner s = new Scanner(System.in);
 
      System.out.println("Enter the number of rows");
      row = s.nextInt();
     
      System.out.println("Enter the number of columns");
      col  = s.nextInt();
    if(row >col)
     n=row;
    else
     n= col;
      int matrix1[][] = new int[n][n]; 
 
 
      System.out.println("Enter the elements of matrix");
 
      for (  i= 0 ; i < row ; i++ )
       {   
    
            for ( j= 0 ; j < col ;j++ )
             matrix1[i][j] = s.nextInt();
            
       }
      
      System.out.println("\n\nOriginal   matrix:-");
 for (  i= 0 ; i < row ; i++ )
       {  
                for ( j= 0 ; j <col;j++ )
                System.out.print(matrix1[i][j]+" ");
 	
         System.out.println();
}
 
      for (  i= 0 ; i < n; i++ )
         for ( j= i+1 ; j < n;j++ )
             {
                   temp=matrix1[i][j]  ;
                  matrix1[i][j] =matrix1[j][i]  ;
		matrix1[j][i]  =temp;
 
            }
 
 
      System.out.println("Transpose  of   matrix:-");
      for (  i= 0 ; i < col ; i++ )
       {  
                for ( j= 0 ; j < row;j++ )
                System.out.print(matrix1[i][j]+" ");
 	
         System.out.println();
       }
 
   }
 
}
//output
/*Enter the number of rows
4
Enter the number of columns
2
Enter the elements of matrix
4
6
7
8
4
2
6
8


Original   matrix:-
4 6 
7 8 
4 2 
6 8 
Transpose  of   matrix:-
4 7 4 6 
6 8 2 8 
*/