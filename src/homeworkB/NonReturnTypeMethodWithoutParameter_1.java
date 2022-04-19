package homeworkB;

public class NonReturnTypeMethodWithoutParameter_1 {

    public void doSum(){

        int num1=12;
        int num2=45;
        int num3=35;
        int total=num1+num2+num3;
        System.out.println("Total value " +total);

    }

    public void doSubtraction(){
        double salary1=1200.89;
        double salary2=1100.78;
        double sub=salary1-salary2;
        System.out.println("Total value " +sub);


    }
    public void getInformation(){
        String fName="AL";
        String lName="Hasan";
        String fullName=fName+ "  " +lName;
        System.out.println("Full Name " +fullName);

    }
    public void doMulti(){
        int dress=10;
        int shoe=8;
        int multi=dress* shoe;
        System.out.println("Total item "+multi);



    }
    public void doAddition(){

        double yearlyTax=48000;
        double monthlyTax=480;
        double totalTax=yearlyTax+ monthlyTax;

        System.out.println("Total tax "+totalTax);



    }




    public static void main(String args[]){
        NonReturnTypeMethodWithoutParameter_1 nonReturnTypeMethod=new NonReturnTypeMethodWithoutParameter_1();
        nonReturnTypeMethod.doSum();
        nonReturnTypeMethod.doSubtraction();
        nonReturnTypeMethod.getInformation();
        nonReturnTypeMethod.doMulti();
        nonReturnTypeMethod.doAddition();














    }




















}
