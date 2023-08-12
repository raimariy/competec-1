import java.util.Scanner;

public class Aula6 {

    public static void main(String[] args){

        Scanner ET = new Scanner(System.in);

        //imprimir tabela
        int[][] tabela = {{4,6}, {1,7}};
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
            System.out.print(tabela[i][j] + " ");
            }
        }
    }
}