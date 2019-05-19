/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2019 Grégory Van den Borre
 *
 *  More infos available: https://engine.yildiz-games.be
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without
 *  limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 *  of the Software, and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 */

package be.yildizgames.module.coordinate;

/**
 * 2D coordinates values, contains the size(width, height) and the position(x
 * and y).
 * Immutable class.
 *
 * @author Grégory Van den Borre
 */
public final class Coordinates extends BaseCoordinate {


    /**
     * Full constructor.
     *
     * @param widthValue  Width coordinate.
     * @param heightValue Height coordinate.
     * @param leftValue   Left coordinate.
     * @param topValue    Top coordinate.
     */
    public Coordinates(final int widthValue, final int heightValue, final int leftValue, final int topValue) {
        super(widthValue, heightValue, leftValue, topValue);
    }

    /**
     * Full constructor.
     *
     * @param size      Width and height coordinates.
     * @param leftValue Left coordinate.
     * @param topValue  Top coordinate.
     */
    public Coordinates(final Size size, final int leftValue, final int topValue) {
        this(size.width, size.height, leftValue, topValue);
    }

    /**
     * Full constructor.
     *
     * @param size     Width and height coordinates.
     * @param position Left and top coordinates.
     */
    public Coordinates(final Size size, final Position position) {
        this(size.width, size.height, position.left, position.top);
    }

    public Coordinates(final int width, final int height, final Position position) {
        this(width, height, position.left, position.top);
    }

    public Coordinates copy() {
        return new Coordinates(this.width, this.height, this.left, this.top);
    }

    /**
     * @return The size;
     */
    public Size getSize() {
        return new Size(this.width, this.height);
    }
}
