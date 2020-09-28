package com.yichen.threadTest;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

public class CASBlockQueue {
   class Node{
       Object o;
       AtomicReference<Node> next;
       public Node(Object o,Node next) {
            this.o=o;
            this.next=new AtomicReference<Node>(next);
       }
   }

   Node head=new Node(null,null);
   Node tail=new Node(null,head);

   public void  add(Object e){
       Node new_node = new Node(e, null);
       while (true){
           Node curLast = tail.next.get();
           curLast.next.get();


       }


   }

}
