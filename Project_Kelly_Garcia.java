import java.io.File;
import java.io.FileNotFoundException;
import Java.util.ArrayList
import java.util.Scanner;

public class Project_Kelly_Garcia {   
   public static void main(String[] args) {
   ArrayList<Policy> policies = new Array<>();
   int smokerCount = 0, nonSmokerCount = 0;
   
   try (Scanner fileScanner = new Scanner(new File("PolicyInformation.txt"))) {
      while (fileScanner.hasNextLine()) {
      String policyNumber = fileScanner.next();
      String providerName= fileScanner.next();
      String firstName = fileScanner.next();
      String lastName = fileScanner.next();
      int age = Integer.parseInt(fileScanner.next());
      String smokingStatus = fileScanner.nextLine();
      double height = Double.parseDouble(fileScanner.next());
      double weight = DOuble.parseDouble(fileScanner.next());
   
      Policy policy = new Policy(policyNumber,providerName, firstName, lastName, age, smokingStatus, height, weight);
      policies.add(policy);
      if (smokingStatus.equalsIgnoreCase("smoker")) {
         smokerCount++;
         } else {
            nonSmokerCount++;
         }
  }
}     catch (FileNotFoundException e) {
         System.out.println("ERROR: PolicyInformation.txt not found.");
         return;
  }
      
      // Display info about all Policies
      System.out.println("\nPolicy Details: \n");
      for (Policy policy : policies) {
         System.out.println(policy);
      }
      System.out.printf("\nThe number of policies with a smoker is: %d%n", smokerCount);
      System.out.printf("The number of policies with a non-smoker is: %d%n", nonSmokerCount);
   }
}