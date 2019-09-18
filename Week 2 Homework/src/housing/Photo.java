package housing;

public class Photo {
	protected int imgCode;
	protected String imgName;
	
	//default constructor	
	public Photo() {
		this.imgCode = 000;
		this.imgName = " ";
	}

	//primary constructor
	public Photo(int imgCode, String imgName) {
		super();
		this.imgCode = imgCode;
		this.imgName = imgName;
	}
	
	//copy constructor
	public Photo(Photo photo) {
		this.imgCode = photo.imgCode;
		this.imgName = photo.imgName;
	}

	//Getters and Setters
	public int getImgCode() {
		return imgCode;
	}

	public void setImgCode(int imgCode) {
		this.imgCode = imgCode;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	//Concatenating using toString
	@Override
	public String toString() {
		return "Photo [imgCode=" + imgCode + ", imgName=" + imgName + "]";
	}
	
	//For Display
	public void display() {
		System.out.println(toString());
	}
	
}
