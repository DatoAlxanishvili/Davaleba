import java.util.Scanner;

/**
 * Created by geolabedu on 07.10.15.
 */
public class Pyramid {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int baseLength = scanner.nextInt();
        int count=baseLength/2;
        int numberOfChars=1;
        while(numberOfChars<=baseLength+1) {
            System.out.println("");
            for (int k = 0; k < count; k++) {
                System.out.print(" ");
            }
            for (int m = 0; m < numberOfChars; m++) {
                System.out.print("a");
            }
            count--;
            numberOfChars += 2;
        }
        System.out.println("");

    }

}
