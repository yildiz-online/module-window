/*
 *
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2018 Grégory Van den Borre
 *
 * More infos available: https://www.yildiz-games.be
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

package be.yildizgames.module.window;

/**
 * @author Grégory Van den Borre
 */
public class ScreenPartCursor {

    private Cursor up;

    private Cursor upLeft;

    private Cursor upRight;

    private Cursor left;

    private Cursor right;

    private Cursor bottom;

    private Cursor bottomLeft;

    private Cursor bottomRight;

    private Cursor center;


    public void setUp(Cursor up) {
        this.up = up;
    }

    public void setUpLeft(Cursor upLeft) {
        this.upLeft = upLeft;
    }

    public void setUpRight(Cursor upRight) {
        this.upRight = upRight;
    }

    public void setLeft(Cursor left) {
        this.left = left;
    }

    public void setRight(Cursor right) {
        this.right = right;
    }

    public void setBottom(Cursor bottom) {
        this.bottom = bottom;
    }

    public void setBottomLeft(Cursor bottomLeft) {
        this.bottomLeft = bottomLeft;
    }

    public void setBottomRight(Cursor bottomRight) {
        this.bottomRight = bottomRight;
    }

    public void setCenter(Cursor center) {
        this.center = center;
    }

    public Cursor getCursor(ScreenPart part) {
        switch (part) {
            case LEFT:
                return left;
            case RIGHT:
                return right;
            case UP:
                return up;
            case BOTTOM:
                return bottom;
            case LEFT_UP:
                return upLeft;
            case RIGHT_UP:
                return upRight;
            case LEFT_BOTTOM:
                return bottomLeft;
            case RIGHT_BOTTOM:
                return bottomRight;
            case CENTER:
                return center;
            default:
                return center;
        }
    }
}
