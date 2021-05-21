import hsa.Console;
class Ejemplo14

{   
    static Console c;
    public static void main(String arg[])
	{
	c = new Console();
	int mes;
	c.println("Ingrese un numero para saber que mes es: ");
	mes = c.readInt();
    
	switch (mes) {
	    case 1: c.println("corresponde a enero");
	    break;
	    
	    case 2: c.println("corresponde a febrero");
	    break;
	    
	    case 3: c.println("corresponde a marzo");
	    break;
	    
	    case 4: c.println("corresponde a abril");
	    break;
	    
	    case 5: c.println("corresponde a mayo");
	    break;
	    
	    case 6: c.println("corresponde a junio");
	    break;
	    
	    case 7: c.println("corresponde a julio");
	    break;
	    
	    case 8: c.println("corresponde a agosto");
	    break;
	    
	    case 9: c.println("corresponde a septiembre");
	    break;
	    
	    case 10: c.println("corresponde a octubre");
	    break;
	    
	    case 11: c.println("corresponde a noviembre");
	    break;
	    
	    case 12: c.println("corresponde a diciembre");
	    break;
	}
    
	}
	}
 
	
//segun el numero que ingrese el usuario nos dice a que mes corresponde
