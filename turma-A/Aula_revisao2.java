import java.util.Scanner;

public class Aula_revisao2 {

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
        int[][] tab = new int[3][3];

        // Lê o(tab da entrada
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tab[i][j] = ET.nextInt();
            }
        }

        // Verifica o resultado
        String resul = verificarResultado(tab);

        // Exibe o resultado
        System.out.println(resul);
    }

    public static String verificarResultado(int[][] tab) {
        // Verifica linhas, colunas e diagonais
        for (int i = 0; i < 3; i++) {
            if (tab[i][0] == tab[i][1] && tab[i][1] == tab[i][2]) {
                if (tab[i][0] == 1) {
                    return "X";
                } else if (tab[i][0] == 0) {
                    return "O";
                }
            }

            if (tab[0][i] == tab[1][i] && tab[1][i] == tab[2][i]) {
                if (tab[0][i] == 1) {
                    return "X";
                } else if (tab[0][i] == 0) {
                    return "O";
                }
            }
        }

        if (tab[0][0] == tab[1][1] && tab[1][1] == tab[2][2]) {
            if (tab[0][0] == 1) {
                return "X";
            } else if (tab[0][0] == 0) {
                return "O";
            }
        }

        if (tab[0][2] == tab[1][1] && tab[1][1] == tab[2][0]) {
            if (tab[0][2] == 1) {
                return "X";
            } else if (tab[0][2] == 0) {
                return "O";
            }
        }

        return "velha de velhas";
    }
}