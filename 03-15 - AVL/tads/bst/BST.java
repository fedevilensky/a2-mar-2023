package tads.bst;

public interface BST<T extends Comparable<T>> {
  /***
   * insert inserts the data into the bst, if the data is already
   * in the bst, it does nothing
   */
  public void insert(T data);

  public void remove(T data);

  public int height();

  public int size();

  public void printInOrder();
}
