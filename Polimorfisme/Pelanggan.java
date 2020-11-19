class Pelanggan{
	
	protected String nama;
	    
    public void setNama(String nama){
		this.nama = nama;
	}
	
	public String getNama(){
        return this.nama;
    }
    
    void proses(){
		System.out.println("Informasi Pembayaran Pelanggan " +this.nama);
	}
}