package com.company.house.home;

import com.company.house.house.structure.Door;
import com.company.house.house.structure.Printable;
import com.company.house.house.structure.Window;

import java.util.ArrayList;
import java.util.Objects;

public class House implements OpenOrCloseHouseDoor, Printable {
    //region Propertys

    private ArrayList<Window> windows;
    private ArrayList<Door> doors;
    private boolean key;

    //endregion

    //region Constructors

    public House(ArrayList<Window> windows, ArrayList<Door> doors, boolean key) {
        this.windows = windows;
        this.doors = doors;
        this.key = key;
    }

    public House() {
    }

    //endregion

    //region Public Methods

    @Override
    public void lockTheHouseByKey() {
        if (this.key) {
            System.out.println("The house door is open.");
        } else {
            System.out.println("This is not the house key.");
        }
    }

    @Override
    public void printQuantityOfWindows(ArrayList<Window> windows) {
        Window window = new Window();
        window.setQuantity(windows.size());
        System.out.println("House have " + window.getQuantity() + " windows");
    }

    @Override
    public void printQuantityOfDoors(ArrayList<Door> doors) {
        Door door = new Door();
        door.setQuantity(doors.size());
        System.out.println("House have " + door.getQuantity() + " doors");
    }

    //endregion

    //region Getter and Setter

    public ArrayList<Window> getWindows() {
        return windows;
    }

    public void setWindows(ArrayList<Window> windows) {
        this.windows = windows;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public void setDoors(ArrayList<Door> doors) {
        this.doors = doors;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return key == house.key &&
                Objects.equals(windows, house.windows) &&
                Objects.equals(doors, house.doors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(windows, doors, key);
    }

    @Override
    public String toString() {
        return "House{" +
                "windows=" + windows +
                ", doors=" + doors +
                ", key=" + key +
                '}';
    }

    //endregion
}
