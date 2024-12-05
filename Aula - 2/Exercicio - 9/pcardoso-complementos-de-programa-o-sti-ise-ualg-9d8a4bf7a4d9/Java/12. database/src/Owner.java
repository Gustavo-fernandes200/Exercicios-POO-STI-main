
public class Owner {
	private String ownerName;
	private int ownerId;
	
	public Owner(String ownerName, int ownerId) {
		super();
		this.ownerName = ownerName;
		this.ownerId = ownerId;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public int getOwnerId() {
		return ownerId;
	}
	
	@Override
	public String toString() {
		return "Owner [ownerName=" + ownerName + ", ownerId=" + ownerId + "]";
	}
	
	
}
