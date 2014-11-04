import java.math.*;

class Biodata{ //nama kelas
//deklarasi variabel
	String Nama;//mendeklarasikan variabel Nama yang bertipe data string
	BigInteger Npm;//mendeklarasikan variabel Umur yang bertipe data integer
	String JK;//mendeklarasikan variabel Jenis Kelamin yang bertipe data string
	String Alamat;//mendeklarasikan variabel Alamat yang bertipe data string
	Integer Umur;//mendeklarasikan variabel Umur yang bertipe data integer
	
	public String getNama(){ //inisialisasi nilai Nama
		return Nama; //mengembalikan nilai Nama	
	}
	public BigInteger getNpm(){ //inisialisasi nilai Nama
		return Npm;	//mengembalikan nilai Npm
	}
	public String getJK(){ //inisialisasi nilai Nama
		return JK;	//mengembalikan nilai Jenis Kelamin
	}
	public String getAlamat(){ //inisialisasi nilai Nama
		return Alamat;	//mengembalikan nilai Alamat
	}
	public Integer getUmur(){ //inisialisasi nilai Nama
		return Umur; //mengembalikan nilai Umur
	}
	
	public void setNama(String a){ //deklarasi set untuk atribut Nama 
		this.Nama=a;	
	}
	public void setNpm(BigInteger x){ //deklarasi set untuk atribut Npm
		this.Npm=x;	
	}
	public void setJK(String c){  //deklarasi set untuk atribut Jenis Kelamin
		this.JK=c;	
	}
	public void setAlamat(String b){  //deklarasi set untuk atribut Alamat
		this.Alamat=b;	
	}
	public void setUmur(Integer y){ //deklarasi set untuk atribut Umur
		this.Umur=y;	
	}
	
	
	public static void main(String[] args){
	Biodata biodatasaya= new Biodata();
	biodatasaya.setNama("Moh Rachmat Wira Utama"); //mengisi nilai setter Nama
	System.out.print("Nama Anda Adalah :"); //output kalimat
	System.out.println(biodatasaya.getNama()); //memanggil setter Nama dengan getter
	
	biodatasaya.setNpm(new BigInteger("4513210025")); //mengisi nilai setter Npm
	System.out.print("Npm Anda yaitu :");//output kalimat
	System.out.println(biodatasaya.getNpm());	//memanggil setter Npm dengan getter
	
	biodatasaya.setJK("Laki-laki "); //mengisi nilai setter Jenis Kelamin
	System.out.print("Jenis Kelamin Anda Adalah :");//output kalimat
	System.out.println(biodatasaya.getJK()); //memanggil setter Jenis Kelamin dengan getter
	
	biodatasaya.setAlamat("Bekasi "); //mengisi nilai setter Alamat
	System.out.print("Alamat Anda Adalah :");//output kalimat
	System.out.println(biodatasaya.getAlamat()); //memanggil setter Alamat dengan getter
	
	biodatasaya.setUmur(19); //mengisi nilai setter Umur
	System.out.print("Umur Anda Adalah :"); //output kalimat
	System.out.println(biodatasaya.getUmur()); //memanggil setter Umur dengan getter
	
	}
}