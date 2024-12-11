/*
 *
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2019 Grégory Van den Borre
 *
 * More infos available: https://engine.yildiz-games.be
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without
 * limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 *
 */

package be.yildizgames.module.window.widget;

/**
 * A native widget image.
 *
 * @author Grégory Van den Borre
 */
public interface WindowImage extends WindowWidget<WindowImage> {

    /**
     * Set the image to display.
     *
     * @param url Url of the image to display [not null].
     * @return This object for chaining [not null].
     */
    WindowImage setImage(String url);

    /**
     * Force the displayed image ratio to be preserved.
     *
     * @return This object for chaining [not null].
     */
    WindowImage preserveRatio();

    /**
     * Add an effect to the image.
     *
     * @param effect Effect to apply [not null].
     * @return This object for chaining [not null].
     */
    default WindowImage addEffect(ImageEffect effect) {
        return this;
    }

    /**
     * Provide the image metadata.
     *
     * @return The metadata of the loaded image [not null].
     */
    default ImageMetadata getLoadedImageMetadata() {
        return new ImageMetadata(0, 0);
    }
}
