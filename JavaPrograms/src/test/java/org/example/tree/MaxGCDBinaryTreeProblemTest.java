package org.example.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxGCDBinaryTreeProblemTest {

    @Test
    void testInput1(){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        MaxGCDBinaryTreeProblem p = new MaxGCDBinaryTreeProblem();
        assertEquals(4,p.maxGCD(root));
    }


    @Test
    void testInput2(){
        Node root = new Node(5);
        root.left = new Node(49);
        root.left.left = new Node(5);
        root.left.left.left = new Node(21);
        root.left.left.right = new Node(49);
        root.left.left.left.left = new Node(1);
        root.left.left.left.right = new Node(4);
        MaxGCDBinaryTreeProblem p = new MaxGCDBinaryTreeProblem();
        assertEquals(5, p.maxGCD(root));
    }

    @Test
    void testInput3(){
        Node root = new Node(2);
        root.right = new Node(1);
        root.right.left = new Node(3);
        MaxGCDBinaryTreeProblem p = new MaxGCDBinaryTreeProblem();
        assertEquals(0, p.maxGCD(root));
    }
}