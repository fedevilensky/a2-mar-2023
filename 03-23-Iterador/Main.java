import java.util.Iterator;

import tads.lists.LinkedList;
import tads.lists.ListADT;

public class Main {
  public static void main(String[] args) {
    ListADT<Integer> l = new LinkedList<Integer>();
    for (int i = 0; i < 10; i++) {
      l.pushFront(i);
    }

    System.out.println("Foreach");
    for (int i : l) {
      System.out.println(i);
    }

    System.out.println("________________________");

    System.out.println("While");
    Iterator<Integer> it = l.iterator();
    while (it.hasNext()) {
      int i = it.next();
      System.out.println(i);
    }
  }
}
