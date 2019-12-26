public class FacebookPerson {
	
	
	private String personName;
	private String imagePath;
	
	public FacebookPerson(String personName, String imagePath){
		this.personName = personName;
		this.imagePath = imagePath;		
		
	}
	
	public void getPersonName() {
		return this.personName;		
		
	}
	
	public void getImagePath() {
		return this.imagePath;
		
	}
	
	
	
}