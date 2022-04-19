package homeworkB;

public class NonReturnTypeMethodWithParameter {


    public void doAddition(int num1, int num2, int num3, int num4) {
        int total = num1 + num2;
        System.out.println("Total value " + total);

    }
   public void doMultiplication(int pc1, int pc2, int pc3, int pc4){
        int multi= pc1*pc2*pc3*pc4;
        System.out.println("Total number of Pc " +multi);
   }

   public void doSubtraction(float weeklyWage,float DailyWage){
        float sub=weeklyWage-DailyWage;

        System.out.println("total wage " +sub);

   }
   public void doSummation(int shopRent, int shopSpent,int shopTax ){

        double sum=(shopRent-shopSpent)+shopTax;

        System.out.println("total div "+sum);

   }
   public void getInformation(String name,  String add){
          String info=name+ "  " +add;
          System.out.println("My Information: " + info);


   }



    public static void main(String args[]){

        NonReturnTypeMethodWithParameter obj=new NonReturnTypeMethodWithParameter();

        obj.doAddition(34,12,34,67);
        obj.doMultiplication(12,13,10,5);
        obj.doSubtraction(100,20);
        obj.doSummation(10000,1000,600);
        obj.getInformation("Nishi","Ny");




    }








}
