import java.util.Scanner;
public class patrones {

	public static void main(String[] args) {
		int cont, nMax;
		//Declaracion de variables
		String strPatron = new String("");
		Scanner sc = new Scanner(System.in);
		//adquiere el valor máximo
		System.out.println("Ingrese el valor máximo==>");
		nMax=sc.nextInt();

		for(cont=0;cont<nMax;cont++) {
			if(cont%2==0) {
				strPatron+="*";
			}
			else {
				strPatron+=".";
			}
		}
		System.out.println(strPatron);
		strPatron="";
		for(cont=0;cont<nMax;cont+=4) {
				strPatron+="1234";
			}

		System.out.println(strPatron.substring(0, nMax));
		strPatron="";
		for(cont=0;cont<nMax;cont++) {
			if(cont%2==0) {
				strPatron+="||";
			}
			else {
				strPatron+="*";
			}
		}
		System.out.println(strPatron.substring(0, nMax));

	}

}
