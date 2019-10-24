package pertemuan;

public abstract class Mahasiswa {
	private String nama;
	private String nim;
	private int age;
	
	public Mahasiswa(){
		
	}
	public abstract void kegiatan();
	
	public String getNama(String nama) {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
