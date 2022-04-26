
public class Problem03 {
    
    public static int calcPascal(int n) {
        int sum = 0;
        for(int row = 1; row <= n; row++) {
            long C = 1;
            for(int el = 1; el <= row; el++) {
                
                if (C % 7 == 0) {
                    sum++;
                    //System.out.print(C+" ");
                    System.out.print(".");
                } else {
                    //System.out.print("(" + C +") ");
                    System.out.print("1");
                    
                }
                
                C = C * (row - el) / el;
            }
            System.out.println();
        }
        
        return sum;
    }
    public static void main(String[] args) {
        int n = 200;
        int count = n*(n+1) / 2;
        System.out.println(count);
        System.out.println(calcPascal(n));
    }
   
}
