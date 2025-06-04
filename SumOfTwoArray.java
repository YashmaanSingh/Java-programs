import java.util.Scanner;

public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of array Row: ");
        int r1 = sc.nextInt();

        System.out.println("Enter the Size of Array Column");
        int c1 = sc.nextInt();

        int[][] arr1 = new int [r1] [c1];



        System.out.println("Enter the First  Elements of array: ");
        for(int i = 0; i<r1; i++){
            for(int j = 0; j < c1; j++){
                arr1[i][j]= sc.nextInt();
            }
        }


        System.out.println("Enter the Size of array Row:");
        int r2 = sc.nextInt();

        System.out.println("Enter the Size of array column ");
        int c2 = sc.nextInt();

        int [][] arr2 = new int[r2][c2];

        System.out.println("Enter the Second Element of array: ");
        for(int i = 0; i<r2; i++){
            for(int j=0; j<c2; j++){
                arr2[i][j]=sc.nextInt();
            }
        }


        if(r1 !=r2 || c1 != c2){
            System.out.println("Array of Sum is not possible: ");
        }
        
            int[][] sum = new int[r1][c1];
            for(int i =0; i<r1; i++){
                for(int j=0; j<c1; j++){
                  sum[i][j]= arr1[i][j] + arr2[i][j];  
                }
            }
        
         System.out.println("Sum of array is: ");
         for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
         }

         sc.close();
    }
    
}
