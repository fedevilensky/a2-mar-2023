package tads;

public interface PriorityQueue<E, P extends Comparable<P>> {

  public void enqueue(E element, P priority);

  public E dequeue();

  /**
   * @return the element with the most/least priority
   */
  public E peek();

  public boolean isEmpty();

  public boolean isFull();

  public int size();
}
