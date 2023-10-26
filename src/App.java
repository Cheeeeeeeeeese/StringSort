import java.util.Arrays;
import java.util.Scanner;


public class App {

    
    public static void main(String[] args) throws Exception {
        System.out.println("String zum sortieren eingeben:");
        Scanner reader = new Scanner(System.in);  
        String pString = reader.nextLine();
        reader.close();
        int[] intArray = new int[pString.length()];
        for(int i = 0; i < pString.length(); i++){
            intArray[i] = (int) pString.charAt(i);
            System.out.print(intArray[i]+ " ");
        }
        Arrays.sort(intArray);
        System.out.println();
        for(int j = 0; j < intArray.length; j++){
            System.out.print((char)intArray[j]);
        }
    }
}