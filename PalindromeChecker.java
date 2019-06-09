/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asmt02part03;////////I asked help from Cody Xu

import java.util.Scanner;

/**
 *
 * A class that determines whether or not a string is a palindrome;
 * that is, a string that's able to be spelled the same way from
 * left to right as it is right to left, ignoring punctuation,
 * spaces, and case.
 *
 */
public class PalindromeChecker 
{
	/** 
	 *
	 * Tests whether a string is a palindrome, 
	 * ignoring punctuation, spaces, and case. 
	 * 
         * @param tempString
	 * @param aString  A string.
         * @return
	 *
	 * */
    
 
	public static boolean isPalindrome(String aString)
	{
		StringBuilder tempString = new StringBuilder(aString.toLowerCase());
                //1)Creat an empty Stack = myStack & newStack.
                StackInterface<Character> myStack = new OurStack<>();
                StackInterface<Character> newStack = new OurStack<>();
                //2)adding string input(tempString) into the myStack
                for(int i = 0; i < tempString.length();i++){
                    char nextChar = tempString.charAt(i);
                    myStack.push(nextChar);
                }
                //3)Remove the Punctuations from myStack and put it into the newStack so the newStack 
                //is without any punctuation and reversed.
                while(!myStack.isEmpty()){
                    if (isPunctuation(myStack.peek()))
                        myStack.pop();
                    
                    else{
                        newStack.push(myStack.pop());
                    }
                }
                
              
               
                //4)Check if the newStack(contain the reversed tempString without punctuation)
                //is equal to newString or not.
                boolean result = true;
                int continuingIndex = 0;
                int numChars = newString(tempString).length();
                while (!newStack.isEmpty() && continuingIndex<numChars){
                    if (newStack.equals(newString(tempString).charAt(continuingIndex))){
                        newStack.pop();
                        continuingIndex++;
                        result = true;
                    } else  {
                        numChars = -1;
                        result = false;                        
                    }                   
                }		
//
//		while (!done && (continuingIndex < numChars))
//		{
//	// Check whether the character at the top of the stack
//	// is equal to the character at the current position in tempString.
//                
//		} // end while
		return result;
	} // end isPalindrome

	/** Tests whether a character is a punctuation mark, such as a period.
	 *
	 * @param aCharacter  The character to be tested.
	 * @return  True if the character is a punctuation mark, or false if not. 
	 *
	 */
	public static boolean isPunctuation(char aCharacter){
            return (aCharacter == ',')||
            (aCharacter == '!') || 
            (aCharacter == '?') ||
            (aCharacter == ':') ||
            (aCharacter == '.')||
            (aCharacter == ' ')||
            (aCharacter == '\'');                                 
	} // end isPunctuation
        
            // remove all the punctuation from the tepmString and save it in newString.
        public static StringBuilder newString(StringBuilder tempString){
            StringBuilder newString = new StringBuilder();
            for (int i=0; i<tempString.length();i++){
                if ((isPunctuation(tempString.charAt(i)))){
                    tempString.deleteCharAt(i);   
                } else {
                 return newString.append(tempString.charAt(i));
                }
            }
            newString.reverse();         
            return newString;         
        }
        
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
                boolean result=true;
                while(result)
                {
                System.out.print("Enter a string that you want to check (or enter 1 to exit: ");
                String aString = keyboard.nextLine();
                
                if(aString.equals("!"))
                {
                   System.out.println("Done!");
                   result=false;
                }else if(isPalindrome(aString)==true)
                {
                    System.out.print(aString+" Is a palindrome!");
                    System.out.println();
                }else if(isPalindrome(aString)==false)
                {
                     System.out.print(aString+" Is not a palindrome!");
                    System.out.println();
                }
                
               
                }
                
                
                        
                
            
//		System.out.println("Done!");
	} // end main
       
      
       
} // end PalindromeChecker

