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

package be.yildizgames.module.window;

import be.yildizgames.common.util.Checker;
import be.yildizgames.module.window.input.MousePosition;

/**
 * Different virtual part of the screen.
 *
 * @author Grégory Van den Borre
 */
public enum ScreenPart {


    /**
     * From left part of screen to left part + border size.
     */
    LEFT,

    /**
     * From right part of screen to right part - border size.
     */
    RIGHT,

    /**
     * From top part to top part + border size.
     */
    UP,

    /**
     * From bottom part to bottom part - border size.
     */
    BOTTOM,

    /**
     * From top and left part.
     */
    LEFT_UP,

    /**
     * From top and right part.
     */
    RIGHT_UP,

    /**
     * From bottom and left part.
     */
    LEFT_BOTTOM,

    /**
     * From bottom and right part.
     */
    RIGHT_BOTTOM,

    /**
     * If in none of the other screen parts.
     */
    CENTER;

    /**
     * Border limit.
     */
    private static final int BORDER_SIZE = 5;

    /**
     * Retrieve the screen part containing the given position.
     *
     * @param res      Rectangle with the screen size.
     * @param position Position to check.
     * @return The screen part where the given position is.
     */
    public static ScreenPart getFromPosition(ScreenSize res, final MousePosition position) {
        final int x = position.getX();
        final int y = position.getY();
        final boolean centerX = Checker.inRange(x, ScreenPart.BORDER_SIZE, res.width - ScreenPart.BORDER_SIZE);
        final boolean centerY = Checker.inRange(y, ScreenPart.BORDER_SIZE, res.height - ScreenPart.BORDER_SIZE);
        if (centerX && centerY) {
            return ScreenPart.CENTER;
        }
        if (Checker.inRange(x, 0, ScreenPart.BORDER_SIZE)) {
            if (Checker.inRange(y, 0, ScreenPart.BORDER_SIZE)) {
                return ScreenPart.LEFT_UP;
            } else if (Checker.inRange(y, res.height - ScreenPart.BORDER_SIZE, res.height)) {
                return ScreenPart.LEFT_BOTTOM;
            } else {
                return ScreenPart.LEFT;
            }
        } else if (Checker.inRange(x, res.width - ScreenPart.BORDER_SIZE, res.width)) {
            if (Checker.inRange(y, 0, ScreenPart.BORDER_SIZE)) {
                return ScreenPart.RIGHT_UP;
            } else if (Checker.inRange(y, res.height - ScreenPart.BORDER_SIZE, res.height)) {
                return ScreenPart.RIGHT_BOTTOM;
            } else {
                return ScreenPart.RIGHT;
            }
        } else if (Checker.inRange(y, 0, ScreenPart.BORDER_SIZE)) {
            return ScreenPart.UP;
        } else if (Checker.inRange(y, res.height - ScreenPart.BORDER_SIZE, res.height)) {
            return ScreenPart.BOTTOM;
        }
        return ScreenPart.CENTER;
    }
}
