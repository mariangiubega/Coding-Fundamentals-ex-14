import java.util.Random;
import java.util.Scanner;

public class NumarRandom {

    public static void main(String[] args) {
        int random = new Random().nextInt(1000)+1;
        int attempts = 0;
        int guess;
        Scanner input = new Scanner(System.in);

        do{
            guess=input.nextInt();
            if (guess<random)
                System.out.println("Introduceti un numar mai mare!");
            else if(guess>random)
                System.out.println("Introduceti un numar mai mic!");
            attempts++;
        }while (guess!=random);

        System.out.println("Numarul este " +random+ ". L-ati numerit din  "+attempts+ " incercari.");



    }
}
