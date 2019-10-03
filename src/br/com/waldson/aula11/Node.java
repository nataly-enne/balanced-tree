package br.com.waldson.aula11;

import static java.lang.Boolean.TRUE;

public class Node {
    
    private  Node left;
    private  Node right;
    
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } 
            else{
                this.left.insert(node);
            }
        } 
        else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } 
            else{
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }


    public boolean balancedSides() {
        int limit = 1;

        int left_l = 0;
        int right_l = 0;

        if(left != null) {
            left_l = 1 + left.road();
        }
        if(right != null) {
            right_l = 1 + right.road();
        }

        if (Math.abs(left_l - right_l) > limit) {
            return false;
        }

        boolean left_balance = true;
        boolean right_balance = true;

        if(left != null) {
            left_balance = left.balancedSides();
        }
        if(right != null) {
            right_balance = right.balancedSides();
        }

        boolean balance_sides = left_balance && right_balance;
        return balance_sides;
    }

    public int road() {
        int left_l = 0;
        int right_l = 0;

        if(left != null) {
            left_l = 1 + left.road();
        }
        if(right != null) {
            right_l = 1 + right.road();
        }

        return Math.max(left_l, right_l);
    }
}
