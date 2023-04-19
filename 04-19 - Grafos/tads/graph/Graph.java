package tads.graph;

import java.util.Iterator;

public interface Graph {
  public void addEdge(int from, int to);

  public void addEdge(int from, int to, int cost);

  public void removeEdge(int from, int to);

  public Iterator<Integer> vertices();

  public Iterator<Integer> adjacents(int v);

  public Iterator<Edge> edges();

  public int vertexCount();

  public int[][] adjacencyMatrix();

  public boolean hasEdge(int from, int to);

  public int getEdgeCost(int from, int to);
}
