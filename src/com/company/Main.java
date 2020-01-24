package com.company;

import com.company.tree.Tree;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree(new ArrayList<>(), "white");
        tree.bloom();
        tree.makeLeafsYellow();
        tree.makeLeafsFall();
    }
}
