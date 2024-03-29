/*
 * MIT License
 *
 * Copyright (c) 2019 Grégory Van den Borre
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package be.yildizgames.module.window.widget;

import be.yildizgames.module.color.Color;
import be.yildizgames.module.coordinates.ParentRelativePosition;

/**
 * @author Grégory Van den Borre
 */
public interface WindowPopup {

    WindowTextLine createTextLine();

    WindowPopup setTitle(String title);

    WindowPopup setBackground(Color color);

    WindowPopup setBackground(String file);

    WindowPopup setSize(int width, int height);

    WindowButton createButton();

    WindowButtonText createTextButton();

    WindowDropdown createDropdown();

    void close();

    WindowPopup centerOnScreen();

    WindowPopup setPosition(int left, int top);

    WindowInputBox createInputBox();

    WindowImage createImage(String image);

    WindowCheckBox createCheckBox();

    WindowPopup setPosition(ParentRelativePosition parentRelativePosition);

    WindowPopup setVisible(boolean visible);
}
