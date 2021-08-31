package parte02_md02;

//Importa o pacote necessário para receber entrada pelo usuário
import java.util.Scanner;

/** Classe com a implementação da "parte 02" do "exercício02" do material "md02".
 * Curso Java - Share RH & Alelo"
 * Para mais detalhes, acesse o "Readme.txt" no GITHUB.
 *
 * @author Jonatas "Kallrish" Ribeiro
 * @version 1.0
 * */
public class md02Exercicio02 {
  /** Roda o programa principal. */
  public static void main(String[] args) {

    //Instancia o objeto in para receber as entradas do usuário
    Scanner in = new Scanner(System.in);

    //Cria as variáveis necessárias

    Integer quantidade, indice, negativos = 0;

    //Solicita ao usuário a quantidade de números que ele quer na lista
    System.out.println("Quantos números negativos tem na lista?\n");
    System.out.println("Digite quantos elementos você quer na lista: ");
    quantidade = Integer.parseInt(in.nextLine());
    Double[] numeros = new Double[quantidade];

    //Loop para leitura dos números que o usuário quer na lista
    for (indice = 0; indice < quantidade; indice++) {
      System.out.printf("Digite o número %d!\n", (indice + 1));
      numeros[indice] = Double.parseDouble(in.nextLine());

      if (numeros[indice] < 0.0) {
        negativos++;
      }
    }

    //Retorna na tela os números que foram armazenados na lista
    System.out.printf("\nA sua lista tem %d números negativos!", negativos);

    //Finaliza o recurso do Scanner
    in.close();
  }
}