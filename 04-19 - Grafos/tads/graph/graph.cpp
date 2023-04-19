#pragma once

#include "../iterator/iterator.cpp"
#include "edge.cpp"

class Graph
{
public:
  virtual void addEdge(int from, int to) = 0;

  virtual void addEdge(int from, int to, int cost) = 0;

  virtual void removeEdge(int from, int to) = 0;

  virtual Iterator<int> *vertices() = 0;

  virtual Iterator<int> *adjacents(int v) = 0;

  virtual Iterator<Edge> *edges() = 0;

  virtual int vertexCount() = 0;

  virtual int **adjacencyMatrix() = 0;

  virtual bool hasEdge(int from, int to) = 0;

  virtual int getEdgeCost(int from, int to) = 0;
};
