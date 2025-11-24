package LoopPrograms_DecisionStatements;

// Write a program using for loop - Check if Number is Armstrong

public class ArmstrongNumberCheck_forLoop {

    public static void main(String[] args) {

                int givenNum = 153; // given number

                int sum = 0; // storing sum

               int num = givenNum; //to store the original number as it is

                while (num>=1) {

                    int i =num%10;  // to get teh last digit

                    sum = sum + (i*i*i);  // sum updated for each digit

                    num = num/10; // to remove last digit - update

                  //  System.out.println(sum);

                }

                if (sum==givenNum) {

                    System.out.println(givenNum + " is an Armstrong Number");
                }

                    else {

                        System.out.println(givenNum + " is not an Armstrong Number");  // change the number and check


                    }
            }

        }



