
public abstract class WebCard {
	protected String message; //protected since we'll set the message in the child classes
	private String to;

	public WebCard(String to){
		this.to = to;
		this.setMessage();		
	}

	public String getMessage(){
		return this.message;
	}
	
	public String getTo() {
		return to;
	}
	
	abstract void setMessage();
		
	abstract void showMessage(); 

}
