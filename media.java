import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota1= sc.nextDouble();
        double nota2= sc.nextDouble();
        double media= (nota1+nota2)/2;

        if (media>=7){
            System.out.println("Aprovado com média: " + media);
        }
        else{
            System.out.println("Reprovado com média: " + media);
        }
    }
}