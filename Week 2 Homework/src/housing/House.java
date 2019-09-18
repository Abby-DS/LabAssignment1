package housing;

public class House {
	protected int Id;
	protected float price;
	protected String location;
	protected String advertiser; 
	protected Photo image;
	
	//default constructor 
	public House() {
		this.Id = 0;
		this.price = 0.0f;
		this.location = " ";
		this.advertiser = " ";
		this.image = new Photo();
	}

	//primary constructor
	public House(int id, float price, String location, String advertiser, Photo image) {
		super();
		Id = id;
		this.price = price;
		this.location = location;
		this.advertiser = advertiser;
		this.image = image;
	} 
	
	//copy constructor
	public House(House house) {
		this.Id = house.Id;
		this.price = house.price;
		this.location = house.location;
		this.advertiser = house.advertiser;
		this.image = house.image;
	}
	
	//Getters and Setters
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAdvertiser() {
		return advertiser;
	}

	public void setAdvertiser(String advertiser) {
		this.advertiser = advertiser;
	}

	public Photo getImage() {
		return image;
	}

	public void setImage(Photo image) {
		this.image = image;
	}

	//Concatenating using toString()
	@Override
	public String toString() {
		return "House [Id=" + Id + ", price=" + price + ", location=" + location + ", advertiser=" + advertiser
				+ ", image=" + image + "]";
	}
	
	
	//For display
	public void display() {
		System.out.println(toString());
	}
}
