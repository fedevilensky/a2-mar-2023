package tads.lists;

public class LinkedList<T> implements ListADT<T> {
  class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
      this.data = data;
    }

    Node(T data, Node<T> next) {
      this.data = data;
      this.next = next;
    }
  }

  private Node<T> head;
  private Node<T> last;
  private int length;

  LinkedList() {
    head = null;
    last = null;
    length = 0;
  }

  @Override
  public T get(int pos) {
    if (pos < 0 || pos >= this.length) {
      throw new RuntimeException("pos is not within the valid range");
    }
    Node<T> n = head;
    for (int i = 0; i < pos; i++) {
      n = n.next;
    }
    return n.data;

  }

  @Override
  public void pushFront(T o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pushFront'");
  }

  @Override
  public void pushBack(T o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pushBack'");
  }

  @Override
  public void pushAt(T o, int pos) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'pushAt'");
  }

  @Override
  public void deleteAt(int pos) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteAt'");
  }

  @Override
  public void delete(T o) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public boolean isEmpty() {
    return this.length == 0;
  }

  @Override
  public boolean contains(T o) {
    // Node<T> n = this.head;
    // while (n != null) {
    // if (n.data.equals(o)) {
    // return true;
    // }
    // n = n.next;
    // }
    // return false;
    Node<T> n = this.head;
    boolean exists = false;
    while (n != null && !exists) {
      exists = (n.data).equals(o);
      n = n.next;
    }
    return exists;

  }

  @Override
  public int size() {
    return this.length;
  }

}
