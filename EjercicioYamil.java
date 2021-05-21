import hsa.Console;
class EjercicioYamil

{   
    static Console c;
    public static void main(String arg[])
	{
	c = new Console();
	float calificacion1, calificacion2, calificacion3, promedio;
	    c.print("Ingrese la primer calificacion: ");
	    calificacion1 = c.readFloat();
	     c.print("Ingrese la segunda calificacion: ");
	    calificacion2 = c.readFloat();
	     c.print("Ingrese la tercer calificacion: ");
	    calificacion3 = c.readFloat();
	    
	    promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
	    c.print("promedio" + ": " + promedio);

	    if (promedio<4){
	    c.print(" condicion LIBRE");}
	    
	    if (promedio>=4 && promedio<8){
	    c.print(" condicion REGULAR");}
	    
	    if (promedio>=8){
	    c.print(" condicion PROMOCIONADO");}
	}
	

}//imprime la condicion del alumno segun el calculo de su promedio de notas
