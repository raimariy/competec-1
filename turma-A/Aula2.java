import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args){

        // Scanner ET = new Scanner(System.in);

        // System.out.println("Digite um número: ");
        // int num = ET.nextInt();

        // if(num % 2 == 0){
        //     System.out.println("O número " + num + " é par.");
        // } else {
        //     System.out.println("O número " + num + " é ímpar.");
        // }

        // int cont = 0;
        // while(cont < 5){
        //     System.out.println("Oi!!");
        //     cont++;
        // }

        // int soma = 0;;
        // int cont = 1;

        // while(cont < 101){
        //     soma+=cont;
        //     cont++;
        //     System.out.println("Soma Atual: " +soma);
        // }
        // System.out.println("Soma Final: " +soma);

        //Scanner entrada = new Scanner(System.in);

        // int senha = 0;

        // while(senha != 1234){
        //     System.out.print("Digite sua senha: ");
        //     senha = entrada.nextInt();

        //     if(senha == 1234){
        //         System.out.println("Acesso permitido!");
        //     } else {
        //         System.out.println("Senha Invalida!");
        //     }
        // }

        // Scanner entrada = new Scanner(System.in);
        // int senhaCorreta = 12345;
        // int senhaUsuario;

        // System.out.print("Digite sua senha: ");
        // senhaUsuario = entrada.nextInt();

        // boolean testeSenha = (senhaUsuario != senhaCorreta);

        // while(testeSenha){
        //     System.out.println("Senha Incorreta! Digite novamente: ");
        //     senhaUsuario = entrada.nextInt();
        //     testeSenha = (senhaUsuario != senhaCorreta);
        // }

        // if(!testeSenha) System.out.println("Acesso Liberado!");
        
        // Scanner entrada = new Scanner(System.in);

        // System.out.print("Digite um número: ");
        // int num = entrada.nextInt();

        // System.out.println("\n TABUADA");

        // for(int i = 1; i <= 10; i++){
        //     System.out.println(num + " x " + i + " = " + (num * i));
        // }

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        for(int i = 0; i <= num; i++){
            if(i % 2 == 1){
                System.out.print(i+" ");
            }
        }
    }
}