import java.util.Scanner;

public class Diskon {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int harga, jumlah, jumlahharga, diskon, total;
        System.out.print("Harga barang = ");
        harga = input.nextInt();
        System.out.print("Jumlah = ");
        jumlah = input.nextInt();

        jumlahharga = harga*jumlah;
        diskon = jumlahharga*15/100;
        total = jumlahharga-diskon;

    
        System.out.println("Total harga(diskon 15%) = " +harga+"*"+jumlah+"="+total);
    }

}