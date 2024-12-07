package cp.pack;

public class Mother {
	public int publicArg = 1;
	protected int protectedArg = 1;
	private int privateArg = 1;
	int defaultArg = 1;
	
	public void publicMethod(){
		System.out.println("public: " + this.publicArg);
	}
	protected void protectedMethod(){
		System.out.println("protected: " + this.protectedArg);
	}
	private void privateMethod(){
		System.out.println("private: " + this.privateArg);		
	}
	void defaultMethod(){
		System.out.println("default: " + this.defaultArg);
	}	

}
