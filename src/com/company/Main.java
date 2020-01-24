package com.company;

import com.company.house.house.structure.Door;
import com.company.house.home.House;
import com.company.house.house.structure.Window;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Window window1 = new Window("White", 1.8, 2.4);
        Window window2 = new Window("White", 1.8, 2.4);
        Window window3 = new Window("White", 1.8, 2.4);
        Window window4 = new Window("White", 1.8, 2.4);
        Window window5 = new Window("White", 1.8, 2.4);
        Door door1 = new Door("White", 2.5, 1.2);
        Door door2 = new Door("White", 2.5, 1.2);
        Door door3 = new Door("White", 2.5, 1.2);
        Door door4 = new Door("White", 2.5, 1.2);
        Door door5 = new Door("White", 2.5, 1.2);
        House house = new House(new ArrayList<>(), new ArrayList<>(), true);
        house.getDoors().add(door1);
        house.getDoors().add(door2);
        house.getDoors().add(door3);
        house.getDoors().add(door4);
        house.getDoors().add(door5);
        house.getWindows().add(window1);
        house.getWindows().add(window2);
        house.getWindows().add(window3);
        house.getWindows().add(window4);
        house.getWindows().add(window5);

        house.lockTheHouseByKey();
        house.printQuantityOfDoors(house.getDoors());
        house.printQuantityOfWindows(house.getWindows());
    }
}
