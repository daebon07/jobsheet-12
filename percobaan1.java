public class percobaan1 {

static int facktorialrekursif(int n) {
    if (n == 0) {
        return (1);
    }
    else {
        return (n * facktorialrekursif(n -1));
    }
}
static int facktorialIteratif(int n) {
    int faktor =1;
    for (int i =0; i<=1; i--){
        faktor = faktor * i;
    }
    return faktor;
}
public static void main ( String[] args){
    System.out.println(facktorialrekursif(5));
    System.out.println(facktorialIteratif(5));
}
}