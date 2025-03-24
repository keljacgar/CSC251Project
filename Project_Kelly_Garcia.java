import java.io.File;
import java.io.FileNotFoundException;
import Java.util.ArrayList
import java.util.Scanner;

public class Project_Kelly_Garcia {   
   public static void main(String[] args) {
   ArrayList<Policy> policies = new Array<>();
   
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
      Scanner keyboard = new Scanner(System.in);
   
      Policy policy = new Policy(policyNumber,providerName, firstName, lastName, age, smokingStatus, height, weight);
      policies.add(policy);
  }
}     catch (FileNotFoundException e) {
         System.out.println("ERROR: PolicyInformation.txt not found.");
         return;
  }
      
      // Display info about the Policies
      for (Policy policy : policies) {
         System.out.println(policy);
      }
   }
}