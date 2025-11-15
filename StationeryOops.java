import java.util.*;
class Item
{
    String name;
    int price;
    int quantity;

    Item(String name, int price) 
    {
        this.name = name;
        this.price = price;
    }

    int getTotal() 
    {
        return price * quantity;
    }
}

public class StationeryOops 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        Item pencil = new Item("Pencil", 5);
        Item pen = new Item("Pen", 50);
        Item ruler = new Item("Ruler", 10);
        Item smallNote = new Item("Small Note", 80);
        Item longNote = new Item("Long Note", 100);

        System.out.println("\n****** E-STATIONERY SHOP ******");
        System.out.println("\n===== Stationery Menu =====\n");
        System.out.println("   Pencil\tRs" + pencil.price);
        System.out.println("   Pen\t\tRs" + pen.price);
        System.out.println("   Ruler\tRs" + ruler.price);
        System.out.println("   Small Note\tRs" + smallNote.price);
        System.out.println("   Long Note\tRs" + longNote.price);
        System.out.println("\n=============*==============");

        System.out.println("\nNOTE: Enter 0 if you don't want the item.");

        System.out.print("\nEnter quantity for Pencil: ");
        pencil.quantity = scan.nextInt();
        System.out.print("Enter quantity for Pen: ");
        pen.quantity = scan.nextInt();
        System.out.print("Enter quantity for Ruler: ");
        ruler.quantity = scan.nextInt();
        System.out.print("Enter quantity for Small Note: ");
        smallNote.quantity = scan.nextInt();
        System.out.print("Enter quantity for Long Note: ");
        longNote.quantity = scan.nextInt();

        int total = pencil.getTotal() + pen.getTotal() + ruler.getTotal() +
                    smallNote.getTotal() + longNote.getTotal();

        System.out.println("\n\n==================== BILL ======================");
        System.out.println("ITEM\t\tPRICE\tQUANTITY\tTOTAL");
        System.out.println("Pencil\t\tRs" + pencil.price + "\t" + pencil.quantity + "\t\tRs" + pencil.getTotal());
        System.out.println("Pen\t\tRs" + pen.price + "\t" + pen.quantity + "\t\tRs" + pen.getTotal());
        System.out.println("Ruler\t\tRs" + ruler.price + "\t" + ruler.quantity + "\t\tRs" + ruler.getTotal());
        System.out.println("Small Note\tRs" + smallNote.price + "\t" + smallNote.quantity + "\t\tRs" + smallNote.getTotal());
        System.out.println("Long Note\tRs" + longNote.price + "\t" + longNote.quantity + "\t\tRs" + longNote.getTotal());
        System.out.println("\n-----------------------------------------------");
        System.out.println("            Total Amount: Rs." + total);
        System.out.println("===============================================");
    }
}
