package com.company.tree;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Tree implements TreeInSpringAndAutumn {
    //region Propertys

    private ArrayList<Leaf> leaves;
    private String colorOfTreesFlower;

    //endregion

    //region Constructors

    public Tree(ArrayList<Leaf> leaves, String colorOfTreesFlower) {
        this.leaves = leaves;
        this.colorOfTreesFlower = colorOfTreesFlower;
    }

    public Tree() {
    }

    //endregion

    //region Public Methods

    @Override
    public void bloom() {
        Leaf leaf = new Leaf("green", 2.4);
        leaves.add(leaf);
        System.out.println("The trees in the spring are bloomed,and their flowers color is " + this.colorOfTreesFlower + ",and leaves color is " + leaves.get(0).getColor() + ".");
    }

    @Override
    public void makeLeafsYellow() {
        Leaf leaf = new Leaf("yellow", 2.7);
        leaves.add(leaf);
        System.out.println("In autumn the trees leaves change their color and become " + leaves.get(1).getColor() + ".");

    }

    @Override
    public void makeLeafsFall() {
        leaves.clear();
        if (leaves.size() == 0) {
            System.out.println("And leaves are fall in the last of autumn.");
        }
    }

    //endregion

    //region Getter and Setter

    public ArrayList<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(ArrayList<Leaf> leaves) {
        this.leaves = leaves;
    }

    public String getColorOfTreesFlower() {
        return colorOfTreesFlower;
    }

    public void setColorOfTreesFlower(String colorOfTreesFlower) {
        this.colorOfTreesFlower = colorOfTreesFlower;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return Objects.equals(leaves, tree.leaves) &&
                Objects.equals(colorOfTreesFlower, tree.colorOfTreesFlower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leaves, colorOfTreesFlower);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leaves=" + leaves +
                ", colorOfTreesFlower='" + colorOfTreesFlower + '\'' +
                '}';
    }

    //endregion
}
