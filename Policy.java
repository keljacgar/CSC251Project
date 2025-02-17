public class Policy
{  // Fields
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;

   // Constructors
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0;
   }
   
   // Getters
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   public String getProviderName()
   {
      return providerName;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }
   
   // Calculates BMI for thr policy holder
      public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   // Calculates the price of the policy
   public double getPrice()
   {
      final double Base_Price = 600;
      final double Additional_Fee_Age = 75;
      final double Additional_Fee_Smoking = 100;
      final double Additional_Fee_Per_BMI = 20;
      
      final int Age_Threshold = 50;
      final int BMI_Threshold = 35;
      
      double price = Base_Price;
      
      if(age > Age_Threshold) 
         price += Additional_Fee_Age; 
         
      if(smokingStatus.equalsIgnoreCase("smoker")) 
         price += Additional_Fee_Smoking; 
            
      if(getBMI() > BMI_Threshold) 
         price += ((getBMI() - BMI_Threshold) * Additional_Fee_Per_BMI); 
         
      return price;
   }
   
   // Display all information about the policy
   public void displayInformation()
   {
      System.out.println("Policy Number: " + policyNumber);
      System.out.println("Provider Name: " + providerName);
      System.out.println("Policyholder's First Name: " + firstName);
      System.out.println("Policyholder's Last Name: " + lastName);
      System.out.println("Policyholder's Age: " + age);
      System.out.println("Policyholder's Smoking Status (Y/N): " + smokingStatus);
      System.out.println("Policyholder's Height: " + height + " inches");
      System.out.println("Policyholder's Weight: " + weight + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", getBMI());
      System.out.printf("Policy Price: $%.2f\n", getPrice());
   }
}