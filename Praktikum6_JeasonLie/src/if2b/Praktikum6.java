package if2b;

public class Praktikum6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pegawai pegawai = new Pegawai();
		pegawai.nama = "Jeason Lie";
		pegawai.gajiPokok = 3900000;
		pegawai.tunjangan = 700000;
	}

}
class Pegawai{
	String nama;
	int gajiPokok, tunjangan;
	
	int totalGaji() {
		return gajiPokok + tunjangan;
	}
	void tampilBiodata() {
		System.out.println("Nama = "+nama);
		System.out.println("Gaji Pokok = "+gajiPokok);
		System.out.println("Tunjangan = "+tunjangan);
		System.out.println("Total Gaji = "+totalGaji());
	}
}