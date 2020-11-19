class Pelanggan{
	
	private String nama;
    private char merk, tipe;
    private int jUnit;
    private int harga;
    private int totHarga;
    private int bayar;
    private int kembalian;
    
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public String getNama()
    {
        return this.nama;
    }
    
    public void setMerk(char merk)
    {
        this.merk = merk;
    }
    
    public char getMerk()
    {
        return this.merk;
    }
    
    public void setTipe(char tipe)
    {
        this.tipe = tipe;
    }
    
    public char getTipe()
    {
        return this.tipe;
    }
    
    public void setUnit(int jUnit)
    {
        this.jUnit = jUnit;
    }
    
    public int getUnit()
    {
        return this.jUnit;
    }
    
    public void setHarga(int harga)
    {
        this.harga = harga;
    }
    
    public int getHarga()
    {
        return this.harga;
    }
    
    public void setTotal(int totHarga)
    {
        this.totHarga = totHarga;
   	}
    
    public int getTotal()
    {
        return this.totHarga;
    }
    
    public void setBayar(int bayar)
    {
        this.bayar = bayar;
    }
    
    public int getBayar()
    {
        return this.bayar;
    }
  
    public void setKembalian(int kembalian)
    {
        this.kembalian = kembalian;
    }
   
   	public int getKembalian()
    {
        return this.kembalian;
    }
    
    public void cetak()
    {
    	
    	System.out.println("\n\n\n-------------Struk Pembayaran-------------");
 	    System.out.println(" Nama pelanggan  : " +getNama());
 	    System.out.println("------------------------------------------");
	  	System.out.println(" Total           : " +getTotal() + " rupiah");
	  	System.out.println(" Uang pembayaran : " +getBayar() + " rupiah");
	  	System.out.println(" Uang kembali    : " +getKembalian() + " rupiah");
	  	System.out.println("============================================");           
	}
}