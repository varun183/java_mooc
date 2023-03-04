
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String longest = "";
        int sum = 0;
        int count = 0;
        double average = 0;
        
        while(true){
            String details = scanner.nextLine();
            if(details.equals("")) {
                break;
            }
            
            String[] parts = details.split(",");
            if(parts[0].length()>longest.length()) {
                longest = parts[0];
            }
            
            sum +=Integer.valueOf(parts[1]);
            count++;
            
             average = (double)sum/count;
           
            
            
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + average);
        
        
        


    }
}
