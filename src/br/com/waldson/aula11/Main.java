package br.com.waldson.aula11;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();

        tree.insert(50);

        tree.insert(18);
        tree.insert(11);
        tree.insert(25);

        tree.insert(12);
        tree.insert(14);
        tree.insert(22);

        tree.insert(89);
        tree.insert(14);
        tree.insert(10);
        tree.insert(50);

        System.out.println(tree.isItBalanced());
    }
}
