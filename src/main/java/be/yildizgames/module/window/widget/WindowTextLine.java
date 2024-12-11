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

import be.yildizgames.module.color.Color;

/**
 * A native widget text line.
 *
 * @author Grégory Van den Borre
 */
public interface WindowTextLine extends WindowWidget<WindowTextLine> {

    /**
     * Update the text in the text line.
     *
     * @param text New text to set [not null].
     * @return This object for chaining [not null].
     */
    WindowTextLine setText(String text);

    /**
     * Set the text to be wrapped.
     *
     * @return This object for chaining [not null].
     */
    default WindowTextLine wrapText() {
        return this;
    }

    /**
     * Update the color of the text in the text line.
     *
     * @param color New color to set [not null].
     * @return This object for chaining [not null].
     */
    WindowTextLine setColor(Color color);

    /**
     * Provide the textline content.
     *
     * @return The text line content [not null].
     */
    String getText();

    /**
     * set or unset the text being underlined.
     *
     * @param active True will set the text underlined, false will unset it.
     * @return This object for chaining [not null].
     */
    WindowTextLine setUnderline(boolean active);

    /**
     * Align the text in the text line.
     *
     * @param alignment Alignment to use [not null].
     * @return This object for chaining [not null].
     */
    default WindowTextLine alignText(TextAlignment alignment) {
        return this;
    }

    /**
     * Update the font in the text line.
     *
     * @param font New font to set [not null].
     * @return This object for chaining [not null].
     */
    WindowTextLine setFont(WindowFont font);

    /**
     * Update the font in the text line.
     *
     * @param path   New font to set path [not null].
     * @param height New font to set height [&gt;0].
     * @return This object for chaining [not null].
     */
    WindowTextLine setFont(String path, int height);

    public enum TextAlignment {

        LEFT, CENTER, RIGHT

    }
}
