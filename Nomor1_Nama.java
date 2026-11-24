import java.util.Scanner;

public class Nomor1_Nama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        String empatHuruf = nama.substring(3, 7);

        System.out.println("\nNama            : " + nama);
        System.out.println("NIM             : " + nim);
        System.out.println("Empat huruf     : " + empatHuruf);

        input.close();
    }
}