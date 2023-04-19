package tads.graph;

import java.util.Iterator;

public class MatGraph implements Graph {
  private int[][] mat;
  private boolean isDirected;

  public MatGraph(int size, boolean isDirected) {
    this.isDirected = isDirected;
    this.mat = new int[size][];
    for (int i = 0; i < size; i++) {
      this.mat[i] = new int[size];
      // para c++
      for (int j = 0; j < size; j++) {
        this.mat[i][j] = 0;
      }
    }
  }

  @Override
  public void addEdge(int from, int to) {
    addEdge(from, to, 1);
  }

  @Override
  public void addEdge(int from, int to, int cost) {
    mat[from][to] = cost;
    if (!isDirected) {
      mat[to][from] = cost;
    }
  }

  @Override
  public void removeEdge(int from, int to) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'removeEdge'");
  }

  @Override
  public Iterator<Integer> vertices() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'vertices'");
  }

  @Override
  public Iterator<Integer> adjacents(int v) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'adjacents'");
  }

  @Override
  public Iterator<Edge> edges() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'edges'");
  }

  @Override
  public int vertexCount() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'vertexCount'");
  }

  @Override
  public int[][] adjacencyMatrix() {
    int[][] ret = new int[mat.length][];
    for (int i = 0; i < mat.length; i++) {
      ret[i] = new int[mat[i].length];
      for (int j = 0; j < mat[i].length; j++) {
        ret[i][j] = mat[i][j];
      }
    }

    return ret;
  }

  @Override
  public boolean hasEdge(int from, int to) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'hasEdge'");
  }

  @Override
  public int getEdgeCost(int from, int to) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getEdgeCost'");
  }

}
