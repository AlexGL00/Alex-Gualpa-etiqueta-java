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
		System.out.println("Resultado del lanzamiento: " + dado.lanzar());
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
