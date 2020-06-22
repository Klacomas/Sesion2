import java.util.Scanner;
public class ciclosAnidados {

	public static void main(String[] args) {
		//Declaración de variables
		int i,j, nMax, menu;
		String strPatron=new String();
		Scanner sc= new Scanner(System.in);
		do {
		//adquiere el valor máximo
			System.out.println("Seleccione patron");
			System.out.println("1.- Cuadrado vacio");
			System.out.println("2.- Z");
			System.out.println("3.- X");
			System.out.println("0.- Salir");
	
			menu=sc.nextInt();
			System.out.println("Ingrese el valor máximo==>");
			nMax=sc.nextInt();
			//nMax=5;
			if(menu==1) {
				for(i=0;i<nMax;i++)
				{
					for (j=0;j<nMax;j++) {
						if(i==0||i==nMax-1) {
							strPatron+="*";
						}
						else if(j==0||j==nMax-1){
							strPatron+="*";
						}
						else {
							strPatron+=" ";
						}
					}
					System.out.println(strPatron);
					strPatron="";
				}
			}
			else if(menu==2) {
				for(i=0;i<nMax;i++)
				{
					for (j=0;j<nMax;j++) {
						if(i==0||i==nMax-1) {
							strPatron+="*";
						}
						else if(j==(nMax-i-1)){
							strPatron+="*";
						}
						else {
							strPatron+=" ";
						}
					}
					System.out.println(strPatron);
					strPatron="";
				}
			}
			else if(menu==3) {
				for(i=0;i<nMax;i++)
				{
					for (j=0;j<nMax;j++) {
						if(j==i||j==(nMax-i-1)) {
							strPatron+="*";
						}
						else {
							strPatron+=" ";
						}
		
					}
					System.out.println(strPatron);
					strPatron="";
				}
			}
			else if(menu!=0){
				System.out.println("Ingrese una opción válida");
			}
		}while (menu!=0);
		System.out.println("Saliendo...");
		System.out.println("I love this game!");

	}
}
