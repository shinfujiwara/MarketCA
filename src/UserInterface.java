import models.CompanyRecord;
import models.DepotReport;

import java.util.Scanner;

public class UserInterface {


    public static void printWelcomeMessage(){
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("---------------------------  VirtualMarket 1.0 ----------------------------------------");
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public static void promptToPressEnter(){
        System.out.println("Press Enter to continue. ");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static boolean setMode(){
        boolean flag = true;
        while(flag) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Select one of the following options and press enter: ");
            System.out.println("1)  Autonomous");
            System.out.println("2)  Manual\n");
            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();
            switch(option){
                case "1":
                    return false;
                case "2":
                    return true;
                default:
                    printTryAgain();
            }
        }
        return false;
    }
    public static int selectCompany(){
        boolean flag = true;

        while(flag) {
            System.out.println("---------------------------------------------------------------------------------------");
            System.out.println("Select one of these companies and press enter: ");
            System.out.println("a)  Big A");
            System.out.println("b)  Big B");
            System.out.println("c)  Big C\n");
            Scanner scanner = new Scanner(System.in);
            String company = scanner.nextLine();
            switch (company) {
                case "a":
                    return 0;
                case "b":
                    return 1;
                case "c":
                    return 2;
                default:
                    printTryAgain();
            }
        }
        return -1;
    }
    public static void printTryAgain(){
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("You have selected an incorrect option. ");
        System.out.println();
        System.out.println("Press Enter and try again.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    public static void printRecord(CompanyRecord record){
        System.out.println("=========================================");
        System.out.println("Company name | "+record.getCompanyName());
        System.out.println("-----------------------------------------");
        System.out.println("Income       | "+record.getIncome());
        System.out.println("Expenses     | "+record.getExpenses());
        System.out.println("Cashflow     | "+record.getCashflow());
    }

    public static void printDepotReport(DepotReport depotReport){
        int cashFlow = depotReport.getIncome() - depotReport.getExpenses();
        System.out.println("========================");
        System.out.println("Depot Id        | "+depotReport.getDepotId());
        System.out.println("========================");
        System.out.println("Products sold   | "+depotReport.getProdSold());
        System.out.println("Products bought | "+depotReport.getProdBought());
        System.out.println("income          | "+depotReport.getIncome());
        System.out.println("expenses        | "+depotReport.getExpenses());
        System.out.println("----------------------");
        System.out.println("Cashflow        | "+cashFlow+" |");
        System.out.println("----------------------");
    }

    public static void printTitles(String title){
        System.out.println("========================================================================================");
        System.out.println("============================== "+title.toUpperCase()+" ======================================");
        System.out.println("========================================================================================");
    }
    public static void printCompanyName(String companyName){
        System.out.println("========================================================================================");
        System.out.println("============================== "+companyName.toUpperCase()+" ======================================");
    }

    public static void printHighestCashflowCompany(CompanyRecord winner){
        System.out.println("===================================");
        System.out.println("==== Best Performance Company =====");
        System.out.println("===================================");
        System.out.println("Company name: "+winner.getCompanyName());
        System.out.println("-----------------------------------");
        System.out.println("Cashflow: "+winner.getCashflow());
        System.out.println();
    }
}
