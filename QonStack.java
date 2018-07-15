import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class QonStack {

        static class Queue {

            Stack<Integer> stack1;

        }

        static void push(Stack<Integer> tref,int new_data) {

            tref.push(new_data);

        }

        static int pop(Stack<Integer> tref) {

          if( tref == null ){
            System.out.println("Stack is empty!!");
            System.exit(0);
          }

          return tref.pop();

        }

        static void enQueue(Queue q,int x) {

          push(q.stack1,x);

        }

        static int deQueue(Queue q) {

          int x,res;

          if( q.stack1.isEmpty() ) {

            System.out.println("Queue is empty");
            System.exit(0);

          }

          else if( q.stack1.size() == 1 ) {

             return pop(q.stack1);

          }

          else {

             x = pop(q.stack1);

             res = deQueue(q);

             push(q.stack1,x);

             return res;

          }

          return 0;
        }


       public static void main(String[] args) {

           Queue q = new Queue();
           q.stack1 = new Stack<Integer>();

           enQueue(q,1);
           enQueue(q,2);
           enQueue(q,3);

           System.out.println(deQueue(q)+" ");
           System.out.println(deQueue(q)+" ");
           System.out.println(deQueue(q)+" ");


       }

  }
