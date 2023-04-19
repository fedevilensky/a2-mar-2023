#pragma once

class Edge
{
public:
  int from;
  int to;
  int cost;

  Edge(int from, int to, int cost)
  {
    this->from = from;
    this->to = to;
    this->cost = cost;
  }

  Edge(int from, int to)
  {
    this->from = from;
    this->to = to;
    this->cost = 0;
  }
};
