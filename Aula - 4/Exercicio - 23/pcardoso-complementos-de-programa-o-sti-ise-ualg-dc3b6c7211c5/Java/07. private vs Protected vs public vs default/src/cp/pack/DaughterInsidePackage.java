package cp.pack;
public class DaughterInsidePackage extends Mother {
	DaughterInsidePackage(){
		publicArg = 1;
		protectedArg = 1;
		//privateArg = 1;  //The field Mother.privateArg is not visible
		defaultArg = 1;
		
		publicMethod();
		protectedMethod();
		//privateMethod(); //The method privateMethod() from the type Mother is not visible
		defaultMethod();		
	}
}
