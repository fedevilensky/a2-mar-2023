package tads.bst;

public class AVL<T extends Comparable<T>> implements BST<T> {
  class Node<T> {
    T data;
    Node<T> left = null;
    Node<T> right = null;
    int height = 1;

    Node(T data) {
      this.data = data;
    }
  }

  private Node<T> root;
  private int elements;

  @Override
  public void insert(T data) {
    root = insert(root, data);
  }

  private Node<T> insert(Node<T> node, T data) {
    if (node == null) {
      elements++;
      return new Node<T>(data);
    }
    if (data.compareTo(node.data) == 0) {
      return node;
    }
    if (data.compareTo(node.data) < 0) {
      node.left = insert(node.left, data);
    } else {
      node.right = insert(node.right, data);
    }

    node.height = 1 + max(height(node.left), height(node.right));

    int bf = balanceFactor(node);

    if (bf > 1) {
      int bfRight = balanceFactor(node.right);
      if (bfRight > 0) {
        return leftRotation(node);
      } else {
        return rightLeftRotation(node);
      }
    }
    if (bf < -1) {
      int bfLeft = balanceFactor(node.left);
      if (bfLeft < 0) {
        return rightRotation(node);
      } else {
        return leftRightRotation(node);
      }
    }

    return node;
  }

  private Node<T> leftRotation(Node<T> z) {
    Node<T> y = z.right;
    Node<T> y_l = y.left;

    y.left = z;
    z.right = y_l;

    z.height = 1 + max(height(z.left), height(z.right));
    y.height = 1 + max(height(y.left), height(y.right));

    return y;
  }

  private int balanceFactor(Node<T> node) {
    return height(node.right) - height(node.left);
  }

  private int max(int a, int b) {
    if (a > b) {
      return a;
    }
    return b;
  }

  private int height(Node<T> node) {
    if (node == null) {
      return 0;
    }
    return node.height;
  }

  @Override
  public void remove(T data) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'remove'");
  }

  @Override
  public int height() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'height'");
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'size'");
  }

  @Override
  public void printInOrder() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'printInOrder'");
  }

}
