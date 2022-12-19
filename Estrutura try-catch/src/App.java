import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Nesse programa eu criei um vetor de strings li uma posiçao e depois mostra a posisao isso pode
    //gerar 2 tipos de exceção A EXCEÇAO QUE ACESEI DO ARRAY FORA DO LIMITE ou A EXCEÇAO InputMismatchException
    // quando digita um valor invalido para o inteiro
    try {
      String[] vect = sc.nextLine().split(" ");
      int position = sc.nextInt();
      System.out.println(vect[position]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("invalid position!");
    } catch (InputMismatchException e) {
      System.out.println("Input error");
    }

    System.out.println("end of program");
    sc.close();
  }
}
