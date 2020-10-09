import java.util.Scanner;
/**
 * compares two arrays and says if they are they same or not
 * @jacoe0850 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the values for the first array:");
    int[] numsOne = new int[5];
      for(int i = 0; i < numsOne.length; i++){
       numsOne[i] = input.nextInt();
      }
    System.out.println("Please enter the values for the second array:");
    int[] numsTwo = new int[5];
      for(int i = 0; i < numsTwo.length; i++){
       numsTwo[i] = input.nextInt();
      }
    
      if(numsOne[1] != numsTwo[1]){
        System.out.println("These arrays are not the same");
        for(int i = 0; i < 5; i++){
          if(numsOne[i] == numsTwo[i]){
      System.out.println("These arrays are the same");
      } 

  }

  }
}
}