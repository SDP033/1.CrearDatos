package generarNombre;

public class Nombre {

	public static void main(String[] args) {

		if (args.length < 1) {
			System.exit(-1);
		}

		System.out.println("Mi nombre es " + args[0]);
		System.exit(0);

	}

}
