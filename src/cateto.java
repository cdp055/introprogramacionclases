import java.util.Scanner;

public class cateto {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.print("Digite cateto 1: ");
        float cateto1=entrada.nextFloat();
        System.out.print("Digite cateto 2: ");
        float cateto2=entrada.nextFloat();
        double hipotenusa=Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
        System.out.println("La hipotenusa tiene un valor de: "+hipotenusa);
    }
}