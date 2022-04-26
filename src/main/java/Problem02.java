
public class Problem02 {
    
    public static int[] merge(int[] a, int[] b) {
        int aSize = a.length, bSize = b.length, aIndex = 0, bIndex = 0, index = 0;
        int[] arr = new int[aSize+bSize];
        
        while(aIndex < aSize && bIndex < bSize) {
            if (a[aIndex] <= b[bIndex]) {
                arr[index] = a[aIndex];
                aIndex++;
            } else {
                arr[index] = b[bIndex];
                bIndex++;
            }
            index++;
        }
        
        if (aIndex > bIndex) {
            arr[index] = b[bIndex];
        } else {
            arr[index] = a[aIndex];
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 10};
        int[] b = {2, 4, 6, 8, 9};
        
        int[] arr = merge(a, b);
        
        for(int x: arr) {
            System.out.println(x);
        }
    }
}
