import java.util.Scanner;

public class Aula4 {

    public static void main(String[] args){

        Scanner ET = new Scanner(System.in);

        //1. Crie uma matriz em java e imprima todos os valores dentro dela.
        /*int[][] tabela = {{4,6}, {1,7}};
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
            System.out.print(tabela[i][j] + " ");
            }
        }*/

        //2. Escreva um programa com duas matrizes 3x3 (9 elementos) e depois realize a soma entre elas e armazene em uma terceira matriz. 
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Calcular a soma e armazenar na terceira matriz
        int[][] somaMatrix = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Exibir a terceira matriz (matriz resultante da soma)
        System.out.println("Matriz resultante da soma:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(somaMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}        