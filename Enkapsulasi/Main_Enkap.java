import java.util.Scanner;

public class Main_Enkap{
	public static void main(String[] args){
		
		String nama;
		char merk, tipe;
        int jUnit;
        int harga = 0;
        int totHarga = 0;
        int bayar = 0;
        int kembalian = 0;
        boolean loop = true;
         
		Scanner input = new Scanner(System.in);
		
        Pelanggan p = new Pelanggan();
        
        
        System.out.println("==========================================");
   		System.out.println("= PROGRAM PENJUALAN DENGAN ENCAPSULATION =");
   		System.out.println("==========================================");
   		
   		System.out.println("Merk       Tipe            Harga   ");
		System.out.println("          Meja (M)       Rp. 95.000 ");
		System.out.println("  G  	  Kursi (K)      Rp. 125.000");
		System.out.println("    	  Lemari (L)     Rp. 450.000");
		System.out.println("    	  Meja (M)       Rp. 115.000");
		System.out.println("  O  	  Kursi (K)      Rp. 135.000");
		System.out.println("    	  Lemari (L)     Rp. 550.000");
        
        System.out.print("\n\n");
        System.out.print("\nMasukkan Nama Pelanggan  : ");
        nama = input.nextLine();
        p.setNama(nama);
        
                
        while(loop)
    	{
    		System.out.print("Masukkan Merk (G/O) : ");
			merk = input.next().charAt(0);
			p.setMerk(merk);
    		switch(merk)
	    	{
	    		case 'G' :
	    			System.out.print("Silahkan pilih Tipe (M/K/L) : ");
              		tipe = input.next().charAt(0);
              		p.setTipe(tipe);
              		if (tipe == 'M' || tipe == 'm'){
              			harga = 95000;
              		}
              		else if (tipe == 'K' || tipe == 'k'){
              			harga = 125000;
              		}
              		else if (tipe == 'L' || tipe == 'l'){
              			harga = 450000;
              		}
              		else{
              			System.out.println("Tipe yg anda pilih tidak ada!!!. Silahkan Pilih Ulang");
              			System.out.println("");
              			break;              			
              		}
              		              		
	    			loop = false;
	    			break;
	    			
	    		case 'O' :
	    			System.out.print("Silahkan pilih Tipe (M/K/L) : ");
              		tipe = input.next().charAt(0);
              		p.setTipe(tipe);
              		if (tipe == 'M'){
              			harga = 115000;
              		}
              		else if (tipe == 'K'){
              			harga = 135000;
              		}
              		else if (tipe == 'L'){
              			harga = 550000;
              		}
              		else{
              			System.out.println("Tipe yg anda pilih tidak ada!!!. Silahkan Pilih Ulang");
              			System.out.println("");
              			break;
              			
              		}
              		
	    			loop = false;
	    			break;
	    			
	    		default :
	    			System.out.println("Tidak ada dalam pilihan. Silahkan Pilih Ulang");
	    			System.out.println("");
	    			break;
	    	}
    	}
        
        
        System.out.print("Jumlah Unit Yang Diinginkan : ");
		jUnit = input.nextInt();
		p.setUnit(jUnit);
		
        p.setTotal(harga * jUnit);
        System.out.println("Total Harga : Rp. " + p.getTotal());
        		
		while(p.getBayar() < p.getTotal()){
		System.out.print("Uang Pembayaran : Rp. ");
		bayar = input.nextInt();
		p.setBayar(bayar);
			if (p.getBayar() > p.getTotal()){
				kembalian = p.getBayar() - p.getTotal();
			}
			else if (p.getBayar() < p.getTotal()){
				System.out.println("Uangnya kurang. Silahkan input nominal yang lebih besar dari total harga");
				System.out.println("");
			}
		}
		
        p.setKembalian(kembalian);
        
        p.cetak();
    
	}
}