
package ejercicios.funciones;

/**
 * @author alejandrosebastian
 */
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int mayor = 0;
		int a, b, c;
		
		java.util.Scanner lectura = new java.util.Scanner(System.in);
		
		System.out.println("Ingrese el valor de A");
		a = lectura.nextInt();
		
		System.out.println("Ingrese el valor de B");
		b = lectura.nextInt();
		
		System.out.println("Ingrese el valor de C");
		c = lectura.nextInt();
		
		if (a>b){
			if (a>c){
				mayor = a;
			}
			else{
				mayor = c;
			}
		}
		else{
			if (b>c){
				mayor = b;
			}
			else{
				mayor = c;
			}
		}
		
		System.out.println("El numero mayor ingresado es: " + mayor);        
    }
    
}
