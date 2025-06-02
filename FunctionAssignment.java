public class FunctionAssignment{


  // Function to compute the average of three numbers
  public static void averageThreeNum(int a, int b, int c){
    int total = a + b + c;
    int average = total / 3;

    System.out.println("Average of three number is" + average);
  }


// Function to check if number is even or not
  public static boolean isEven(int n){
    if(n == 2){
        return true;
    }

    if(n % 2 != 0){
        return false;
    } else {
        return true;
    }
  }

// Function to check the above isEven method
public static void methodCheck(){
   if(isEven(3)){
    System.out.println("Number is even");
   } else {
    System.out.println("Number is odd");
   }
}

// Function to check if number is palindrome or not

public static boolean isPalindrome(int n){
    int myNum = n;
    int reversedNum = 0;

    while(n > 0){
        int lastDigit = n % 10;
        reversedNum = reversedNum * 10 + lastDigit;
        n = n/10;
    }

    if(myNum == reversedNum){
        return true;
    } else {
        return false;
    }
}



    public static void main(String args[]){
    
//    methodCheck();
System.out.println(isPalindrome(321));

    }
}