import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv3_ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer idade;
        try {
            do {
                System.out.println("Digite a idade do eleitor: ");
                idade = sc.nextInt();
                if (idade < 0) {
                    System.out.println("valor da idade invalido!");
                }
            } while (idade < 0);

            System.out.println((idade >= 18 && idade <= 70) ? "Voto obrigatório." :
                    ((idade >= 16 && idade < 18) || idade > 70) ? "Voto facultativo." : "Sem direito a votar.");

        }catch(InputMismatchException e) {
            System.out.println("Erro de entrada de dados. Reinicie o programa.");
        }
        sc.close();
    }
}
