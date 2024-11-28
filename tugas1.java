public class tugas1 {
    static void deretDescendingRekursif(int n) {
        if (n < 0) {
            return;  
        }
        System.out.print(n + " ");  
        deretDescendingRekursif(n - 1);  
    }

    public static void main(String[] args) {
        int n = 5;  
        System.out.println("Deret Descending Rekursif:");
        deretDescendingRekursif(n);  
    }
}
