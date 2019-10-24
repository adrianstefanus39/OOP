package pertemuan;

public class MahasiswaAkun extends Mahasiswa{

	public void Calculate(){
		System.out.println("Calculating something...");
	}
	
	public void Journal(){
		System.out.println("Making a Journal...");
	}
	@Override
	public void kegiatan() {
		// TODO Auto-generated method stub
		Calculate();
	}
	
}
