package tads.hash;

public class StringHasherMALO implements Hasher<String> {

  @Override
  public int hash(String data) {
    int h = 0;
    for (int i = 0; i < data.length(); i++) {
      // h += data[i];
      h += data.charAt(i);
    }

    return h;
  }

}
