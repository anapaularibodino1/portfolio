import hsa.Console;
class Desempeno16

{   
    static Console c;
    public static void main(String arg[])
	{
	c = new Console();
	float num1, num2, num3;
	  c.print("ingrese el primer numero: ");
	  num1 = c.readInt ();
	  c.print("ingrese el segundo numero: ");
	  num2 = c.readInt ();
	  c.print("ingrese el tercer numero: ");
	  num3 = c.readInt ();
	  
	  
	  if (num1<10 || num2<10 || num3 <10){
	  c.print("alguno de los numeros es menor a 10");
	  }
	  else{
	  c.print("ninguno de los numeros es menor a 10");
	  }

	}
}

//determina entre los 3 numeros ingresados por el usuario si alguno es mayor o menor a 10
