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

package be.yildizgames.module.coordinates;

/**
 * 2D coordinates values, contains the size(width, height) and the position(x
 * and y).
 * Immutable class.
 *
 * @author Grégory Van den Borre
 */
public final class FullCoordinates extends BaseCoordinate {

    public static final Coordinates ZERO = new FullCoordinates(0, 0, 0, 0);

    /**
     * Full constructor.
     *
     * @param widthValue  Width coordinate.
     * @param heightValue Height coordinate.
     * @param leftValue   Left coordinate.
     * @param topValue    Top coordinate.
     */
    private FullCoordinates(final int widthValue, final int heightValue, final int leftValue, final int topValue) {
        super(widthValue, heightValue, leftValue, topValue);
    }

    public static Coordinates full(int width, int height, int left, int top) {
        return new FullCoordinates(width, height, left, top);
    }

    public static Coordinates full(Position p) {
        return new FullCoordinates(0, 0, p.getLeft(), p.getTop());
    }

    public static Coordinates full(Size s) {
        return new FullCoordinates(s.getWidth(), s.getHeight(), 0, 0);
    }

    public static Size size(int width, int height) {
        return new FullCoordinates(width, height, 0, 0);
    }

    public static Size size(int size) {
        return new FullCoordinates(size, size, 0, 0);
    }

    public static Size size(Coordinates coordinates) {
        return new FullCoordinates(coordinates.getWidth(), coordinates.getHeight(), 0, 0);
    }

    public static Size size(Size s) {
        return new FullCoordinates(s.getWidth(), s.getHeight(), 0, 0);
    }

    public static Position position(int position) {
        return new FullCoordinates(0, 0, position, position);
    }

    public static Position position(int left, int top) {
        return new FullCoordinates(0, 0, left, top);
    }

    public static Position position(Coordinates coordinates) {
        return new FullCoordinates(0, 0, coordinates.getLeft(), coordinates.getTop());
    }

    public static Position position(Position p) {
        return new FullCoordinates(0, 0, p.getLeft(), p.getTop());
    }

    /**
     * Full constructor.
     *
     * @param size      Width and height coordinates.
     * @param leftValue Left coordinate.
     * @param topValue  Top coordinate.
     */
    public static Coordinates full(final Size size, final int leftValue, final int topValue) {
        return new FullCoordinates(size.getWidth(), size.getHeight(), leftValue, topValue);
    }

    /**
     * Full constructor.
     *
     * @param size     Width and height coordinates.
     * @param position Left and top coordinates.
     */
    public static Coordinates full(final Size size, final Position position) {
        return new FullCoordinates(size.getWidth(), size.getHeight(), position.getLeft(), position.getTop());
    }

    public  static Coordinates full(final int width, final int height, final Position position) {
        return new FullCoordinates(width, height, position.getLeft(), position.getTop());
    }

    public Coordinates copy() {
        return full(this.getWidth(), this.getHeight(), this.getLeft(), this.getTop());
    }
}
