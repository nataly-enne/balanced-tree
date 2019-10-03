package br.com.waldson.aula11;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        ArvoreBinariaBusca tree = new ArvoreBinariaBusca();

        JFrame frame = new JFrame("Visualizador de ABB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        ArvoreBinariaBuscaView view = new ArvoreBinariaBuscaView(tree);
        frame.add(view);

        frame.setVisible(true);

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
