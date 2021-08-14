public class FoodItem {

    private String name ;
    private float itemPrice ; 
    private int quantity ;

    public FoodItem(String name , float itemPrice , int quantity){
        this.name = name;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getTotalPrice(){
        return itemPrice*quantity;
    }

    public void display(){
        System.out.println(name+"\t\t"+itemPrice+"      "+quantity);
    }
}