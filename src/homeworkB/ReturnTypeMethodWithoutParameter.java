package homeworkB;

public class ReturnTypeMethodWithoutParameter {

 public int doAddition(){

     int x=78;
     int y=67;
     int z=45;
     int total=x+y+z;

    System.out.println(" Total value is total " +total);


     return total;
 }

  public double doMultiplication() {

      double women = 34;
      int man = 42;
      double multi = women* man;

      System.out.println("Total gender" + multi);


      return multi;
  }
   public int doSummation(){
      int rose=12;
      int dalia=14;
      int sunflower=15;
      int totalFlower =rose+dalia+sunflower;

     System.out.println("Flower cost "+totalFlower);

   return totalFlower;

   }
   public String getTeacherInformation(){
       String firstName= "Jui";
       String lastName="Usha";
       String fullName=firstName+" "+lastName;

       System.out.println("Full Name " +fullName);


   return fullName;
   }
   public double doSubtraction(){

       double monthlyIncome=1200.67;
       double monthlySpent=1100.34;
       double totalSpent=1200.67-1100.34;

     System.out.println("Total Spent "+ totalSpent);



     return totalSpent;
   }









    public static void main(String args[]){

        ReturnTypeMethodWithoutParameter ob=new ReturnTypeMethodWithoutParameter();
         ob.doAddition();
         ob.doMultiplication();
         ob.doSummation();
         ob.getTeacherInformation();
         ob.doSubtraction();


    }






























}