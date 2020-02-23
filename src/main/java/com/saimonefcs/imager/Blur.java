package com.saimonefcs.imager;

public enum Blur {
    LIGHT(1),
    MEDIUM(5),
    HEAVY(10);

    private int brushSize;

    Blur(int brushSize) {
        this.brushSize = brushSize;
    }

    public int getBrushSize() {
        return brushSize;
    }
}
