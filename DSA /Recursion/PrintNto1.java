package Recursion;

public class PrintNto1 {
    public void print(int n){
        if (n <= 0){
            return;
        }
        System.out.print(n + " ");
        print(n -1);
    }
    
    public static void main(String[] args) {
        PrintNto1 obj = new PrintNto1();
        obj.print(10);
    
    }
    
}
