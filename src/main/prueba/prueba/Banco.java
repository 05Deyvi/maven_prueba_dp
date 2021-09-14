package prueba;

import java.util.Scanner;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int c = 0;
		Scanner tecladoString =new Scanner(System.in);
		Scanner teclado =new Scanner(System.in);
		
		System.out.println("ingrese la clave ");
		int c1 = teclado.nextInt();
		if(c1==85) {
			
			do {
				
				System.out.println("BANCO PRODUBANCO");
				System.out.println("*********************");
				System.out.println("elija una opcion");
				System.out.println("1 consultar pagos ");
				System.out.println("2.Realizar transferencia");
				System.out.println("3. salir");
				int o = teclado.nextInt();
				int o1 = 0;
				if(o ==1) {
					
					System.out.println("no tiene ningun pago pendiente");
					
				}else if (o==2) {
					int S=2500;
					System.out.println("ingrese la cuenta al que desea transeferir el monto");
					String cuenta = tecladoString.nextLine();
					System.out.println("ingrese el monto que desea transferir");
					int  m = teclado.nextInt();
					if(m<2500) {
						
						int ST=S-m;
						System.out.println("su saldo es:  " +ST);
						
					}
					
				}else {
					System.out.println("su saldo ingresado no es suficiente con el que tiene");
				}
				
				
			}while(c !=3) ;
			
		}else {
			System.out.println("clave incorrecta");
		}
	
	}

}
