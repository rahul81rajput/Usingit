package abstraction;

public interface abs {
	int a=60;
	void rect();
	
	default void circle() {
		System.out.println("Circle");
	}
         static void square() {
        	 System.out.println("Square");
         }
}
