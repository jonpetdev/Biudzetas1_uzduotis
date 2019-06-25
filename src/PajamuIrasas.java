import java.time.LocalDate;


public class PajamuIrasas {
	private float suma;
	private pajamuKategorija pajkat;
	private LocalDate laikas;
	private boolean operacija;
	private String info;

	
	PajamuIrasas(float suma2, LocalDate laikas2, String info,pajamuKategorija pajkat){
		this.suma=suma2;
		this.pajkat=pajkat;
		this.laikas=laikas2;
		this.info=info;
	}

	public float getSuma() {
		return suma;
	}

	public void setSuma(float suma) {
		this.suma = suma;
	}


	public LocalDate getLaikas() {
		return laikas;
	}

	public void setLaikas(LocalDate laikas) {
		this.laikas = laikas;
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

	public pajamuKategorija getPajkat() {
		return pajkat;
	}

	public void setPajkat(pajamuKategorija pajkat) {
		this.pajkat = pajkat;
	}
	
	
	
	
}
