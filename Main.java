import java.util.Random;

public class Main {
	private int caras;
	private Random random;

	public Dado(int caras) {
		this.caras = caras;
		this.random = new Random();
	}
	public int lanzar() {
		return random.nextInt(caras) + 1;
	}

	public static void main (String[]args){
		Dado dado = new Dado(6);
		
		int resultado1 = dado.lanzar();
		int resultado2 = dado.lanzar();


//		System.out.println("Resultado del lanzamiento: " + dado.lanzar());
		System.out.println("Resultado del primer lanzamiento: " + resultado1 );
		System.out.println("Resultado del segundo lanzamiento: " + resultado2 );
		
		System.out.println("Detalles del lanzamiento");
		System.out.println("Lanzamiento 1: " + resultado1 + "dado de " + dado.caras + " caras");
		System.out.println("Lanzamiento 2: " + resultado2 + "dado de " + dado.caras + " caras");
		System.out.println("Suma total de los resultados: " + (resultado1 + resultado2));

	}
}





		for(int i = 0 ;i < args.length; i++) {
		try{
		System.out.println("Argumentos" + i + ":" + args[i]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("error: " + e.getMessage());
	}
}
}
}
