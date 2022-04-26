
public class Problem03 {
    
    public static int calcPascal(int n) {
        int sum = 0;
        for(int row = 1; row <= n; row++) { // n
            long C = 1;
            for(int el = 1; el <= row; el++) { // n
                
                if (C % 7 == 0) {
                    sum++;
                }
                //System.out.print(C + " ");
                C = C * (row - el) / el;
            }
            //System.out.println();
        }
        
        return sum;
    }
    public static void main(String[] args) {
        int n = 100;
        System.out.println(calcPascal(n));
    }
    
    
    // Time complexity O(n^2)
    // Space complexity O(1)
}
