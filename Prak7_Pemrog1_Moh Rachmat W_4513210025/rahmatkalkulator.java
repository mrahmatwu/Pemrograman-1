//program 04
import java.util.Scanner;
public class rahmatkalkulator
{
	public static void main(String[] args)
    {
	int Jumlah;
	int Nilai1;
	int Nilai2;
        Scanner scan = new Scanner(System.in);
//menampilkan menu PILIHAN
        System.out.println("MENU PILIHAN : ");
			System.out.println("___________________________________");
			System.out.println("1. Penjumlahan");
			System.out.println("2. Pengurangan");
			System.out.println("3. Perkalian");
			System.out.println("4. Pembagian");
			System.out.println("5. MOD");
			System.out.println("");
			
//pengguna memasukkan nomor pesanan 
        System.out.print("Masukkan Nomor PILIHAN : ");
        int Menu = scan.nextInt();
		System.out.println("___________________________________");
		switch(Menu){
			case 1 :
				System.out.println("Menu yang Anda Pilih Penjumlahan ");
				System.out.print("Nilai 1 : ");
				Nilai1 = scan.nextInt();
				
				System.out.print("Nilai 2 : ");
			    Nilai2 = scan.nextInt();
				Jumlah = Nilai1 + Nilai2;
				
				System.out.print("Hasil nya : ");
				System.out.print(Jumlah);
				break;
			case 2: 
				System.out.println("Menu yang Anda Pilih Pengurangan ");
				System.out.print("Nilai 1 : ");
				Nilai1 = scan.nextInt();
				
				System.out.print("Nilai 2 : ");
			    Nilai2 = scan.nextInt();
				Jumlah = Nilai1 - Nilai2;
				
				System.out.print("Hasil nya : ");
				System.out.print(Jumlah);
				break;
			case 3:
				System.out.println("Menu yang Anda Pilih Perkalian ");
				System.out.print("Nilai 1 : ");
				Nilai1 = scan.nextInt();
				
				System.out.print("Nilai 2 : ");
			    Nilai2 = scan.nextInt();
				Jumlah = Nilai1 * Nilai2;
				
				System.out.print("Hasil nya : ");
				System.out.print(Jumlah);
				break;
				
			case 4:
				System.out.println("Menu yang Anda Pilih Pembagian ");
				System.out.print("Nilai 1 : ");
				Nilai1 = scan.nextInt();
				
				System.out.print("Nilai 2 : ");
			    Nilai2 = scan.nextInt();
				Jumlah = Nilai1/Nilai2;
				
				System.out.print("Hasil nya : ");
				System.out.print(Jumlah);
				break;
				
			case 5:
				System.out.println("Menu yang Anda Pilih MOD");
				System.out.print("Nilai 1 : ");
				Nilai1 = scan.nextInt();
				
				System.out.print("Nilai 2 : ");
			    Nilai2 = scan.nextInt();
				Jumlah = Nilai1%Nilai2;
				
				System.out.print("Hasil nya : ");
				System.out.print(Jumlah);
				break;
				
			default:
				System.out.print("Menu yang anda  pilih tidak tersedia !!");
				break;
			}
		}
	}	