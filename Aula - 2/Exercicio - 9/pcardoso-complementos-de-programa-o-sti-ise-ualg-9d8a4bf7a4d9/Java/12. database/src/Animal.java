
public class Animal {
	private String animalName;
	private int animalId;
	private int ownerId;
	
	public Animal(String animalName, int animalId, int ownerId) {
		super();
		this.animalName = animalName;
		this.animalId = animalId;
		this.ownerId = ownerId;
	}
	
	public String getAnimalName() {
		return animalName;
	}
	
	public int getAnimalId() {
		return animalId;
	}
	
	public int getOwnerId() {
		return ownerId;
	}
	
	@Override
	public String toString() {
		return "Animal [animalName=" + animalName + ", animalId=" + animalId + "]";
	}
	
}
