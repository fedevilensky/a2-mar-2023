#include "listADT.cpp"
#include "assert.h"

template <class T>
struct Node
{
  T data;
  Node<T> *next;

  ~Node() {}
};

template <class T>
class LinkedList : public ListADT<T>
{
private:
  Node<T> *head;
  Node<T> *last;
  int length;

public:
  LinkedList()
  {
    this->head = nullptr;
    this->last = nullptr;
    this->length = 0;
  }

  T get(int pos) override
  {
    assert(!(pos < 0 || pos >= this->length));
    Node<T> *n = head;
    for (int i = 0; i < pos; i++)
    {
      n = n->next;
    }
    return n->data;
  }

  bool contains(T o) override
  {
    Node<T> *n = this->head;
    bool exists = false;
    while (n != nullptr && !exists)
    {
      exists = n->data == o;
      n = n->next;
    }
    return exists;
  }

  int size() override
  {
    return this->length;
  }

  bool isEmpty()
  {
    return this->length == 0;
  }
};

int main() {}
