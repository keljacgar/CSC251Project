public class Policy
{  // Fields
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder; 
   private static int policyCount = 0;

   /* Default constructor for policy
   *  Intializes fields with default values
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      policyHolder = new PolicyHolder();
      policyCount++;
   }
   
     /**
     * parameterized constructor for policy.
     * @param policyNumber  
     * @param providerName  
     * @param policyHolder  
     */
    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
        policyCount++;
    }

    // Getter & Setter methods
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
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

     /**
     * returns a string representation of the policy.
     * @return a formatted string containing the policy's info
     */
    @Override
    public String toString() {
        return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName +
               "\n" + policyHolder.toString() +
               "\nPolicy Price: $" + String.format("%.2f", getPrice());
    }

    /**
     * Returns the total number of Policy objects created.
     * @return The total number of Policy objects created.
     */
    public static int getPolicyCount() {
        return policyCount;
    }
}