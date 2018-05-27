package cr.main;
  
import cr.*;

import java.awt.*;
import java.util.*;
import java.io.*;

public class CenterStack{

    private static int top = -1;
    private static int topForRedo = -1;
    private static Integer[] stackArray = new Integer[50];
    private static Integer[] ArrayForRedo = new Integer[50];
    
    public static boolean isEmpty() {
        return (top == -1);
    }
    
    public static boolean isFull() {
        return (top == 49); // 49 is stack size
    }
    
    public static boolean RedoEmpty(){
        return (topForRedo == -1); 
    }
   
    public static void stackPush(int flag){
        if(isFull()){
            System.out.println("Stack is full");
            return 0;
        }else{
            stackArray[++top] = flag;
            topForRedo = -1; //If user puch the flag in stack, top for redo is initialized
        }
    }

    public static int undo() {
        if(isEmpty()){
            System.out.println("Stack is empty");
            return 0;
        }else{
            ArrayForRedo[++topForRedo] = stackArray[top];
            return stackArray[top--];
        }
    }
 
    public static int redo(){
        if(RedoEmpty){
            System.out.println("Redo is empty");
            return 0;
        }
        else{
            return ArrayForRedo[topForRedo--];
            }
    }



}
