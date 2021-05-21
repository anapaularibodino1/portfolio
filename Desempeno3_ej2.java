import hsa.Console;
class Desempeno3_ej2

{   
    static Console c;
    public static void main(String arg[])
	{
	c = new Console();
	float b, h, superficie;
	    c.print("base: ");
		b = c.readFloat();
	    c.print("altura: ");
		h = c.readFloat();
    
	    superficie = b*h/2;
		c.println(superficie);
	}  
}


//genera la superficie de un cuadrado con altura y base a definir por el usuarios
