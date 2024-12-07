import cp.pack.*;

public class DaughterOutsidePackage extends Mother {
	DaughterOutsidePackage(){
		publicArg = 1;
		protectedArg = 1;
		//privateArg = 1;   // The field Mother.privateArg is not visible
		//defaultArg = 1;	// The field Mother.defaultArg is not visible
		
		publicMethod();
		protectedMethod();
		//privateMethod(); 	//The method privateMethod() from the type Mother is not visible
		//defaultMethod();	//The method defaultMethod() from the type Mother is not visible	
	}
}
