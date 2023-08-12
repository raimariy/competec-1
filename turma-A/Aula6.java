import java.util.Scanner;

public class Aula6 {

    public static void main(String[] args){

        Scanner ET = new Scanner(System.in);

        //imprimir tabela
        /*int[][] tabela = {{4,6}, {1,7}};
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(tabela[i][j] + " ");
            }
        }*/

        //Crie uma matriz em java e imprima todos os valores dentro dela.
        /*int tab[][] = {{0,1}, {2,3}};

        int lin = 2;
        int tabela[][] = new int[lin][2]; 

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.println(tab[i][j] + " ");
            }
        }*/

        //EXERCÍCIO JOGO DA VELHA
        int tab[][] = {
            {1,1,1},
            {0,1,0},
            {0,0,0},
        };

        if(tab[0][0] == 1){

        }    
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(" ");
                tab[i][j] = ET.nextInt();
            }
        }
       
    }
}