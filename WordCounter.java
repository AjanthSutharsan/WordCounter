
import java.util.Scanner;
public class WordCounter
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a saying to see how many words are in the saying.");
        String Saying = input.nextLine();
        
        int total = 1;
        
        for(int i=0; i<Saying.length(); i++) {
            
            if(Saying.substring(i, i+1).equals(" ")) {
                total=total+1;
                
            }
            
        }
        
        System.out.println("The number of words in your saying is "+total);
    }

   
}
