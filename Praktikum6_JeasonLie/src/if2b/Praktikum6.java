package if2b;

public class Praktikum6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int max = 3;

	}

}
class Pegawai{
	String nama;
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	int gajiPokok, tunjangan;
	
	public int getGajiPokok() {
		return gajiPokok;
	}
	public void setGajiPokok(int gajiPokok) {
		this.gajiPokok = gajiPokok;
	}
	public int getTunjangan() {
		return tunjangan;
	}
	public void setTunjangan(int tunjangan) {
		this.tunjangan = tunjangan;
	}
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