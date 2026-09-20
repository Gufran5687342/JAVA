public class Bitwise {
        public static void main(String[] args) {

        System.out.println("Equation 1 Result: " + ((4 << 1) & 7));   // Expected: 0
        System.out.println("Equation 2 Result: " + ((12 >> 2) | 5));  // Expected: 7
        System.out.println("Equation 3 Result: " + ((1 << 3) ^ 8));   // Expected: 0
        System.out.println("Equation 4 Result: " + ((6 & 3) << 2));   // Expected: 8

        System.out.println("Point 1 Result: " + (((15 >> 1) & 6) ^ 3)); // Expected: 5
        System.out.println("Point 2 Result: " + ((2 << 3) | (20 >> 2))); // Expected: 21

        System.out.print("basic bit manipulation")
    }
}
    

