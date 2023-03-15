
template <class T>
class BST
{
public:
  // if data is not in the tree, insert it,
  // otherwise do nothing
  virtual void insert(T data) = 0;

  virtual void remove(T data) = 0;

  virtual int height() = 0;

  virtual int size() = 0;

  virtual void printInOrder() = 0;
};
