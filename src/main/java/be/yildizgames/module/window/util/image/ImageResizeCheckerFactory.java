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

import be.yildizgames.module.window.WindowEngine;

/**
 * @author Grégory Van den Borre
 */
public class ImageResizeCheckerFactory {

    public static final String ALWAYS = "always";
    public static final String WEIGHT = "weight";
    public static final String THUMBNAIL_256 = "thumbnail-256";
    public static final String THUMBNAIL_512 = "thumbnail-512";
    private final WindowEngine engine;

    public ImageResizeCheckerFactory(WindowEngine engine) {
        super();
        this.engine = engine;
    }

    public ImageResizeChecker create(String configuration) {
        return switch (configuration) {
            case ALWAYS -> new AlwaysResizeChecker();
            case WEIGHT -> new OnWeightChecker(1048576);
            case THUMBNAIL_256 -> engine.createImageResizeChecker(256, 256);
            case THUMBNAIL_512 -> engine.createImageResizeChecker(512, 512);
            default -> new NeverResizeChecker();
        };
    }

}
