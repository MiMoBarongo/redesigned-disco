import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\tDedan Kimathi University of Technology");
        System.out.println("\t\tSchool of Computer Science and IT");
        System.out.println("\t\t\tDepartment of Computer Science");
        System.out.println("\t\t\tAcademic Year: 2024/2025");
        System.out.println("\t\tSTUDENT MARKSHEET(SECOND YEAR RESULTS)");

        System.out.println("\nEnter the registration number of the 1st student:");
        String reg1 = sc.nextLine();
        System.out.println("Enter the full name of the 1st student:");
        String name1 = sc.nextLine();
        System.out.println("Enter the marks of the 7 units respectively [CCS101,CCS102,CCS103,CCS104,CCS105,CCS106,CCS107]:");
        int s1u1 = sc.nextInt();
        int s1u2 = sc.nextInt();
        int s1u3 = sc.nextInt();
        int s1u4 = sc.nextInt();
        int s1u5 = sc.nextInt();
        int s1u6 = sc.nextInt();
        int s1u7 = sc.nextInt();
        int total1 = s1u1 + s1u2 + s1u3 + s1u4 + s1u5 + s1u6  + s1u7;
        double average1 = total1 / 7.0;
        sc.nextLine();


        System.out.println("Enter the registration number of the 2nd student:");
        String reg2 = sc.nextLine();
        System.out.println("Enter the full name of the 2st student:");
        String name2 = sc.nextLine();
        System.out.println("Enter the marks of the 7 units respectively [CCS101,CCS102,CCS103,CCS104,CCS105,CCS106,CCS107]:");
        int s2u1 = sc.nextInt();
        int s2u2 = sc.nextInt();
        int s2u3 = sc.nextInt();
        int s2u4 = sc.nextInt();
        int s2u5 = sc.nextInt();
        int s2u6 = sc.nextInt();
        int s2u7 = sc.nextInt();
        int total2 = s2u1 + s2u2 + s2u3 + s2u4 + s2u5 + s2u6  + s2u7;
        double average2 = total2 / 7.0;
        sc.nextLine();



        System.out.println("Enter the registration number of the 3rd student:");
        String reg3 = sc.nextLine();
        System.out.println("Enter the full name of the 3rd student:");
        String name3 = sc.nextLine();
        System.out.println("Enter the marks of the 7 units respectively [CCS101,CCS102,CCS103,CCS104,CCS105,CCS106,CCS107]:");
        int s3u1 = sc.nextInt();
        int s3u2 = sc.nextInt();
        int s3u3 = sc.nextInt();
        int s3u4 = sc.nextInt();
        int s3u5 = sc.nextInt();
        int s3u6 = sc.nextInt();
        int s3u7 = sc.nextInt();
        int total3 = s3u1 + s3u2 + s3u3 + s3u4 + s3u5 + s3u6  + s3u7;
        double average3 = total3 / 7.0;
        sc.nextLine();



        System.out.println("Enter the registration number of the 4th student:");
        String reg4 = sc.nextLine();
        System.out.println("Enter the full name of the 4th student:");
        String name4 = sc.nextLine();
        System.out.println("Enter the marks of the 7 units respectively [CCS101,CCS102,CCS103,CCS104,CCS105,CCS106,CCS107]:");
        int s4u1 = sc.nextInt();
        int s4u2 = sc.nextInt();
        int s4u3 = sc.nextInt();
        int s4u4 = sc.nextInt();
        int s4u5 = sc.nextInt();
        int s4u6 = sc.nextInt();
        int s4u7 = sc.nextInt();
        int total4 = s4u1 + s4u2 + s4u3 + s4u4 + s4u5 + s4u6  + s4u7;
        double average4 = total4 / 7.0;
        sc.nextLine();



        System.out.println("Enter the registration number of the 5th student:");
        String reg5 = sc.nextLine();
        System.out.println("Enter the full name of the 5th student:");
        String name5 = sc.nextLine();
        System.out.println("Enter the marks of the 7 units respectively [CCS101,CCS102,CCS103,CCS104,CCS105,CCS106,CCS107]:");
        int s5u1 = sc.nextInt();
        int s5u2 = sc.nextInt();
        int s5u3 = sc.nextInt();
        int s5u4 = sc.nextInt();
        int s5u5 = sc.nextInt();
        int s5u6 = sc.nextInt();
        int s5u7 = sc.nextInt();
        int total5 = s5u1 + s5u2 + s5u3 + s5u4 + s5u5 + s5u6  + s5u7;
        double average5 = total5 / 7.0;
        sc.nextLine();



System.out.println("\tStudent Score Sheet");
System.out.println("-------------------------------------------------------------------------------------------------------------------------");
System.out.println("RegNo. \t\t\t\t\t\tFull Name \t\t\t\t\t\t\tCCS101 \t\tCCS102 \t\tCCS103 \t\tCCS104 \t\tCCS105 \t\tCCS106 \t\tCCS107 \t\tTotals \t\tAverage \t\t\t\tStatus \t\tGrade");
System.out.println("-------------------------------------------------------------------------------------------------------------------------");
System.out.println(reg1 + "\t\t\t" + name1 + "\t\t\t\t\t" + s1u1 + "\t\t\t" + s1u2 + "\t\t\t" + s1u3 + "\t\t\t" + s1u4 + "\t\t\t" + s1u5 + "\t\t\t" + s1u6 + "\t\t\t" + s1u7 + "\t\t\t" + total1 + "\t\t\t" + average1);
System.out.println(reg2 + "\t\t\t" + name2 + "\t\t\t\t\t" + s2u1 + "\t\t\t" + s2u2 + "\t\t\t" + s2u3 + "\t\t\t" + s2u4 + "\t\t\t" + s2u5 + "\t\t\t" + s2u6 + "\t\t\t" + s2u7 + "\t\t\t" + total2 + "\t\t\t" + average2);
System.out.println(reg3 + "\t\t\t" + name3 + "\t\t\t\t\t" + s3u1 + "\t\t\t" + s3u2 + "\t\t\t" + s3u3 + "\t\t\t" + s3u4 + "\t\t\t" + s3u5 + "\t\t\t" + s3u6 + "\t\t\t" + s3u7 + "\t\t\t" + total3 + "\t\t\t" + average3);
System.out.println(reg4 + "\t\t\t" + name4 + "\t\t\t\t\t" + s4u1 + "\t\t\t" + s4u2 + "\t\t\t" + s4u3 + "\t\t\t" + s4u4 + "\t\t\t" + s4u5 + "\t\t\t" + s4u6 + "\t\t\t" + s4u7 + "\t\t\t" + total4 + "\t\t\t" + average4);
System.out.println(reg5 + "\t\t\t" + name5 + "\t\t\t\t\t" + s5u1 + "\t\t\t" + s5u2 + "\t\t\t" + s5u3 + "\t\t\t" + s5u4 + "\t\t\t" + s5u5 + "\t\t\t" + s5u6 + "\t\t\t" + s5u7 + "\t\t\t" + total5 + "\t\t\t" + average5);

    }

}