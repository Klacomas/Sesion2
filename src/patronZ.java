import java.util.Scanner;
public class patronZ {

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
		System.out.println("Saliendo...");
		System.out.println("I love this game!");

	}
}
