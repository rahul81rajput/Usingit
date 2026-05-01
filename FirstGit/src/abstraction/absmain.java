package abstraction;

public class absmain implements abs{
	public void rect() {
		System.out.println("Rectangle");
	}

	public static void main(String[] args) {
		absmain a= new absmain();
		a.circle();
		a.rect();
		abs.square();
		

	}

}
