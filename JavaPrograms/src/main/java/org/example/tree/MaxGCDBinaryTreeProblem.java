package org.example.tree;

public class MaxGCDBinaryTreeProblem {

    private int maxGCD = -1;

    private Node maxGCDNode = null;

    private GCDFinder gcdFinder = new GCDFinder();




    int maxGCD(Node root){
        maxGCD = -1;
        maxGCDNode = null;
        traverse(root);
        if (maxGCD == -1){
            return 0;
        }
        return maxGCDNode.data;
    }

    private void traverse(Node root){
        if (root == null){
            return;
        }
        traverse(root.left);
        traverse(root.right);
        if (root.left == null || root.right == null){
            return;
        }
        int gcd = gcdFinder.findGCD(root.left.data , root.right.data);
        if (gcd > maxGCD){
            maxGCD = gcd;
            maxGCDNode = root;
        }else if ( gcd == maxGCD && maxGCDNode != null && root.data > maxGCDNode.data){
            maxGCDNode = root;
        }
    }


}
