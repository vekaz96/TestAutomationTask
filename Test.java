import java.util.ArrayList;
import java.util.Scanner;


public class Test {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> Name = new ArrayList<String>();

        Name.add("1) EHS Item 1");
        Name.add("2) EHS Item 2");
        Name.add("3) EHS Item 3");
        Name.add("4) EHS Item 4");
        Name.add("5) EHS Item 5");
        Name.add("6) EHS Item 6");
        Name.add("7) EHS Item 7");
        Name.add("8) EHS Item 8");
        Name.add("9) EHS Item 9");


        System.out.println(Name);
        System.out.println("All listed products: ");
        int n = input.nextInt();
        System.out.println("Choose your product: " + Name.get(n));

        Name.set(0, "Material : Bronze, Manufacturer:Boston Item LLC RetailPrice:$53.50");
        Name.set(1, "Material: Bronze  Manufacturer:Boston Item LLC  RetailPrice:$37.10");
        Name.set(2, "Material:Zinc  Manufacturer:Boston Item LLC  RetailPrice:$93.00");
        Name.set(3, "Material:Plywood  Manufacturer:Boston Item LLC  RetailPrice:22.00");
        Name.set(4, "Material:Air  Manufacturer:New York Item LLC  RetailPrice:$1.95");
        Name.set(5, "Material:Copper  Manufacturer:New York Item LLC  RetailPrice:$5.00");
        Name.set(6, "Material:Uranium  Manufacturer:New York Item LLC  RetailPrice:$32.00");
        Name.set(7, "Material:Gold Manufacturer:New York Item LLC RetailPrice:$142.00");
        Name.set(8, "Material:Plastic Manufacturer:Svedala Prylfabrik AB RetailPrice:$3.50");

        int m = input.nextInt();
        System.out.println("Details about your product: " + Name.get(m));

        }
    }













