import hsa.Console;
class desempeno55

{   
    static Console c;
    public static void main(String arg[])
	{
	c = new Console();
	int NumeroAMultiplicar, i, tabla, resultado;
	NumeroAMultiplicar = 5;
	tabla = 0;
	
	for(i=0; i<20; i++){
	    tabla++;
	    resultado = NumeroAMultiplicar * tabla;
      
	    c.println(NumeroAMultiplicar + "*" + tabla + ": " + resultado);
	}
	
	}

}
//realiza la multiplicacion de la tabla del 5 hasta 20
