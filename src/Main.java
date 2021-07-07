import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] Array = {
                {1,2,3,4},{2,4,5,6},{2,4,5,6},{2,5,7,9}
        };
        int max= Array[0][0];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                 if(Array[i][j]>max){
                     max = Array[i][j];
                 }
            }
        }
        System.out.println(max);
        int[][] matrix = new int[3][3];
        Scanner input= new Scanner(System.in);
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        int max1 = matrix[0][0];
        for(int k=0;k<matrix.length;k++){
            for(int f=0;f<matrix.length;f++){
                if(max1<matrix[k][f]){
                    max1= matrix[k][f];
                }
            }
        }
        System.out.println(max1);
    }
}
