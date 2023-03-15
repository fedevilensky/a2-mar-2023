template <class T>
class ListADT
{
public:
  virtual T get(int pos) = 0;
  virtual void pushFront(T o) = 0;
  virtual void pushBack(T o) = 0;
  virtual void pushAt(T o, int pos) = 0;
  virtual void removeAt(int pos) = 0;
  virtual void remove(T o) = 0;
  virtual bool isEmpty() = 0;
  virtual bool contains(T o) = 0;
  virtual int size() = 0;
};
