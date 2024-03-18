import java.util.Scanner;
public class hashing {
public static int hash(String str, int range) {
        int hash = 0;
        //Create a running total for the hash that adds the ASCII value of the character
        for (int i = 0; i< str.length(); i++) {
            hash+= str.charAt(i);
        }
        //Return the final total modulo range
        return hash % 100;
    }
    
public static void main(String args[] ) throws Exception {
        
        //Take an input from the user of a string for a variable called 'input'
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to hash: ");
        String input = sc.nextLine();
          
        //Create a variable 'range' that limits the hash value to a range of 0 to 99
        int range = 100; // the range for hash value

       //create a variable called 'hashedValue' that calls the hash function with the input and range as parameters. 
        int hashedValue = hash(input, range); // Compute the hashed value within the defined range
        
        //Print out the hashedValue
        System.out.println("Hashed value for \"" + input + "\": " + hashedValue);
    }
}
