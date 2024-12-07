import cp.pack.Mother;

public class UnrelatedOutsidePackage {
	Mother var;
	UnrelatedOutsidePackage(){
		var.publicArg = 1;
		//var.protectedArg = 1;	//The field Mother.protectedArg is not visible
		//var.privateArg = 1;  	//The field Mother.privateArg is not visible
		//var.defaultArg = 1;   //The field Mother.defaultArg is not visible
		
		var.publicMethod();
		//var.protectedMethod();//The method protectedMethod() from the type Mother is not visible
		//var.privateMethod();  //The method privateMethod() from the type Mother is not visible
		//var.defaultMethod();	//The method defaultMethod() from the type Mother is not visible	
	}
	
}
