import java.util.Scanner;
class ChemicalBags{
    public static void main(String[] args){
        // 25kg = €30
        // 50kg = €55
        // VAT = 18%
        
        /* 1. Ask the user for an order number.
         * 2. Input number of bags of each type (25kg and 50kg bags).
         * 3. Work out the total of each type of bag.
         * 4. Work out the VAT on each type of bag.
         * 5. Add the total and VAT and output all the information.
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input order number: ");
        String orderNumber = sc.next();
        
        System.out.print("Input number of 25kg bags: ");
        int type1Bags = sc.nextInt();
        
        System.out.print("Input number of 50kg bags: ");
        int type2Bags = sc.nextInt();
        
        double sum = (type1Bags * 30) + (type2Bags * 55);
        double vat = (0.18) * sum;
        double total = sum + vat;
        
        System.out.println("\nOrder number: " + orderNumber);
        System.out.println("Number of 25kg bags ordered: " + type1Bags);
        System.out.println("Number of 50kg bags ordered: " + type2Bags + "\n");
        System.out.println("Total without VAT: €" + sum);
        System.out.println("VAT: €" + vat);
        System.out.println("Total: €" + total);
        
    }
}