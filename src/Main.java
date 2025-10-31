import java.util.Scanner;

/**
 * Program sederhana untuk menghitung total nota pemesanan restoran.
 * Fitur: input menu, jumlah, harga, total, pajak, dan cetak nota.
 */
public class NotaRestoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== NOTA PEMESANAN ===");
        System.out.print("Masukkan nama menu: ");
        String menu = input.nextLine();

        System.out.print("Masukkan harga satuan: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();

        double subtotal = harga * jumlah;
        double pajak = subtotal * 0.1; // 10%
        double total = subtotal + pajak;

        System.out.println("\n======= NOTA PEMBAYARAN =======");
        System.out.println("Menu     : " + menu);
        System.out.println("Jumlah   : " + jumlah);
        System.out.println("Harga    : Rp" + harga);
        System.out.println("Subtotal : Rp" + subtotal);
        System.out.println("Pajak 10%: Rp" + pajak);
        System.out.println("TOTAL    : Rp" + total);
        System.out.println("===============================");
    }
}
