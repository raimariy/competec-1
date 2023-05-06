import java.util.Scanner;

public class Aula0{

    public static void main(String[] args){
        /*Scanner entrada = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nome = entrada.nextLine();

        System.out.println("Bom dia, " + nome + "!");

        entrada.close();*/

        Scanner ex = new Scanner(System.in);
        System.out.print("Qual seu nome? ");
        String nome = ex.nextLine();

        System.out.print("Qual é sua idade? ");
        int idade = ex.nextInt();

        System.out.println("Seu nome é " + nome + " e vc tem " + idade + " anos " + "\n" + "Bom dia, " + nome + "!");

        /*int idade = 16;
        boolean cafe = false;
        char[] nome = [{'r', 'a', 'i', 's', 's', 'a'}];
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Tomou café: " + cafe);*/

        /*String nome;
        nome = "Raissa";
        int idade = 16;
        System.out.println(nome + ": idade = " + idade);*/

        /*double n1 = 11;
        double n2 = 2;
        double resultado = n1 % n2; // % resto
        System.out.println(resultado);*/

       /* double laranja = 3.50;
        double uva = 4.90;
        double soma = laranja + uva;
       
        //uva += laranja;
        //System.out.println("Valor da uva: " + uva + "\n");

        System.out.println("Valor da laranja: " + laranja + "\n" + "Valor da uva: " + uva + "\n" + "Resultado: " + soma);*/  

        /*String nome1 = "Cristiano Ronaldo";
        String nome2 = "Manoel";
        System.out.printf("%s e %s", nome1, nome2);

        int n1 = 2;
        int n2 = 1;
        System.out.printf("%d e %d", n1, n2);*/


    }
}