package tads.hash;

public interface Map<K, V> {
  void insert(K key, V value);

  V get(K key);

  boolean exists(K key);
}
