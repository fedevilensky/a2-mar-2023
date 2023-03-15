#include "bst.cpp"

template <class T>
struct avlNode
{
  T data;
  avlNode<T> *left = nullptr;
  avlNode<T> *right = nullptr;
  int height = 1;

  avlNode(T data)
  {
    this->data = data;
  }
};

template <class T>
class AVL : public BST<T>
{
public:
  void insert(T data) override
  {
    root = insert(root, data);
  }

  void remove(T data) override{
      // TODO: implement
  };

  int height() override
  {
    // TODO: implement
    return 0;
  };

  int size() override
  {
    // TODO: implement
    return 0;
  };

  void printInOrder() override{
      // TODO: implement
  };

private:
  avlNode<T> *root;
  int elements;

  int max(int a, int b)
  {
    if (a > b)
    {
      return a;
    }
    return b;
  }

  avlNode<T> *insert(avlNode<T> *node, T data)
  {
    if (node == nullptr)
    {
      elements++;
      return new avlNode<T>(data);
    }
    if (data == node->data)
    {
      return node;
    }

    if (data < node->data)
    {
      node->left = insert(node->left, data);
    }
    else
    {
      node->right = insert(node->right, data);
    }

    node->height = 1 + max(height(node->left), height(node->right));

    int bf = balanceFactor(node);

    if (bf > 1)
    {
      int bfRight = balanceFactor(node->right);
      if (bfRight > 0)
      {
        return leftRotation(node);
      }
      else
      {
        return rightLeftRotation(node);
      }
    }
    if (bf < -1)
    {
      int bfLeft = balanceFactor(node->left);
      if (bfLeft < 0)
      {
        return rightRotation(node);
      }
      else
      {
        return leftRightRotation(node);
      }
    }

    return node;
  }

  avlNode<T> *leftRotation(avlNode<T> *z)
  {
    avlNode<T> *y = z->right;
    avlNode<T> *y_l = y->left;

    y->left = z;
    z->right = y_l;

    z->height = 1 + max(height(z->left), height(z->right));
    y->height = 1 + max(height(y->left), height(y->right));

    return y;
  }

  avlNode<T> *rightRotation(avlNode<T> *z)
  {
    // TODO: implement
    return nullptr;
  }

  avlNode<T> *leftRightRotation(avlNode<T> *z)
  {
    // TODO: implement
    return nullptr;
  }

  avlNode<T> *rightLeftRotation(avlNode<T> *z)
  {
    // TODO: implement
    return nullptr;
  }

  int balanceFactor(avlNode<T> *node)
  {
    return height(node->right) - height(node->left);
  }

  int height(avlNode<T> *node)
  {
    if (node == nullptr)
    {
      return 0;
    }
    return node->height;
  }
};

int main()
{
  BST<int> *bst = new AVL<int>();
}
