    
public class Swapping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
