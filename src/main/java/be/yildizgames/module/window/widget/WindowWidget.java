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

import be.yildizgames.module.coordinate.Coordinates;
import be.yildizgames.module.coordinate.Position;
import be.yildizgames.module.coordinate.Size;
import be.yildizgames.module.window.input.MouseOverListener;

/**
 * Base element with common behavior for the different widgets.
 * @param <T> Widget true type.
 *
 * @author Grégory Van den Borre
 */
public interface WindowWidget<T extends WindowWidget> {

    /**
     * Set the widget size and position.
     * @param coordinates Widget size and position.
     * @return This object for chaining.
     */
    T setCoordinates(Coordinates coordinates);

    T setSize(Size size);

    T requestFocus();

    default T setSize(int width, int height) {
        return this.setSize(new Size(width, height));
    }

    T setPosition(Position position);

    default T setPosition(int left, int top) {
        return this.setPosition(new Position(left, top));
    }

    /**
     * Show or hide the widget.
     * @param visible True will set the widget visible, false will hide it.
     * @return This object for chaining.
     */
    T setVisible(boolean visible);

    /**
     * Widget left position.
     * @return the widget left position.
     */
    int getLeft();

    /**
     * Widget right position.
     * @return the widget right position.
     */
    int getRight();

    /**
     * Widget top position.
     * @return the widget top position.
     */
    int getTop();

    /**
     * Widget bottom position.
     * @return the widget bottom position.
     */
    int getBottom();

    default T addOnMouseOverListener(MouseOverListener l) {
        return (T)this;
    }
}
