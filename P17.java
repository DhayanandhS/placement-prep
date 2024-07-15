import java.io.*;
import java.util.*;

public class P17 {
    public static void setZeros(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        boolean firstRowZero = false;
        boolean firstColZero = false;
        
        // Check if the first row has any zeros
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }
        
        // Check if the first column has any zeros
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }
        
        // Use the first row and first column to mark zeros in the rest of the matrix
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        
        // Zero out rows based on marks
        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Zero out columns based on marks
        for (int j = 1; j < cols; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 1; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Zero out the first row if needed
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }
        
        // Zero out the first column if needed
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        // Read input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int k = 0; k < t; k++) {
            String[] dimensions = br.readLine().split(" ");
            int n = Integer.parseInt(dimensions[0]);
            int m = Integer.parseInt(dimensions[1]);
            
            int[][] matrix = new int[n][m];
            for (int i = 0; i < n; i++) {
                String[] row = br.readLine().split(" ");
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = Integer.parseInt(row[j]);
                }
            }
            
            setZeros(matrix);
            
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}