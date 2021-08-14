import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter Number of Food Items : ");
        // int number = scanner.nextInt();

        // BillGenerator billGenerator = new BillGenerator(number);

        // for(int i=0 ; i<number ; i++){
        //     billGenerator.acceptvalue();
        // }
        // billGenerator.billGenrate();

        Item[] items = Item.values();
        for(Item item : items){
            System.out.println(item+" "+item.getPrice());
        }
    }
    
}
