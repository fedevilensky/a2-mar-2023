package tads.hash;

public class IntHasher implements Hasher<Integer> {

  @Override
  public int hash(Integer data) {
    return data;
  }

}
