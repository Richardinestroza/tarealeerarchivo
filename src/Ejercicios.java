import java.io.File;
import java.util.Scanner;


public class Ejercicios {
	
	//devuelve la suma de a y b
	static int sumarNumeros(int a, int b)
	{
		
		return a+b;
	}
	
	//devuelve la resta de a y b
	static int restarNumeros(int a, int b)
	{
		return a-b;
	}
	
	//devuelve la multiplicacion de a y b
	static int multiplicarNumeros(int a, int b)
	{
		return a*b;
	}
	
	//devuelve la division de a y b
	static int dividirNumeros(int a, int b)
	{
		return a/b;
	}
	
	//devuelve el primer numero de un archivo
	static int getPrimerNumeroDeArchivo(String path)
	{
		try
		{
			File r_archivo = new File(path);
			Scanner r = new Scanner(r_archivo);
			return r.nextInt();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
	//devuelve el ultimo numero de un archivo
	static int getUltimoNumeroDeArchivo(String path)
	{
		try
		{
			File r2_archivo = new File(path);
			Scanner r2 = new Scanner(r2_archivo);
			return r2.nextInt();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return -1;
	}
	
	//Suma todos los numeros del archivo
	static int sumarNumerosDeArchivo(String path)
	{
		return -1;
	}
	
	//Devuelve true si encuentra un numero en un archivo, de lo contrario devuelve false
	static boolean existeEnArchivo(String path,int num)
	{		
		return false;
	}
	
	//Devuelve el numero menor de un archivo
	static int getMenorDeArchivo(String path)
	{
		return -1;
	}
	
	//Devuelve el numero mayor de un archivo
	static int getMayorDeArchivo(String path)
	{
		return -1;
	}
	
	public static void main(String args[])
	{

	}
}
