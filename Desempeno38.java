import hsa.Console;
class Desempeno38

{   
    static Console c;
    public static void main(String arg[])
	{
	c = new Console();
	float contador, promedio, suma, numerosIngresados, a;
       
	    suma = 0;
	    contador = 0;
	    
	    while (contador<7){
		c.println("ingrese su  número: ");
		numerosIngresados =  c.readFloat();
		suma = suma + numerosIngresados;
		
		contador++;
	    }
	c.println(suma);
	promedio = suma/7;
	c.println(promedio);
	if (promedio<100){
	c.println("El promedio general es menor que 100");
	}else{
	c.println("El promedio general es mayor que 100");
	}

	}

}
 //suma los 7  numeros ingresados por el usuario, los suma y hace un promedio general e indica si ese promedio es mayor o menor a 100
