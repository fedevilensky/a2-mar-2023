package tads;

public class MinHeap<E, P extends Comparable<P>> implements PriorityQueue<E, P> {
  class Pair<E, P> {
    E element;
    P priority;

    Pair(E element, P priority) {
      this.element = element;
      this.priority = priority;
    }
  }

  /**
   * Pair{E,P}[]
   */
  private Object[] arr;
  private int elements;

  public MinHeap(int n) {
    this.arr = new Object[n];
    this.elements = 0;
  }

  public MinHeap() {
    this.arr = new Object[100];
    this.elements = 0;
  }

  @Override
  public void enqueue(E element, P priority) {
    if (isFull()) {
      throw new RuntimeException("Queue is full");
    }

    elements++;
    arr[elements] = new Pair<E, P>(element, priority);

    siftUp(elements);
  }

  @Override
  public E dequeue() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'dequeue'");
  }

  @Override
  public E peek() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'peek'");
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
  }

  @Override
  public boolean isFull() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isFull'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

  private int father(int n) {
    return n / 2;
  }

  private void swap(int posA, int posB) {
    Object aux = this.arr[posA];
    this.arr[posA] = this.arr[posB];
    this.arr[posB] = aux;
  }

  private boolean fatherIsGreater(int pos) {
    Pair<E, P> f = (Pair<E, P>) arr[father(pos)];
    Pair<E, P> c = (Pair<E, P>) arr[pos];
    return f.priority.compareTo(c.priority) > 0;
  }

  /**
   * es la funcion flotar
   */
  private void siftUp(int pos) {
    while (pos != 1 && fatherIsGreater(pos)) {
      swap(pos, father(pos));
      pos = father(pos);
    }
  }
}
