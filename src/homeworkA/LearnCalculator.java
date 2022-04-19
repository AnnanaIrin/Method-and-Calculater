package homeworkA;

import java.util.Scanner;

public class LearnCalculator {
    void addition() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your dress item num");
        double item1 = input.nextDouble();

        System.out.println("Enter your shoes item num ");
        double item2=input.nextDouble();
        double totalAddition=item1+item2;
        System.out.println("total item "+totalAddition );
    }
    void subtraction(){
        Scanner sub = new Scanner(System.in);

        System.out.println("Enter your total income");
        float income=sub.nextFloat();
        System.out.println("Enter your total spend")  ;
        float spent=sub.nextFloat();
        float subtraction=income-spent;
        System.out.println("total income "+subtraction);
    }
    void multiplication(){
        Scanner sub = new Scanner(System.in);

        System.out.println("Enter your yearly salary");
        int salary=sub.nextInt();
        System.out.println("Enter your yearly transportation cost");
        int trans=sub.nextInt();
        System.out.println("Enter your yearly tax");
        int tax=sub.nextInt();
        int multiplication=salary*trans*tax;
        System.out.println("Total Multiplication "+multiplication);



        }
        void summation(){
            Scanner sub = new Scanner(System.in);

            System.out.println("Enter your house bill");
            double waterBill=sub.nextDouble();
            System.out.println("Enter your water bill");
            double electricityBill=sub.nextDouble();
            double summation=waterBill+electricityBill;
            System.out.println("Total summation "+summation);

        }


    public static void main(String args[]){

        Scanner input=new Scanner(System.in);
        LearnCalculator cal=new LearnCalculator();
        cal.addition();
        cal.subtraction();
        cal.multiplication();
        cal.summation();
























    }



































}
