
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Biudzetas bud=new Biudzetas();
		

		while(true){
			int i;
			System.out.println("Pasirinkite Kategorija: Pajamos- '1'  Islaidos - '2'");
			Scanner sc=new Scanner(System.in);
			int kat=sc.nextInt();

			if(kat==1){
				System.out.println("Pasirinkite Kategorija: Ivesti- '1'  Gauti - '2' Visos pajamos-'3'");
				int kat2=sc.nextInt();
				if(kat2==1){
					bud.pridediPajamuIrasa();
					System.out.println("");
				}else if(kat2==2){
					try{
						System.out.println("Iveskite iraso numeri: nuo 0 iki 99");
						i=sc.nextInt();
						bud.gautiPajamuIrasa(i);

					}catch(NullPointerException e){
						System.out.println("nera iraso siuo indeksu!!!!");
					}

					
				}else if(kat2==3){
					for(int a=0;a<bud.pajamos.length;a++){
						try{
							System.out.println("Indeksas: "+a+" / Data:"+bud.pajamos[a].getLaikas()+"/ Info:"
						+bud.pajamos[a].getInfo()+"/ Suma:"+bud.pajamos[a].getSuma()+"/ Kategorija:"+bud.pajamos[a].getPajkat());
						}catch(NullPointerException e){}
					}
					System.out.println();
				}else{
					System.out.println("Blogai pasirinkta kategorija!!!!!");
				}
			}else if(kat==2){
				System.out.println("Pasirinkite Kategorija: Ivesti- '1'  Gauti - '2' Visos islaidos-'3'");
				int kat2=sc.nextInt();
				
				
				if(kat2==1){
					bud.pridetiIslaiduIrasa();
				}else if(kat2==2){
					
					try{
						System.out.println("Iveskite iraso numeri: nuo 0 iki 99");
						i=sc.nextInt();
						bud.gautiIslaiduIrasa(i);
					}catch(NullPointerException e){
						System.out.println("nera iraso siuo indeksu!!!!");
					}
					


//					  IslaiduIrasas ii = bud.gautiIslaiduIrasa(i);
//					  if (ii != null) {
//					  		System.out.println(ii.getSuma() + ii.getDataSuLaiku() + ...);
//					  } else {
//					  		System.out.println("nera iraso siuo indeksu!!!!");
//					  }

					
					
				}else if(kat2==3){
					for(int a=0;a<bud.islaidos.length;a++){
						try{
							System.out.println("Indeksas: "+a+" / Data:"+bud.islaidos[a].getDataSuLaiku()+"/ Info:"
						+bud.islaidos[a].getInfo()+"/ Suma:"+bud.islaidos[a].getSuma()+"/ Kategorija:"+bud.islaidos[a].getKategorija());
						}catch(NullPointerException e){}
					}
					System.out.println();
				}else{
					System.out.println("Blogai pasirinkta kategorija!!!!!");
				}
			}else{
				System.out.println("Blogai pasirinkta kategorija!!!!!");
			}
			
		}	
	}
}
