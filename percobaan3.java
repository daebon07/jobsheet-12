import java.util.Scanner;

public class percobaan3 {
    static double hitunglaba (double saldo,int tahun){
        if (tahun==0){
            return (saldo);
        }
        else {
            return (1.11 * hitunglaba(saldo, tahun-1));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoawal;
        int tahun;

        System.out.print("jumlah saldo awal : ");
        saldoawal = sc.nextInt();
        System.out.print("lamanya investasi (tahun) ");
        tahun = sc.nextInt();

        System.out.println("jumlah saldo setelah " + tahun + " tahun : ");
        System.out.println(hitunglaba(saldoawal, tahun));

      
    }
}
