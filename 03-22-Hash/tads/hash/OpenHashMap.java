package tads.hash;

import java.util.LinkedList;

public class OpenHashMap<K, V> implements Map<K, V> {
  private class Pair<K, V> {
    K key;
    V value;

    Pair() {
    }

    Pair(K key) {
      this.key = key;
    }

    Pair(K key, V value) {
      this.key = key;
      this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
      Pair<K, V> other = (Pair<K, V>) (obj);
      return this.key.equals(other.key);
    }
  }

  /**
   * LinkedList{Pair{K, V}}[] arr
   */
  private Object[] arr;
  private Hasher<K> hasher;
  private int elements;
  private double lfMax = 1;

  public OpenHashMap(Hasher<K> hasher, int expectedElements) {
    this.hasher = hasher;
    this.arr = new Object[(2 * expectedElements) - 1];
  }

  public OpenHashMap(Hasher<K> hasher, int expectedElements, double lfMax) {
    this.hasher = hasher;
    this.arr = new Object[(2 * expectedElements) - 1];
    this.lfMax = lfMax;
  }

  @Override
  public void insert(K key, V value) {
    int pos = abs(hasher.hash(key) % arr.length);
    if (arr[pos] == null) {
      arr[pos] = new LinkedList<Pair<K, V>>();
    }
    LinkedList<Pair<K, V>> l = (LinkedList<Pair<K, V>>) arr[pos];
    Pair<K, V> p = new Pair(key, value);

    if (l.contains(p)) {
      l.remove(p);
      elements--;
    }

    l.add(p);
    elements++;

    if (loadFactor() > lfMax) {
      rehash();
    }
  }

  @Override
  public V get(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public boolean exists(K key) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'exists'");
  }

  private int abs(int n) {
    if (n < 0) {
      return n * (-1);
    }
    // else
    return n;
  }

  private double loadFactor() {
    return elements / (1.0 * arr.length);
  }

  private void rehash() {
    throw new RuntimeException("Unimplemented");
  }

}
