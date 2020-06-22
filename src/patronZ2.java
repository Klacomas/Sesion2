import java.util.Scanner;
public class patronZ2 {

	public static void main(String[] args) {
		//Declaración de variables
		int i,j, nMax, menu;
		String strPatron=new String();
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese el valor máximo==>");
		nMax=sc.nextInt();
		//nMax=5;
		for(i=0;i<nMax;i++)
		{
			for (j=0;j<=nMax;j++) {
				if(i==0) {
					if(j!=nMax) {
						strPatron+="*";
					}else {
						strPatron+=" ";
					}
				}
				else if(i==(nMax-1)){
					if(j!=0) {
						strPatron+="*";
					}else {
						strPatron+=" ";
					}
				}
				else {
					if(j!=0 && j!=(nMax)) {
						strPatron+="*";
					}else {
						strPatron+=" ";
					}
					
				}
			}
			System.out.println(strPatron);
			strPatron="";
		}
		System.out.println("Saliendo...");
		System.out.println("I love this game!");

	}
}
