class Orang{
	String Nama;
	public String getNama(){
		return Nama;	
	}
	public void setNama(String x){ 	//Sebagai untuk pemanggilan Variabel yang akan diisikan
		this.Nama=x;	
	}
	public static void main(String[] args){
	Orang orangPertama= new Orang();
	orangPertama.setNama("Moh Rachmat Wira Utama"); //Variabel yang sudah terpanggil
	System.out.print("Nama Anda Adalah :");
	System.out.print(orangPertama.getNama());	//Pemanggilan Variabel diatas yaitu dengan "getNama"
	}
}