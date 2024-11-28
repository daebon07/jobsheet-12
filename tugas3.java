public class tugas3 {
    
    public static int hitungMarmut(int bulan) {
        
        if (bulan == 1 || bulan == 2) {
            return 1;
        } else {
            
            return hitungMarmut(bulan - 1) + hitungMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        
        int bulanKe12 = hitungMarmut(12);
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-12 adalah: " + bulanKe12);
}
}