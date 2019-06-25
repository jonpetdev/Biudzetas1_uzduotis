import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
/*
 * nepanaudotas import java.time.LocalTime
 * istrinti ji
 */
import java.util.Scanner;


public class Biudzetas {
	
	
	PajamuIrasas[] pajamos=new PajamuIrasas[100];
	IslaiduIrasas[] islaidos=new IslaiduIrasas[100];
	
	
	
	
	public void pridediPajamuIrasa(){

		pajamuKategorija pajkateg = null;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Kategorija:");
		System.out.println("[1]- Atlyginimas - [1]");
		System.out.println("[2]- Kysis - [2]");
		System.out.println("[3]- Chalturke - [3]");
		System.out.println("[4]- Vokelis - [4]");
		int pajkat= 0;
		pajkat = sc.nextInt();
		
		switch(pajkat){
		case 1:pajkateg=pajamuKategorija.ATLYGINIMAS;
			break;
		case 2:pajkateg=pajamuKategorija.KYSIS;
			break;
		case 3:pajkateg=pajamuKategorija.CHALTURKE;
			break;
		case 4:pajkateg=pajamuKategorija.VOKELIS;
			break;
		default:System.out.println("Blogai pasirinkta kategorija");
			return;
		}
		
		
		System.out.println("Ivesk info:");
		String info= sc.next();
		System.out.println("Ivesk suma:");
		float suma = sc.nextFloat();
		LocalDate laikas= LocalDate.now();
		PajamuIrasas pajI=new PajamuIrasas(suma, laikas, info, pajkateg);
		
		for(int i =0; i <pajamos.length;i++){
			PajamuIrasas pajam=pajamos[i];
			if(pajam==null){
				pajamos[i]=pajI;
				break;
			}
		}
		System.out.println("Yrasyta!!!!!!");
		System.out.println();
		
		
	}
	public void pridetiIslaiduIrasa(){

		Scanner sc = new Scanner(System.in);
		islaiduKategorija iskateg;
		System.out.println("Kategorija:");
		System.out.println("[1]- Maistas - [1]");
		System.out.println("[2]- Nuoma - [2]");
		System.out.println("[3]- Komunaliniai - [3]");
		System.out.println("[4]- Pramogos - [4]");
		System.out.println("[5]- Kuras - [5]");
		System.out.println("[6]- Vaistai - [6]");
		int iskat= 0;
		iskat = sc.nextInt();
		
		switch(iskat){
		case 1:iskateg=islaiduKategorija.MAISTAS;
			break;
		case 2:iskateg=islaiduKategorija.NUOMA;
			break;
		case 3:iskateg=islaiduKategorija.KOMUNALINIAI;
			break;
		case 4:iskateg=islaiduKategorija.PRAMOGOS;
			break;
		case 5:iskateg=islaiduKategorija.KURAS;
			break;
		case 6:iskateg=islaiduKategorija.VAISTAI;
			break;
		default:System.out.println("Blogai pasirinkta kategorija");
			return;
		}
		
		System.out.println("Ivesk info:");
		String info= sc.next();
		System.out.println("Ivesk suma:");
		float suma = sc.nextFloat();
		LocalDate dataSuLaiku= LocalDate.now();
		IslaiduIrasas isI=new IslaiduIrasas(suma, dataSuLaiku, info, iskateg);
		
		for( int i =0; i <islaidos.length;i++){
			IslaiduIrasas islaid=islaidos[i]; 
			if(islaid==null){
				islaidos[i]=isI;
				break;
			}
		}
		System.out.println("Yrasyta!!!!!!");
		System.out.println();
	}
	public void gautiPajamuIrasa(int i){

		System.out.println("Suma: "+pajamos[i].getSuma()+"/ Laikas: "+pajamos[i].getLaikas()+ "/ Info: "+pajamos[i].getInfo()
				+"/ Kategorija:"+pajamos[i].getPajkat());

		System.out.println();
		
	}
	public void gautiIslaiduIrasa(int i){

		System.out.println("Suma: "+islaidos[i].getSuma()+"/ Laikas: "+islaidos[i].getDataSuLaiku()
				+ "/ Info: "+islaidos[i].getInfo()+"/ Kategorija:"+islaidos[i].getKategorija());

		System.out.println();
	}
}
