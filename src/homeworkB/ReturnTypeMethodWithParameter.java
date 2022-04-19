package homeworkB;

public class ReturnTypeMethodWithParameter {

    public double doSummation(double num1, double num2, double num3) {
        System.out.println("Summation value "+(num1+num2+num3));
        return num1+num2+num3;

    }

   public String getBillName(String bill1, String bill2, String bill3){

        System.out.println("Bill Name " + bill1 + " " + bill2 + " " +bill3);

        return  (bill1 + bill2 + bill3);
   }


   public int doAddition(int vegetablePrice, int fruitPrice, int fishPrice){

        System.out.println("Total Price: "+(vegetablePrice+fruitPrice+fishPrice) );

        return (vegetablePrice+fruitPrice+fishPrice);
   }
   public int doMulti(int pen1, int pen2, int pen3, int pen4){

        System.out.println("Total pen price " + (pen1*pen2*pen3*pen4));


        return(pen1*pen2*pen3*pen4);
   }
   public boolean isTshirtAvailabel(String tShirtName, String size, int price, boolean isAvailable){

        System.out.println(tShirtName+ " "+size+" tShirt Price " +price+ " availability " + isAvailable);


       return isAvailable;
   }






    public static void main(String args []){
        ReturnTypeMethodWithParameter obj=new ReturnTypeMethodWithParameter();
        obj.doSummation(23,32,35);
        obj.getBillName("Phone bill","Water bill", "Electricity bill");
        obj.doAddition(12,54,67);
        obj.doMulti(15,4,6,7);
        obj.isTshirtAvailabel("Polo","L",40,true);







    }










}
