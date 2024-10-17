public class Main {
	public static void main (String[]args){
		for(int i = 0 ;i < args.length; i++) {
		try{
		System.out.println("Argumentos" + i + ":" + args[i]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("error: " + e.getMessage());
	}
}
}
}
