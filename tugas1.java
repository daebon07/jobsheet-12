public class tugas1 {
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " "); 
        }
    }

    public static void main(String[] args) {
        int n = 5;  
        System.out.println("Deret Descending Iteratif:");
        deretDescendingIteratif(n);  
    }
}
