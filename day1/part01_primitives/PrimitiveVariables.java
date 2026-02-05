package day1.part01_primitives;

public class PrimitiveVariables {

    public static void main(String[] args) {

        // declare an int value and do not initialize it yet:
        int a;

        
        // declare and initialize another int. Give your first int a value
        a = 7;
        int b = 2;
        

        // print integer division result (a / b) with a label
        System.out.println("a / b = " + (a / b));

        // print double division result ((double) a / b) with a label
        System.out.println("(double) a / b = " + (double) a / b);

        // declare a double named price and an int named quantity
        //         initialize them to any values you choose
        double price = 100.0;
        int quantity = 4;
        
        
        // compute total cost (double) and print it with a label
        System.out.println("(double) price * quantity = " + (double) price * quantity);
        

        // declare a char variable and print the char and its int code
        char character = 'R';
        System.out.println("Character: " + character);
        System.out.println("Character's int value: " + (int)character);

        // Modify an existing int variable once using a unary operator (++ or --).
        // Modify it once using an augmented assignment operator (+=, -=, *=, or /=).
        // Print the value after each modification.
        a ++;
        System.out.println("a ++ = " + a);
        a += 2;
        System.out.println("a +- 2 = " + a);
    }
}
