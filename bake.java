public class bake
{
	private String item;
	private double costPrice;
	private double retailPrice;
	private int quantity;

 public bake()
 {
	item = "Backed Product";
	costPrice = 1.00;
	retailPrice = 1.00;
	quantity = 1;
 }

 public bake(String item, double costPrice, int quantity)
 {
 	this.item = item;
 	this.costPrice = costPrice;
 	this.quantity = quantity;
 }

 public bake(String item, double costPrice, double retailPrice, int quantity)
 {
 	this.item = item;
 	this.costPrice = costPrice;
 	this.retailPrice = retailPrice;
 	this.quantity = quantity;
 }


  public String getItem()
  {
    return item;
  }

  public double getCostPrice()
  {
    return costPrice;
  }

  public double getRetailPrice()
  {
    return retailPrice;
  }

  public double getQuantity()
  {
	return quantity;
  }


}// class




