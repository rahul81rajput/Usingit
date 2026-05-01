package poly;

public class Polymorp {
	int a;
    int b;
       void sub() {
    	   System.out.println(a-b);
       }
       void sub(int a,int b) {
    	   this.a=a;
    	   this.b=b;
    	   System.out.println(a-b);
       }
       void sub (double b,int a) {
    	   System.out.println(b-a);
    	   
       }
       void sub(int a, float c) {
    	   System.out.println(c-a);
       }
}
