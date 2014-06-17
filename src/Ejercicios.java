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
			File file = new File(path);
			Scanner r = new Scanner(file);
			int x = 0;
			while (r.hasNext())
			{
				x=r.nextInt();
			}
			return x;
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return -1;

	}
	
	//Suma todos los numeros del archivo
	static int sumarNumerosDeArchivo(String path)
	{
		try
		{
			File file = new File(path);
			Scanner r = new Scanner(file);
			int x = 0;
			while (r.hasNext())
			{
				x+=r.nextInt();
			}
			return x;
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		return -1;


	}

	
	//Devuelve true si encuentra un numero en un archivo, de lo contrario devuelve false
	static boolean existeEnArchivo(String path,int num)
	{		
		try
		{
	Scanner scanner = new Scanner(path);
	boolean b = scanner.nextBoolean();
	return b;
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
}
	
	//Devuelve el numero menor de un archivo
	static int getMenorDeArchivo(String path)
	{
		try
		{
		File file = new File(path);
		Scanner r = new Scanner(file);

		return r.nextInt();
		}catch (Exception e)
		{
			e.printStackTrace();
		}
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
