import java.util.Scanner;
import java.time.LocalTime;


public class ValidadorTransacao {
    static Scanner scanner =new Scanner(System.in);
    static int horaDaCompra = LocalTime.now().getHour(); 
    static double LimiteDoCartao = 7000;


    public static void main (String[] args){
    

    System.out.println("Limite do cartão:"  + LimiteDoCartao);

        System.out.println("Qual o valor da compra?");
        double ValorCompra = scanner.nextDouble();

        if (ValorCompra > 5000 && (horaDaCompra <= 6 || horaDaCompra >= 22) ){

        System.out.println("Transação Bloqueada: Suspeita de Fraude!");
        
        } else if (ValorCompra > LimiteDoCartao ) {

            System.out.println("Compra não aprovada: Limite insuficiente!");

        }else {

            System.out.println("Compra aprovada! Horário: " + " " + horaDaCompra);
        }





    
        
            

    }

    
}
