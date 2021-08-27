package parte01_md1;

//Importa o pacote necessário para receber entrada pelo usuário
import java.util.Scanner;

/** Classe com a implementação do "exercício02" do material "diadois".
 * Curso Java - Share RH & Alelo"
 *
 * @author Jonatas "Kallrish" Ribeiro
 * @version 1.0
 * */
public class Exercicio02 {
    /** Roda o programa principal. */
    public static void main(String[] args) {

        //Instancia o objeto in para receber as entradas do usuário
        Scanner in = new Scanner(System.in);

        //Retorna na tela solicitando o usuário que digite um valor
        System.out.println("Digite um valor:");

        //Atribui o valor digitado na variável 1
        int v1 = in.nextInt();

        //Retorna na tela o valor digitado pelo usuário
        System.out.println("Você digitou "  + v1 + ".");

        //Cria variável para receber o número anterior e atribui o valor
        int v2;
        v2 = v1 - 1;

        //Retorna na tela o valor do número inicial e do número anterior
        System.out.println("O número anterior a " + v1 + " é "  + v2 + ".");
    }
}
