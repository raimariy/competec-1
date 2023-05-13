import java.util.Scanner;

public class Aula1{
    public static void main(String[] args){
        /*double abacaxi = 7.30;
        double maca = 2.0;
        double pera = 3.0;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos abacaxis você deseja: ");
        abacaxi *= entrada.nextInt();
        System.out.println("Digite quantos maças você deseja: ");
        maca *= entrada.nextInt();
        System.out.println("Digite quantos peras você deseja: ");
        pera *= entrada.nextInt();

        double resultado = abacaxi + maca + pera; 

        System.out.println("O valor total das sua compras foi de R$ "+resultado);*/

        /*Scanner entrada = new Scanner(System.in);

        int x, y;
        
        System.out.println("Digite o primeiro número: ");
        x = entrada.nextInt();

        System.out.println("Digite o segundo número: ");
        y = entrada.nextInt();

        if(x == y){
            System.out.println("Os valores são iguais.");
        } else {
            System.out.println("Os valores são diferentes.");
        }*/

        /*Scanner entrada = new Scanner(System.in);

        int x, y;
        
        System.out.println("Digite a sua idade: ");
        x = entrada.nextInt();
        if(x >= 18){
            System.out.println("eh maior de idade");
        } else {
            System.out.println("eh menor de idade");
        }*/

        /*Scanner entrada = new Scanner(System.in);

        int x, y;
        
        System.out.println("Digite a primeira idade: ");
        x = entrada.nextInt();
        System.out.println("Digite a segunda idade: ");
        y = entrada.nextInt();

        if(x == y){
            System.out.println("Tem a mesma idade");
        } else if(x > y){
            System.out.println("O primero eh mais velho");
        } else {
            System.out.println("O segundo eh mais velho");
        }*/

        /*boolean chuva;
        boolean nublado;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Esta chovendo? ");
        chuva = entrada.nextBoolean();
        System.out.println("Esta nublabo? ");
        nublado = entrada.nextBoolean();

        String tempo;
        System.out.println("Como esta o clima? ");
        tempo = entrada.nextLine();
        
        if(tempo.equals("chuva") == 0){
            System.out.println("Esta chovendo");
        } else if(tempo.equals("nublado") == 0){
            System.out.println("Esta nublado");
        }

        if(chuva == true || nublado == true){
            System.out.println("Esta chovendo ou nublado");
        } else {
            System.out.println("Esta ensolarado");
        }*/

        /*boolean chuva;
        boolean guardaChuva;

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Esta chovendo? ");
        chuva = entrada.nextBoolean();
        System.out.println("Trouxe guarda chuva? ");
        guardaChuva = entrada.nextBoolean();
        
        if(chuva == true || guardaChuva == true){
            System.out.println("Ta chovendo e eu to de boa.");
        } else if(chuva == true || guardaChuva == false){
            System.out.println("Ta chovendo e eu to ferrado.");
        }*/

        /*String opcao;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual operacao voce deseja fazer?");
        System.out.println("||| A - DEPOSITO \n B - SAQUE \n C - EMPRESTIMO |||");
        opcao = entrada.nextLine();

        switch(opcao){
            case "a":
                System.out.println("Voce escolheu a opcao Deposito, siga.....");
            break;
            case "b":
                System.out.println("Voce escolheu a opcao Saque, siga.....");
            break;
            case "c":
            System.out.println("Voce escolheu a opcao Emprestimo, siga.....");
            break;
        }*/

        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = entrada.nextInt();

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("VERDADEIRO, ele eh multiplo de ambos");
        } else if (num % 3 == 0 || num % 5 == 0){
            System.out.println("VERDADEIRO, ele eh multiplo de algum deles");
        } else {
            System.out.println("FALSO");
        }
    }
}