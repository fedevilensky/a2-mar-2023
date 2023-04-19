package tads.graph;

public class Edge {
  public int from;
  public int to;
  public int cost;

  public Edge(int from, int to) {
    this.from = from;
    this.to = to;
    this.cost = 1;
  }

  public Edge(int from, int to, int cost) {
    this.from = from;
    this.to = to;
    this.cost = cost;
  }
}
