package UTS_A11_2021_13482;

public class MahasiswaTransfer extends MahasiswaBaru{
	String asalUniversitas;

	MahasiswaTransfer(String nim, String nama, int semester, int usia,  String krs[], String asalSekolah, String asalUniversitas) {
		super(nim, nama, semester, usia, krs, asalSekolah);
		this.asalUniversitas = asalUniversitas;
	}
	
	boolean ikutOspek() {
		boolean ospek=false;
		
		return ospek;
	}

	void infoMahasiswa() {
		super.infoMahasiswa();
		System.out.println("Asal Universitas: "+asalUniversitas);
	}
}
