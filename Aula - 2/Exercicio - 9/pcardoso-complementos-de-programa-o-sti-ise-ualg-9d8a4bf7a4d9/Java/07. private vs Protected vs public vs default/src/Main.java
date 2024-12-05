import cp.pack.Mother;

public class Main {

	public static void main(String[] args) {
		Mother m = new Mother();
		m.publicArg = 2;
		//m.protectedArg = 2;	//The field Mother.protectedArg is not visible
		//m.privateArg = 2; 	//The field Mother.privateArg is not visible
		//m.defaultArg = 2;		//The field Mother.defaultArg is not visible
		
		
		m.publicMethod();
		//m.protectedMethod();	//The method protectedMethod() from the type Mother is not visible
		//m.privateMethod(); 	//The method privateMethod() from the type Mother is not visible
		//m.defaultMethod();	//The method defaultMethod() from the type Mother is not visible 		
	}

}
