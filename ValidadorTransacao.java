import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class ValidadorTransacao {

    static final double LIMITE_DO_CARTAO = 7000;
    static final double VALOR_SUSPEITO = 5000;
    static final int HORA_INICIO_MADRUGADA = 22;
    static final int HORA_FIM_MADRUGADA = 6;

    public static void main(Stri-3ng[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int horaDaCompra = LocalTime.now().getHour();

        System.out.println("Limite do cartão: " + LIMITE_DO_CARTAO);
        System.out.println("Qual o valor da compra?");
        double valorCompra = scanner.nextDouble();

        if (valorCompra <= 0) {
            System.out.println("Valor inválido!");
        } else if (ehSuspeita(valorCompra, horaDaCompra)) {
            System.out.println("Transação bloqueada: suspeita de fraude!");
        } else if (valorCompra > LIMITE_DO_CARTAO) {
            System.out.println("Compra não aprovada: limite insuficiente!");
        } else {
            System.out.println("Compra aprovada! Horário: " + horaDaCompra + "h");
        }

        scanner.close();
    }

    static boolean ehSuspeita(double valor, int hora) {
        boolean horarioDeRisco = hora <= HORA_FIM_MADRUGADA || hora >= HORA_INICIO_MADRUGADA;
        return valor > VALOR_SUSPEITO && horarioDeRisco;
    }
}





    
        
            

    