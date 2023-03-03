package ARRYS;
import java.util.Scanner;
public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = {-5, 4, 6, 15, 50};
        System.out.println("Vetor : ");
        //primeiro elemente é o -5, mas ele ta na posição 0. logo 5 posições ( 0 a 5)
        //Mas há 6 elementos.
        //Criar laço de repetição  - para cada looping andar e pegar cada elemento
        //Laço While
        int count = 0;
        while (count < vetor.length - 1) {
        // length - retorna tamanho do arry's/se estiver no vetor retorna o tamanho do vetor.
        //tamanho - 1 = posição
        System.out.println(vetor[count] + "  ");
        count++;

    }
        System.out.println("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.println(vetor[i] + " ");
        }
    }
    // i=0 pra ir do 5 ao 0
    // i -- para decrescer

}


