package tads.iterator;

public interface Iterator<T> {
  public boolean hasNext();

  public T next();
}

/*
 * Iterator<Integer> it = l.iterator();
 * while(it.hasNext()){
 * n = it.next();
 * }
 * 
 * for(int n : l){
 * 
 * }
 */
