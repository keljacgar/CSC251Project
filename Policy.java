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

   /* Default constructor for policy
   *  Intializes fields with default values
   */
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
   
   /* Gets the policy number
   *  @return the policy number as a string
   */
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   /** Retrieves the provider's name
   *   @return the provider's name as a string
   */
   public String getProviderName()
   {
      return providerName;
   }
   /** Retrieves the policy holder's first name.
   *   @return the first name of the policy holder as a string
   */
   public String getFirstName()
   {
      return firstName;
   }
   /** Retrieves the policy holder's last name.
   *   @return the last name of the policy holder as a string
   */
   public String getLastName()
   {
      return lastName;
   }
   
   /** Retrieves policy holder's age
   *   @return the age of the policyholder as an integer
   */
   public int getAge()
   {
      return age;
   }
   /** Retrieves the policy holder smoking status
   *   @return the smoking status of the policy holder as a string
   */
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /** Retrieves the policy holder heigh in inches
   *   @return the height of the policy holder as a double
   */
   public double getHeight()
   {
      return height;
   }
   
   /** Policy holders weight in pounds
   *   @return the weight of the policy holder as a double
   */
   public double getWeight()
   {
      return weight;
   }
   
   /** Calculates BMI for the policy holder
   *   @return the BMI value as a double
   */
      public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }
   
   /** Calculates the price of the policy based off age, smoking status, & BMI.
   *   @return the price of the policy as a double
   */
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
