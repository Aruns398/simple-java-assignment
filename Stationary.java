import java.util.*;
public class Stationary
{
 public static void main(String[] args)
 { 
   int pencilprice=5,penprice=50,rulerprice=10,SmallNoteprice=80,LongNoteprice=100;
   System.out.println("\n******E-STATIONERY SHOP******");
   System.out.println("\n===== Stationery Menu =====");
   System.out.println("\n  Pencil\t"+"Rs"+pencilprice);
   System.out.println("  Pen\t\t"+"Rs"+penprice);
   System.out.println("  Ruler\t\t"+"Rs"+rulerprice);
   System.out.println("  SmallNote\t"+"Rs"+SmallNoteprice);
   System.out.println("  LongNote\t"+"Rs"+LongNoteprice);
   System.out.println("\n=============*==============");
        
   Scanner scan=new Scanner(System.in);
   System.out.println("\nNOTE: If you don't want Quantity then give (0)");
   System.out.print("\nEnter the Pencil Quantity :");
   int pencilQuantity=scan.nextInt();
   System.out.print("Enter the Pen Quantity :");
   int penQuantity=scan.nextInt();
   System.out.print("Enter the Ruler Quantity :");
   int RulerQuantity=scan.nextInt();
   System.out.print("Enter the SmallNote Quantity :");
   int SmallNoteQuantity=scan.nextInt();
   System.out.print("Enter the LongNote Quantity: ");
   int LongNoteQuantity=scan.nextInt();

   int pencilTotal=pencilQuantity*pencilprice;
   int penTotal=penQuantity*penprice;
   int RulerTotal=RulerQuantity*rulerprice;
   int SmallNTotal=SmallNoteQuantity*SmallNoteprice;
   int LongNTotal=LongNoteQuantity*LongNoteprice;
   int Total=pencilTotal+penTotal+RulerTotal+SmallNTotal+LongNTotal;
  
   System.out.println("\n\n==================== BILL ======================");
   System.out.println("\nITEM\t\tPRICE\tQUANTITY\tTOTAL");
   if(pencilQuantity>0)
   System.out.println("\nPENCIL\t\t"+"Rs"+pencilprice+"\t"+pencilQuantity+"\t\t"+pencilTotal);
   if(penQuantity>0)
   System.out.println("PEN\t\t"+"Rs"+penprice+"\t"+penQuantity+"\t\t"+penTotal);
   if(RulerQuantity>0)
   System.out.println("RULER\t\t"+"Rs"+rulerprice+"\t"+RulerQuantity+"\t\t"+RulerTotal);
   if(SmallNoteQuantity>0)
   System.out.println("SMALL NOTE\t"+"Rs"+SmallNoteprice+"\t"+SmallNoteQuantity+"\t\t"+SmallNTotal);
   if(LongNoteQuantity>0)
   System.out.println("LONG NOTE\t"+"Rs"+LongNoteprice+"\t"+LongNoteQuantity+"\t\t"+LongNTotal);
   System.out.println("\n\t         Total:"+"Rs."+Total);
   System.out.println("\n=======================*=========================");
 }
}