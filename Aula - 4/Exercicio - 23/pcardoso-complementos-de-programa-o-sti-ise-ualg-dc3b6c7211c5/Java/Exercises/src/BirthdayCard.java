
public class BirthdayCard extends WebCard {
	
	public BirthdayCard(String to){
		super(to);
	}
	
	@Override
	void setMessage() {
		this.message = "Happy birthday to you ... \n happy birthday dear " + this.getTo();
	}

	@Override
	void showMessage() {
		System.out.println("\n\n====================\nHappy birthday Message\n");
		System.out.println(this.getMessage());
	}
}
