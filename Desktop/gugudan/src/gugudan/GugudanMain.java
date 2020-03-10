package gugudan;

public class GugudanMain {
	public static void main(String[] args) {
		
		for(int i=0;i<9;i++) {
			System.out.println((i+1)+"´Ü");
			gugudan.print(gugudan.calculate(i+1));
			System.out.println("\n");
		}

	}
}