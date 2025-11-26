import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // BILLING INFO

        System.out.println("BILLING INFORMATION\nEnter the Customer name:");
        String customer = sc.nextLine();
        System.out.println("Enter the Customer location:");
        String location1 = sc.nextLine();
        System.out.println("Enter the Customer address:");
        String address1 = sc.nextLine();
        System.out.println("Enter the Customer GSTIN:");
        String GSTIN1 = sc.nextLine();
        System.out.println("Enter the Customer Phone number:");
        String phoneNumber1 = sc.nextLine();
        System.out.println("Enter the Customer Email address:");
        String email1 = sc.nextLine();


        // SHIPPING INFO

        System.out.println("\nSHIPPING INFORMATION\nEnter the Recipient name:");
        String recipient = sc.nextLine();
        System.out.println("Enter the Recipient location:");
        String location2 = sc.nextLine();
        System.out.println("Enter the Recipient address:");
        String address2 = sc.nextLine();
        System.out.println("Enter the Recipient GSTIN:");
        String GSTIN2 = sc.nextLine();
        System.out.println("Enter the Recipient Phone number:");
        String phoneNumber2 = sc.nextLine();
        System.out.println("Enter the Recipient Email address:");
        String email2 = sc.nextLine();


        // PRODUCT 1

        System.out.println("\nProduct 1: Enter the product code:");
        String productCode1 = sc.nextLine();
        System.out.println("Product 1: Enter the product name:");
        String productName1 = sc.nextLine();
        System.out.println("Product 1: Enter the product HNS code:");
        String productHNSCode1 = sc.nextLine();
        System.out.println("Product 1: Enter the product quantity:");
        int productQuantity1 = sc.nextInt();
        sc.nextLine(); // FIXED
        System.out.println("Product 1: Enter the product units:");
        String productUnits1 = sc.nextLine();
        System.out.println("Product 1: Enter the product rate:");
        double productRate1 = sc.nextDouble();
        System.out.println("Product 1: Enter the product tax percentage:");
        double productTax1 = sc.nextDouble();
        sc.nextLine();


        // PRODUCT 2

        System.out.println("\nProduct 2: Enter the product code:");
        String productCode2 = sc.nextLine();
        System.out.println("Product 2: Enter the product name:");
        String productName2 = sc.nextLine();
        System.out.println("Product 2: Enter the product HNS code:");
        String productHNSCode2 = sc.nextLine();
        System.out.println("Product 2: Enter the product quantity:");
        int productQuantity2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Product 2: Enter the product units:");
        String productUnits2 = sc.nextLine();
        System.out.println("Product 2: Enter the product rate:");
        double productRate2 = sc.nextDouble();
        System.out.println("Product 2: Enter the product tax percentage:");
        double productTax2 = sc.nextDouble();
        sc.nextLine();


        // PRODUCT 3

        System.out.println("\nProduct 3: Enter the product code:");
        String productCode3 = sc.nextLine();
        System.out.println("Product 3: Enter the product name:");
        String productName3 = sc.nextLine();
        System.out.println("Product 3: Enter the product HNS code:");
        String productHNSCode3 = sc.nextLine();
        System.out.println("Product 3: Enter the product quantity:");
        int productQuantity3 = sc.nextInt();
        sc.nextLine();
        System.out.println("Product 3: Enter the product units:");
        String productUnits3 = sc.nextLine();
        System.out.println("Product 3: Enter the product rate:");
        double productRate3 = sc.nextDouble();
        System.out.println("Product 3: Enter the product tax percentage:");
        double productTax3 = sc.nextDouble();
        sc.nextLine();

        // PRODUCT 4

        System.out.println("\nProduct 4: Enter the product code:");
        String productCode4 = sc.nextLine();
        System.out.println("Product 4: Enter the product name:");
        String productName4 = sc.nextLine();
        System.out.println("Product 4: Enter the product HNS code:");
        String productHNSCode4 = sc.nextLine();
        System.out.println("Product 4: Enter the product quantity:");
        int productQuantity4 = sc.nextInt();
        sc.nextLine();
        System.out.println("Product 4: Enter the product units:");
        String productUnits4 = sc.nextLine();
        System.out.println("Product 4: Enter the product rate:");
        double productRate4 = sc.nextDouble();
        System.out.println("Product 4: Enter the product tax percentage:");
        double productTax4 = sc.nextDouble();
        sc.nextLine();


        // PRODUCT 5

        System.out.println("\nProduct 5: Enter the product code:");
        String productCode5 = sc.nextLine();
        System.out.println("Product 5: Enter the product name:");
        String productName5 = sc.nextLine();
        System.out.println("Product 5: Enter the product HNS code:");
        String productHNSCode5 = sc.nextLine();
        System.out.println("Product 5: Enter the product quantity:");
        int productQuantity5 = sc.nextInt();
        sc.nextLine();
        System.out.println("Product 5: Enter the product units:");
        String productUnits5 = sc.nextLine();
        System.out.println("Product 5: Enter the product rate:");
        double productRate5 = sc.nextDouble();
        System.out.println("Product 5: Enter the product tax percentage:");
        double productTax5 = sc.nextDouble();
        sc.nextLine();


        // PRODUCT 6

        System.out.println("\nProduct 6: Enter the product code:");
        String productCode6 = sc.nextLine();
        System.out.println("Product 6: Enter the product name:");
        String productName6 = sc.nextLine();
        System.out.println("Product 6: Enter the product HNS code:");
        String productHNSCode6 = sc.nextLine();
        System.out.println("Product 6: Enter the product quantity:");
        int productQuantity6 = sc.nextInt();
        sc.nextLine();
        System.out.println("Product 6: Enter the product units:");
        String productUnits6 = sc.nextLine();
        System.out.println("Product 6: Enter the product rate:");
        double productRate6 = sc.nextDouble();
        System.out.println("Product 6: Enter the product tax percentage:");
        double productTax6 = sc.nextDouble();
        sc.nextLine();


        // PRODUCT 7

        System.out.println("\nProduct 7: Enter the product code:");
        String productCode7 = sc.nextLine();
        System.out.println("Product 7: Enter the product name:");
        String productName7 = sc.nextLine();
        System.out.println("Product 7: Enter the product HNS code:");
        String productHNSCode7 = sc.nextLine();
        System.out.println("Product 7: Enter the product quantity:");
        int productQuantity7 = sc.nextInt();
        sc.nextLine();
        System.out.println("Product 7: Enter the product units:");
        String productUnits7 = sc.nextLine();
        System.out.println("Product 7: Enter the product rate:");
        double productRate7 = sc.nextDouble();
        System.out.println("Product 7: Enter the product tax percentage:");
        double productTax7 = sc.nextDouble();


        // CALCULATIONS (Fixed)


        double Amount1 = (productQuantity1 * productRate1) +
                ((productTax1 / 100) * (productQuantity1 * productRate1));

        double Amount2 = (productQuantity2 * productRate2) +
                ((productTax2 / 100) * (productQuantity2 * productRate2));

        double Amount3 = (productQuantity3 * productRate3) +
                ((productTax3 / 100) * (productQuantity3 * productRate3));

        double Amount4 = (productQuantity4 * productRate4) +
                ((productTax4 / 100) * (productQuantity4 * productRate4));

        double Amount5 = (productQuantity5 * productRate5) +
                ((productTax5 / 100) * (productQuantity5 * productRate5));

        double Amount6 = (productQuantity6 * productRate6) +
                ((productTax6 / 100) * (productQuantity6 * productRate6));

        double Amount7 = (productQuantity7 * productRate7) +
                ((productTax7 / 100) * (productQuantity7 * productRate7));

        double Total = Amount1 + Amount2 + Amount3 + Amount4 + Amount5 + Amount6 + Amount7;

        double DiscountRate = 0.6368; // percent
        double Discounts = Total * (DiscountRate / 100.0);

        double GrandTotal = Total - Discounts;

        sc.close();


        // OUTPUT SECTION


        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-50s %-50s%n", "Bill To:", "Ship To:");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        System.out.printf("%-50s %-50s%n", customer, recipient);
        System.out.printf("%-50s %-50s%n", address1, address2);
        System.out.printf("%-50s %-50s%n", location1, location2);
        System.out.printf("%-50s %-50s%n", "GSTIN: " + GSTIN1, "GSTIN: " + GSTIN2);
        System.out.printf("%-50s %-50s%n", "Contact: " + phoneNumber1, "Contact: " + phoneNumber2);
        System.out.printf("%-50s %-50s%n", "Email: " + email1, "Email: " + email2);

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-50s %-50s%n", "Payment Date: 7 days from date of delivery",
                "Payment Terms: 100% against invoice");
        System.out.println("--------------------------------------------------------------------------------------------------------------");

        System.out.printf("| %-4s | %-12s | %-20s | %-10s | %-8s | %-6s | %-10s | %-6s | %-12s |%n",
                "S.No", "Product Code", "Product Name", "HSN code",
                "Qty", "Units", "Rate", "Tax", "Amount");

        System.out.println("--------------------------------------------------------------------------------------------------------------");

