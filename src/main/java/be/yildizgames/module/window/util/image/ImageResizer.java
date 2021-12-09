/*
 * MIT License
 *
 * Copyright (c) 2021 Grégory Van den Borre
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package be.yildizgames.module.window.util.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * This class will resize an image file with a ratio of its width and height.
 *
 * @author Grégory Van den Borre
 */
class ImageResizer {

    /**
     * Private constructor to prevent instantiation, only static functions to be used.
     */
    private ImageResizer() {
        super();
    }

    private static void resize(Path inputImagePath,
                               Path outputImagePath, int scaledWidth, int scaledHeight)
            throws IOException {
        BufferedImage inputImage = ImageIO.read(inputImagePath.toFile());
        BufferedImage outputImage = new BufferedImage(scaledWidth, scaledHeight, inputImage.getType());
        Graphics2D g2d = outputImage.createGraphics();
        g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.drawImage(inputImage, 0, 0, scaledWidth, scaledHeight, null);
        g2d.dispose();

        String formatName = outputImagePath.getFileName().toString().substring(outputImagePath.getFileName().toString()
                .lastIndexOf('.') + 1);

        ImageIO.write(outputImage, formatName, outputImagePath.toFile());
    }

    static void resize(Path inputImagePath,
                       Path outputImagePath, float percent) throws IOException {
        BufferedImage inputImage = ImageIO.read(inputImagePath.toFile());
        int scaledWidth = Math.round((inputImage.getWidth() * percent));
        int scaledHeight = Math.round(inputImage.getHeight() * percent);
        resize(inputImagePath, outputImagePath, scaledWidth, scaledHeight);
    }

    static void resize(Path file, ImageResizeChecker checker) {
        if (Files.isRegularFile(file) && checker.check(file)) {
            try {
                float percent = checker.compute();
                ImageResizer.resize(file, file, percent);
            } catch (IOException e) {
                System.getLogger(ImageResizer.class.getName()).log(System.Logger.Level.ERROR, e);
            }
        }
    }
}
