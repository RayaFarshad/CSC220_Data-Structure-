/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asmt02part03;



import java.util.Stack;


public class OurStack<T> implements StackInterface<T>
{
	Stack<T> theStack;
        
        
         
	public OurStack() { 
            theStack = new Stack<>();
        } // end default constructor

        @Override
	public void push(T newEntry) {
            theStack.push(newEntry);
        } // end push

        @Override
	public T peek() {
            return theStack.peek();
        } // end peek

        @Override
	public T pop() { 
           return theStack.pop();
        } // end pop

        @Override
	public boolean isEmpty() { 
            return theStack.isEmpty();
        } // end isEmpty

        @Override
	public void clear() {
             theStack.clear() ;
        } // end clear

} // end OurStack
