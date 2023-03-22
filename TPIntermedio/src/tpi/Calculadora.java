package tpi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		double num1=0;
		double num2=0;
		int op=0;
		
		System.out.println("Bienvenidos a la calculadora!!");
		Scanner sn=new Scanner (System.in);
		num1=pedirPrimerNumero();
		
		double acum=num1;
		
		do
		{		
			System.out.print("\n1. Sumar");
			System.out.print("\n2. Restar");
			System.out.print("\n3. Multiplicar");
			System.out.print("\n4. Dividir");
			System.out.print("\n5. Limpiar");
			System.out.print("\n6. Salir");
			System.out.print("\n¿Qué opción desea realizar? ");
			op=sn.nextInt();
		
			switch (op)
			{
				case 1:
				{
					num2=pedirSegundoNumero();
					double sum=sumar(acum,num2);
					System.out.println("\nLa suma es: "+sum+"\n");
					acum=sum;
					break;
				}
				
				case 2:
				{
					num2=pedirSegundoNumero();
					double res=restar(acum,num2);
					System.out.println("\nLa resta es: "+res+"\n");
					acum=res;
					break;
				}
				
				case 3:
				{
					num2=pedirSegundoNumero();
					double prod=multiplicar(acum,num2);
					System.out.println("\nEl producto es: "+prod+"\n");
					acum=prod;
					break;
				}
				
				case 4:
				{
					num2=pedirSegundoNumero();
					double coc=0;
					if (num2==0)
					{
						System.out.print("Hemos detectado un 0 para el número divisor. Por favor, ingrese un número distinto a 0: ");
						num2=sn.nextInt();
						coc=dividir(acum,num2);
						acum=coc;
					}
					else
					{
						coc=dividir(acum,num2);
						acum=coc;
					}
					System.out.println("\nEl cociente es: "+coc+"\n");
					break;
				}
				
				case 5:
				{
					num1=pedirPrimerNumero();
					acum=num1;
					break;
				}
				
				case 6:
				{
					System.out.print("\nGracias por utilizar la calculadora. Vuelva pronto!!");
					System.exit(1);
				}
				
				default:
				{
					System.out.println("\nOpción incorrecta!"+"\n");
				}
			}
		}while(op!=6);
	}
	
	public static double sumar (double n1, double n2)
	{
		double suma=n1+n2;
		return suma;
	}
	
	public static double restar (double n1,double n2)
	{
		double resta=n1-n2;
		return resta;
	}
	
	public static double multiplicar (double n1, double n2) 
	{
		double producto=n1*n2;
		return producto;
	}
	
	public static double dividir (double n1, double n2)
	{
		double cociente=n1/n2;
		return cociente;
	}	
	public static double pedirSegundoNumero()
	{
		double num2=0;
		boolean rep2=true;
		Scanner sn2=new Scanner(System.in);
		System.out.print("Ingrese el segundo número: ");
		do 
		{
			try {
					num2 = sn2.nextInt();
					rep2=false;
				}
			catch (InputMismatchException e) {	
				System.out.println("Ha ocurrido un error");
				System.out.print("Ingrese el segundo número: ");
				sn2.nextLine();
				}	
		} while(rep2);
		return num2;
	}
	
	public static double pedirPrimerNumero()
	{
		double num1=0;
		boolean rep=true;
		Scanner sn3 = new Scanner (System.in);
			System.out.print("\nIngrese el primer número: ");
			do 
			{
				try {
						num1 = sn3.nextInt();
						rep=false;
					}
				catch (InputMismatchException e) {	
					System.out.println("Ha ocurrido un error");
					System.out.print("Ingrese el primer número: ");
					sn3.nextLine();
					}	
			} while(rep);
		return num1;
	}
}
