import java.util.Scanner;

public class Main_Poli{
	public static void main(String[]args){		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=========================================");
   		System.out.println("= PROGRAM PENJUALAN DENGAN POLIMORFISME =");
   		System.out.println("=========================================");
		System.out.println("Merek       Tipe            Harga   ");
		System.out.println("          Meja (M)       Rp. 95.000 ");
		System.out.println("  G  	  Kursi (K)      Rp. 125.000");
		System.out.println("    	  Lemari (L)     Rp. 450.000");
		System.out.println("    	  Meja (M)       Rp. 115.000");
		System.out.println("  O  	  Kursi (K)      Rp. 135.000");
		System.out.println("    	  Lemari (L)     Rp. 550.000");
		System.out.println("");
		
		System.out.print("\n\n");
		System.out.print("Masukkan Nama Anda : ");
		String nama = input.nextLine();
		
		System.out.print("Masukkan Merk (G/O) : ");;
		char merk = input.next().charAt(0);
		
		switch (merk) {
			case 'G': 
				MerkG a1 = new MerkG();
				a1.setNama(nama);
				a1.setMerk(merk);
				a1.proses();
				
				System.out.println("Harga bayar : Rp."+ a1.getTotal());
		
				System.out.print("Masukkan Jumlah Bayar : Rp.");
				int bayar = input.nextInt();		
				a1.setBayar(bayar);
				
				a1.setKembalian(bayar);
				a1.getKembalian(); 		
				a1.showStruk();
			break;
			
			case 'O': 
				MerkO b1 = new MerkO();
				b1.setNama(nama);
				b1.setMerk(merk);
				b1.proses();
				
				System.out.println("Total Harga: Rp."+ b1.getTotal());
		
				System.out.print("Masukkan Jumlah Bayar : Rp.");
				bayar = input.nextInt();		
				b1.setBayar(bayar);
				
				b1.setKembalian(bayar);
				b1.getKembalian(); 		
				b1.showStruk();
			break;
			
			default :
	    			System.out.println("Tipe yang Anda pilih tidak ada!!!.");
	    			System.out.println("");
	    			break;
		}		
	}
}