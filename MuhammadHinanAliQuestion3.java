import java.util.Scanner;

public class MuhammadHinanAliQuestion3
{
  public static void main(String[] args)
  {
	  bake item1 = new bake("Vanilla Slice", 0.59, 2.25, 30);
	  bake item2 = new bake("French Loaf", 0.40, 3);
	  bake item3 = new bake("Danish Pastry", 0.48, 2.20, 50);

      System.out.println(" - Baked Product - ");
	  System.out.println("Item: "+item1.getItem());
	  System.out.println("COST PRICE: "+item1.getCostPrice());
	  System.out.println("Retail Price: "+item1.getRetailPrice());
	  System.out.println("Quanity: "+item1.getQuantity());

	  System.out.println("\n\n");

      System.out.println(" - Baked Product - ");
	  System.out.println("Item: "+item2.getItem());
	  System.out.println("COST PRICE: "+item2.getCostPrice());
	  System.out.println("Quanity: "+item2.getQuantity());

	  System.out.println("\n\n");

      System.out.println(" - Baked Product - ");
	  System.out.println("Item: "+item3.getItem());
	  System.out.println("COST PRICE: "+item3.getCostPrice());
	  System.out.println("Retail Price: "+item3.getRetailPrice());
	  System.out.println("Quanity: "+item3.getQuantity());

	  System.out.println("\n");


  }//main method
}// class
