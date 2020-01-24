package com.company.house.house.structure;

import java.util.Objects;

public class Window extends HouseStructure {
    //region Propertys

    private String color;
    private double height;
    private double width;

    //endregion

    //region Constructors

    public Window(String color, double height, double width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public Window() {
    }

    //endregion

    //region Getter and Setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //endregion

    //region equals,hashCode and toString Public Methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Window window = (Window) o;
        return Double.compare(window.height, height) == 0 &&
                Double.compare(window.width, width) == 0 &&
                Objects.equals(color, window.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, height, width);
    }

    @Override
    public String toString() {
        return "Window{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }

    //endregion
}
