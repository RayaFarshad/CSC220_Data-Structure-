/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asmt02part03;

/**
 *
 * @author rayafarshad
 */
public interface StackInterface<T> {
    
    
    /**
 * An interface for the ADT stack.
 * 
 * **************************** PLEASE DO NOT CHANGE THIS FILE ***********
 * 
 * @param <T>
*/

   /** Adds a new entry to the top of this stack.
       @param newEntry  An object to be added to the stack. */
   public void push(T newEntry);
  
   /** Removes and returns this stack's top entry.
       @return  The object at the top of the stack. 
       @throws  EmptyStackException if the stack is empty before the operation. */
   public T pop();
  
   /** Retrieves this stack's top entry.
       @return  The object at the top of the stack.
       @throws  EmptyStackException if the stack is empty. */
   public T peek();
  
   /** Detects whether this stack is empty.
       @return  True if the stack is empty. */
   public boolean isEmpty();
  
   /** Removes all entries from this stack. */
   public void clear();
} // end StackInterface

