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
    // make scanner for input
    Scanner input = new Scanner(System.in);
    // ask for first set of integers
    System.out.println("Please enter the values for the first array:");
    // make array for first set of integers
    int[] numsOne = new int[5];
    // for loop so they can type 5 integers and input it into array
      for(int i = 0; i < numsOne.length; i++){
       numsOne[i] = input.nextInt();
      }
      // Asking for 2nd set of integers
    System.out.println("Please enter the values for the second array:");
    // array for 2nd set of integers
    int[] numsTwo = new int[5];
    // for oop so they can type 5 integers and input it into 2nd array
      for(int i = 0; i < numsTwo.length; i++){
       numsTwo[i] = input.nextInt();
      }
    // if statements checking if each integer is equal to its correlated one
      if(numsOne[0] != numsTwo[0]){
        System.out.println("These arrays are not the same");
      }else if(numsOne[1] != numsTwo[1]){
        System.out.println("These arrays are not the same");
      } else if(numsOne[2] != numsTwo[2]){
        System.out.println("These arrays are not the same");
      } else if(numsOne[3] != numsTwo[3]){
        System.out.println("These arrays are not the same");
      } else if(numsOne[4] != numsTwo[4]){
        System.out.println("These arrays are not the same");
      }
      // if statemnt for if theyre equal
    if (numsOne[4] == numsTwo[4] && numsOne[1] == numsTwo[1]){
      System.out.println("These arrays are the same");
    } 
    
  }
  
}

      
