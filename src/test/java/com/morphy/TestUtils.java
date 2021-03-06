package com.morphy;

import java.awt.image.BufferedImage;
import java.io.File;

public class TestUtils {

    public static File loadFile(String filePath) {
        ClassLoader classLoader = TestUtils.class.getClassLoader();
        return new File(classLoader.getResource(filePath).getFile());
    }

    public static BufferedImage loadImage(String filePath) {
        File file = loadFile(filePath);
        return Morphy.fromFile(file).buildImage();
    }

    public static boolean compareImages(BufferedImage expected, BufferedImage actual) {
        return Morphy.compareImages(expected, actual);
    }
}
