import java.time.LocalDate;


public class IslaiduIrasas {
	private float suma;
	private islaiduKategorija kategorija;
	private LocalDate dataSuLaiku;
	private boolean operacija;

	private String info;


	IslaiduIrasas(float suma, LocalDate dataSuLaiku, String info, islaiduKategorija kategorija) {
		this.suma = suma;
		this.kategorija = kategorija;
		this.dataSuLaiku = dataSuLaiku;
		this.info = info;
	}


	public float getSuma() {
		return suma;
	}


	public void setSuma(float suma) {
		this.suma = suma;
	}


	public islaiduKategorija getKategorija() {
		return kategorija;
	}


	public void setKategorija(islaiduKategorija kategorija) {
		this.kategorija = kategorija;
	}


	public LocalDate getDataSuLaiku() {
		return dataSuLaiku;
	}


	public void setDataSuLaiku(LocalDate dataSuLaiku) {
		this.dataSuLaiku = dataSuLaiku;
	}


	public boolean isOperacija() {
		return operacija;
	}


	public void setOperacija(boolean operacija) {
		this.operacija = operacija;
	}


	public String getInfo() {
		return info;
	}


	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
