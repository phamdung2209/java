package Work.Tree;

import java.security.PublicKey;

public class BinaryTree {
    private NodeTree root;

    public NodeTree getRoot() {
        return root;
    }

    public void setRoot(NodeTree root) {
        this.root = root;
    }

    public NodeTree add(NodeTree node, int value) {
        if (node == null) {
            return new NodeTree(value);
        }
        if (value < node.getData()) {
            node.setLeft(add(node.getLeft(), value));
        }
        if (value > node.getData()) {
            node.setRight(add(node.getRight(), value));
        }
        return node;
    }

    public void PreOrder(NodeTree node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getData() + " ");
        PreOrder(node.getLeft());
        PreOrder(node.getRight());
    }

    public void InOrder(NodeTree node) {
        if (node == null) {
            return;
        }
        InOrder(node.getLeft());
        System.out.print(node.getData() + " ");
        InOrder(node.getRight());
    }

    public void PostOrder(NodeTree node) {
        if (node == null) {
            return;
        }
        PostOrder(node.getLeft());
        PostOrder(node.getRight());
        System.out.print(node.getData() + " ");
    }

    public NodeTree delete(NodeTree node, int value) {
        if (node == null) {
            return node;
        }
        if (value < node.getData()) {
            node.setLeft(delete(node.getLeft(), value));
        } else if (value > node.getData()) {
            node.setRight(delete(node.getRight(), value));
        } else {
            if (node.getRight() == null) {
                return node.getLeft();
            } else if (node.getLeft() == null) {
                return node.getRight();
            } else {
                node.setData(minValue(node.getRight()));
                node.setRight(delete(node.getRight(), node.getData()));
            }
        }
        return node;
    }

    public int minValue(NodeTree node) {
        int minv = node.getData();
        while (node.getLeft() != null) {
            minv = node.getLeft().getData();
            node = node.getLeft();
        }
        return minv;
    }

    public void search(NodeTree node, int value) {
        if (node == null) {
            System.out.println("Not Found!");
            return;
        }
        if (value < node.getData()) {
            search(node.getLeft(), value);
        } else if (value > node.getData()) {
            search(node.getRight(), value);
        } else {
            System.out.println("Found!");
            return;
        }
    }

    public int sum(NodeTree node) {
        if (node == null) {
            return 0;
        }
        return node.getData() + sum(node.getLeft()) + sum(node.getRight());
    }

    public boolean sumIf(NodeTree node, int value) {
        if (node == null || value < 1) {
            return false;
        }
        if (node.getData() == value) {
            return true;
        }
        return sumIf(node.getLeft(), value - node.getData()) || sumIf(node.getRight(), value - node.getData());
    }

    public int high(NodeTree node) {
        if (node == null) {
            return 0;
        }
        int left = high(node.getLeft());
        int right = high(node.getRight());
        return Math.max(left, right) + 1;
    }
}
