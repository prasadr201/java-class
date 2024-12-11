import java.util.*;
public class NotUse{
   public static int[] spiralMatrix(int[][] matrix) {
       if (matrix == null || matrix.length == 0) {
           return new int[0]; // Return an empty array if the matrix is null or empty
       }

       int rows = matrix.length;
       int cols = matrix[0].length;
       int[] result = new int[rows * cols];

       int top = 0, bottom = rows - 1;
       int left = 0, right = cols - 1;
       int index = 0;

       while (top <= bottom && left <= right) {
           // Traverse from left to right along the top row
           for (int i = left; i <= right; i++) {
               result[index++] = matrix[top][i];
           }
           top++;

           // Traverse from top to bottom along the right column
           for (int i = top; i <= bottom; i++) {
               result[index++] = matrix[i][right];
           }
           right--;

           // Traverse from right to left along the bottom row (if within bounds)
           if (top <= bottom) {
               for (int i = right; i >= left; i--) {
                   result[index++] = matrix[bottom][i];
               }
               bottom--;
           }

           // Traverse from bottom to top along the left column (if within bounds)
           if (left <= right) {
               for (int i = bottom; i >= top; i--) {
                   result[index++] = matrix[i][left];
               }
               left++;
           }
       }

       return result;
   }

   public static void main(String[] args) {
       int[][] matrix = {
           {1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}
       };

       int[] result = spiralMatrix(matrix);

       // Print the result
       System.out.println("Spiral order of the matrix:");
       for (int num : result) {
           System.out.print(num + " ");
       }
   }
}
