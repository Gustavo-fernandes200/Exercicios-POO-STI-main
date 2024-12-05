
public class ChristmasCard extends WebCard {

	public ChristmasCard(String to){
		super(to);
	}
	
	@Override
	void setMessage() {
		this.message = "Merry Christmas dear " + this.getTo();
	}

	@Override
	void showMessage() {
		System.out.println("\n\n====================\nMerry Christmas Message\n");
		System.out.println(this.getMessage());
	}
}
