import java.util.Arrays;
import java.util.Random;

public class aleatorio {

	public static void main(String[] args) {
		Random aleatorio = new Random();
	    int d =5000;
	    int valor = 0;
	    for (int i = 0; i < d; i++) {
	        System.out.println("Número gerado: " + aleatorio.nextInt(50000));
	  

	}

}
