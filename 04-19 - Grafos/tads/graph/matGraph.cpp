#pragma once

#include "../iterator/iterator.cpp"
#include "graph.cpp"

class MatGraph : public Graph
{
private:
  int **mat;
  int matSize;
  bool isDirected;

public:
  MatGraph(int size, bool isDirected)
  {
    this->isDirected = isDirected;
    this->mat = new int *[size];
    for (int i = 0; i < size; i++)
    {
      this->mat[i] = new int[size];
      for (int j = 0; j < size; j++)
      {
        this->mat[i][j] = 0;
      }
    }
  }

  void addEdge(int from, int to) override
  {
    addEdge(from, to, 1);
  }

  void addEdge(int from, int to, int cost) override
  {
    mat[from][to] = cost;
    if (!isDirected)
    {
      mat[to][from] = cost;
    }
  }

  void removeEdge(int from, int to) override
  {
    // TODO Auto-generated method stub
  }

  Iterator<int> *vertices() override
  {
    // TODO Auto-generated method stub
  }

  Iterator<int> *adjacents(int v) override
  {
    // TODO Auto-generated method stub
  }

  Iterator<Edge> *edges() override
  {
    // TODO Auto-generated method stub
  }

  int vertexCount() override
  {
    // TODO Auto-generated method stub
  }

  int **adjacencyMatrix() override
  {
    int **ret = new int *[matSize];
    for (int i = 0; i < matSize; i++)
    {
      ret[i] = new int[matSize];
      for (int j = 0; j < matSize; j++)
      {
        ret[i][j] = mat[i][j];
      }
    }

    return ret;
  }

  bool hasEdge(int from, int to) override
  {
    // TODO Auto-generated method stub
  }

  int getEdgeCost(int from, int to) override
  {
    // TODO Auto-generated method stub
  }
};
