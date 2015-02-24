
package numReversibles;
import java.util.Scanner;
/**
 * 
 * @author Begoña López
 *
 */
public class Reversibles {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		long numero = teclado.nextLong();
		while (numero!=0){
			if (numero < 1000000000 && numero >=0) {
				String numeroRevertido = "";
				long suma=0L;
				String numStr = Long.toString(numero);
				for (int i = numStr.length()-1; i>=0; i--) {
					if (numStr.charAt(i)!=0){
						numeroRevertido = numeroRevertido + numStr.charAt(i);
					}
				}
				Long numReverLong = Long.parseLong(numeroRevertido);
				numeroRevertido=Long.toString(numReverLong);
				if (numeroRevertido.length() != numStr.length()){
					System.out.println("NO");
				}else{
					suma=numero+Long.parseLong(numeroRevertido);
					if (suma % 2 == 0) {
						System.out.println("NO");
					}else {
						System.out.println("SI");
					}
				}
			}else {
				System.out.println("NO");
			}
			numero = teclado.nextLong();
		}
			
	}
}