// ROW 1
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-6s | %-10.2f | %-6.0f%% | %-12.2f |%n",
                1, productCode1, productName1, productHNSCode1, productQuantity1, productUnits1,
                productRate1, productTax1, Amount1);

// ROW 2
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-6s | %-10.2f | %-6.0f%% | %-12.2f |%n",
                2, productCode2, productName2, productHNSCode2, productQuantity2, productUnits2,
                productRate2, productTax2, Amount2);

// ROW 3
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-6s | %-10.2f | %-6.0f%% | %-12.2f |%n",
                3, productCode3, productName3, productHNSCode3, productQuantity3, productUnits3,
                productRate3, productTax3, Amount3);

// ROW 4
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-6s | %-10.2f | %-6.0f%% | %-12.2f |%n",
                4, productCode4, productName4, productHNSCode4, productQuantity4, productUnits4,
                productRate4, productTax4, Amount4);

// ROW 5
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-6s | %-10.2f | %-6.0f%% | %-12.2f |%n",
                5, productCode5, productName5, productHNSCode5, productQuantity5, productUnits5,
                productRate5, productTax5, Amount5);

// ROW 6
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-6s | %-10.2f | %-6.0f%% | %-12.2f |%n",
                6, productCode6, productName6, productHNSCode6, productQuantity6, productUnits6,
                productRate6, productTax6, Amount6);

// ROW 7
        System.out.printf("| %-4d | %-12s | %-20s | %-10s | %-8d | %-6s | %-10.2f | %-6.0f%% | %-12.2f |%n",
                7, productCode7, productName7, productHNSCode7, productQuantity7, productUnits7,
                productRate7, productTax7, Amount7);

        System.out.println("--------------------------------------------------------------------------------------------------------------");

        System.out.printf("%90s %12.2f%n", "Total:", Total);
        System.out.printf("%90s %12.2f%n", "Discounts:", Discounts);
        System.out.printf("%90s %12.2f%n", "Grand Total:", GrandTotal);

        System.out.println("--------------------------------------------------------------------------------------------------------------");


    }
}


