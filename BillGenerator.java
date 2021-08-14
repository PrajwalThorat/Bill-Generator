import java.util.Scanner;

public class BillGenerator {

    private FoodItem[] foodItem ;
    private int count = 0 ;
    private float discount;

    public BillGenerator(int noOfItems){
        foodItem = new FoodItem[noOfItems];
        discount = 10 ;
    }
    
    public void acceptvalue(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Name : ");
        String itemName = scanner.nextLine();
        System.out.print("Enter the Item Price :");
        float itemPrice = scanner.nextFloat();
        System.out.print("Enter Quantity : ");
        int itemQuantity = scanner.nextInt();
        scanner.nextLine();

        FoodItem foodItems = new FoodItem(itemName, itemPrice, itemQuantity);

        foodItem[count] = foodItems ;
        count++;
    }

    public float getTotalAmount(){
        float sum = 0 ;
        for(FoodItem item : foodItem){
            sum = sum + item.getTotalPrice();
        }
        return sum ;
    }

    public float getDiscount(){
        return (getTotalAmount()/100)*discount;
    }

    public float getNePrice(){
        return getTotalAmount() - getDiscount();
    }

    public void billGenrate(){
        System.out.println("Item Name     Amount     Quantity");
        for(FoodItem items : foodItem){
            items.display();
        }
        System.out.println("----------------------------------");
        System.out.println("Total Amount : "+getTotalAmount());
        System.out.println("Discount : "+getDiscount());
        System.out.println("Net Amount : "+getNePrice());
    }
}
