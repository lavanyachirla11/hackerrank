/*Valid Username Regular Expression
Input Format
The first line of input contains an integer n, 
describing the total number of usernames. Each of the next n lines contains a string describing the username. The locked stub code reads the inputs and validates the username.
Constraints
1<=n<=100 
The username consists of any printable characters.

Output Format
For each of the usernames, 
the locked stub code prints Valid if the username is valid;
otherwise Invalid each on a new line.
*/
import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
     
    public static final String regularExpression = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}


public class RegularExpression{
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}