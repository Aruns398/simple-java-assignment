import java.util.*;
public class StationeryOopsException 
{
    static class Item 
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
        System.out.println("\nNOTE: Enter 0 if you don't want the item.\n");

        pencil.quantity = getValidQuantity(scan, "Pencil");
        pen.quantity = getValidQuantity(scan, "Pen");
        ruler.quantity = getValidQuantity(scan, "Ruler");
        smallNote.quantity = getValidQuantity(scan, "Small Note");
        longNote.quantity = getValidQuantity(scan, "Long Note");

        int total = pencil.getTotal() + pen.getTotal() + ruler.getTotal() +
                    smallNote.getTotal() + longNote.getTotal();

        System.out.println("\n\n==================== BILL ======================\n");
        System.out.println("ITEM\t\tPRICE\tQUANTITY\tTOTAL");
        if(pencil.quantity > 0)
        System.out.println("Pencil\t\tRs" + pencil.price + "\t" + pencil.quantity + "\t\tRs" + pencil.getTotal());
        if(pen.quantity > 0)
        System.out.println("Pen\t\tRs" + pen.price + "\t" + pen.quantity + "\t\tRs" + pen.getTotal());
        if(ruler.quantity > 0)
        System.out.println("Ruler\t\tRs" + ruler.price + "\t" + ruler.quantity + "\t\tRs" + ruler.getTotal());
        if(smallNote.quantity > 0)
        System.out.println("Small Note\tRs" + smallNote.price + "\t" + smallNote.quantity + "\t\tRs" + smallNote.getTotal());
        if(longNote.quantity > 0)
        System.out.println("Long Note\tRs" + longNote.price + "\t" + longNote.quantity + "\t\tRs" + longNote.getTotal());
        System.out.println("\n-----------------------*------------------------");
        System.out.println("            Total Amount: Rs." + total);
        System.out.println("===============================================");
    }

    public static int getValidQuantity(Scanner scan, String itemName) 
    {
        int qty = -1;
        while (true) 
        {
            try 
            {
                System.out.print("Enter quantity for " + itemName + ": ");
                qty = scan.nextInt();
                if (qty < 0) 
                {
                    throw new IllegalArgumentException("Quantity cannot be negative. Try again.");
                }
                break;
            }
            catch (InputMismatchException e) 
            {
                System.out.println("Invalid input! Please enter a number only.");
                scan.nextLine();
            }
            catch (IllegalArgumentException e) 
            {
                System.out.println(e.getMessage());
            }
        }
        return qty;
    }
}

