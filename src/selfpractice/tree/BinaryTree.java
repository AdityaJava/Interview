package selfpractice.tree;

import java.util.Stack;

public class BinaryTree {
    Node rootNode;

    //root-left-right
    public void preOrderTraversal() {
        Stack<Node> myStack = new Stack<>();
        Node tempNode = rootNode;
        while (!myStack.isEmpty() || tempNode!=null){
            if(tempNode.getRight()!=null){
                myStack.push(tempNode.getRight());
            }
            System.out.println(tempNode.getValue());
            tempNode = tempNode.getLeft();
            if(tempNode==null && !myStack.isEmpty()){
                tempNode = myStack.pop();
            }
        }
    }

    public void addNode(Integer value) {
        Node tempNode = rootNode;
        while (true) {
            if (rootNode == null) {
                rootNode = new Node();
                rootNode.setValue(value);
                break;
            } else if (tempNode.getValue() >= value) {
                if (tempNode.getLeft() == null) {
                    tempNode.setLeft(new Node(value));
                    break;
                }
                tempNode = tempNode.getLeft();
            } else if (tempNode.getValue() < value) {
                if (tempNode.getRight() == null) {
                    tempNode.setRight(new Node(value));
                    break;
                }
                tempNode = tempNode.getRight();
            }

        }
    }

    public static void main(String[] args) {
        System.out.println("Start");
        BinaryTree myBinaryTree = new BinaryTree();
        myBinaryTree.rootNode = null;
        myBinaryTree.addNode(9);
        myBinaryTree.addNode(8);
        myBinaryTree.addNode(10);
        myBinaryTree.addNode(87);
        myBinaryTree.addNode(1);
        myBinaryTree.addNode(7);
        myBinaryTree.addNode(100);
        myBinaryTree.addNode(5);
        myBinaryTree.preOrderTraversal();
    }
}
