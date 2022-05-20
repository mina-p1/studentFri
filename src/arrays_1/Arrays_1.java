
package arrays_1;
import java.util.Scanner;
/**
 *
 * @author peter
 */
public class Arrays_1 {

    public static void main(String[] args) {
        
        // comments added from git hub for pull operation
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a word: ");
        String word = in.nextLine();
        
        char[] letters = new char[word.length()];
        
        for (int i = 0; i < letters.length; i++){
            
            letters[i]=word.charAt(i);
        }
        
        
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
        
        System.out.println("Printing in reverse order...");
        
        for (int i = letters.length - 1; i >=0; i--){
            System.out.println(letters[i]);
        }
        
        
        
        
        /*
        char[] xyz = new char[4]
        xyz[0] = 'M';
        xyz[1] = 'I';
        xyz[2] = 'N';
        xyz[3] = 'A';
        */
        
    }
    
}
