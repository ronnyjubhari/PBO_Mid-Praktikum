import java.util.Scanner;

class MerkO extends Pelanggan{
	
	private char merk, tipe;
	private int jUnit, bayar;
	private int totHarga, harga;
	private int kembalian;
	
	public void setMerk(char merk){
		this.merk = merk;
	}
	
	public char getMerk(){
        return this.merk;
    }
    
	public void setTipe(char tipe){
		this.tipe = tipe;
	}
	
	public char getTipe(){
        return this.tipe;
    }
    
	
	@Override
	void proses(){
    	
		harga=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Silahkan pilih Tipe (M/K/L) : ");
		tipe = input.next().charAt(0);
			
        if (tipe == 'M' || tipe == 'm'){
              harga = 115000;
        }
        else if (tipe == 'K' || tipe == 'k'){
              harga = 135000;
        }
        else if (tipe == 'L' || tipe == 'l'){
              harga = 550000;
        }
        else{
              System.out.println("Tipe yang Anda pilih tidak ada!!!.");
              System.out.println("");          	            			
        }  
        
        System.out.print("Jumlah Unit Yang Diinginkan : ");
		jUnit= input.nextInt();
		
	}
	
	public int getTotal(){
        return jUnit * harga;
    }
    
    public void setBayar(int bayar){
		this.bayar = bayar;
	}
    
    public int getBayar(){
        return bayar;
    }    
    
    public void setKembalian(int bayar){
		kembalian = bayar - harga;
	}
	
	public int getKembalian(){
		return kembalian;
	}
    
    public void showStruk(){
 
        System.out.println("\n\n     Struk Pembayaran PLN      ");
        System.out.println("===============================");
        System.out.println("Nama Pelanggan        : " +getNama());
        System.out.println("=================================");
        System.out.println("Total Harga           : Rp." +getTotal());
        System.out.println("Uang Pembayaran       : Rp." +getBayar());
        System.out.println("Kembalian             : Rp." +getKembalian());
    }
}