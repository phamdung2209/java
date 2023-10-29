package Work.Tree;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(binaryTree.add(binaryTree.getRoot(), 5));
        binaryTree.setRoot(binaryTree.add(binaryTree.getRoot(), 2));
        binaryTree.setRoot(binaryTree.add(binaryTree.getRoot(), 8));
        binaryTree.setRoot(binaryTree.add(binaryTree.getRoot(), 7));
        binaryTree.setRoot(binaryTree.add(binaryTree.getRoot(), 4));
        binaryTree.setRoot(binaryTree.add(binaryTree.getRoot(), 1));

        binaryTree.delete(binaryTree.getRoot(), 7);
        System.out.println("Removed number 7");

        binaryTree.PreOrder(binaryTree.getRoot());
        System.out.println();
        binaryTree.InOrder(binaryTree.getRoot());
        System.out.println();
        binaryTree.PostOrder(binaryTree.getRoot());

        System.out.println();
        binaryTree.search(binaryTree.getRoot(), 0);

        System.out.println("Sum: " + binaryTree.sum(binaryTree.getRoot()));

        System.out.println(binaryTree.sumIf(binaryTree.getRoot(), 8));

        System.out.println(binaryTree.high(binaryTree.getRoot()));

        System.out.println();
        System.out.println("DONE");
    }
}
