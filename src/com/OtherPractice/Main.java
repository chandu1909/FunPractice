package com.OtherPractice;

public class Main {
  public static void main(String args[]) {
    /*ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
    int height[]={1,8,6,2,5,4,8,3,7};
    containerWithMostWater.process(height);
    LettrCombinationsOfPhoneNumber lettrCombinationsOfPhoneNumber = new LettrCombinationsOfPhoneNumber();
    lettrCombinationsOfPhoneNumber.letterCombinations("23");

    DuplicateStrings duplicateStrings = new DuplicateStrings();
    String listOfStrings[] = {"sanju","chandu","sanju","sanju","fuck","suck","test","fuck"};
    duplicateStrings.findDuplicates(listOfStrings);
     */
    RemoveElement removeElement = new RemoveElement();
    int[] elements = {3, 2, 2, 3};
    int rmElement = 3;
    removeElement.removeElement(elements, rmElement);
  }
}
