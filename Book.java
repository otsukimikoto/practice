public class Book extends TangibleAsset{
	private String isbun;

	public Book(String name, int price, String color, String isbun){
		super(name,price,color);
		this.isbun = isbun;
	}
	public String getIsbun(){return this.isbun;}
}

