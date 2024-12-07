package cp.pack;
import cp.pack.Mother;

public class UnrelatedInsidePackage {
	Mother var;
	UnrelatedInsidePackage(){
		var.publicArg = 1;
		var.protectedArg = 1;
		//var.privateArg = 1;  //The field Mother.privateArg is not visible
		var.defaultArg = 1;
		
		var.publicMethod();
		var.protectedMethod();
		//var.privateMethod(); //The method privateMethod() from the type Mother is not visible
		var.defaultMethod();		
	}
	
}
