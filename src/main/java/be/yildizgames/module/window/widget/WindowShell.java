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
import be.yildizgames.module.coordinate.Coordinates;
import be.yildizgames.module.window.ScreenSize;

/**
 * Native window shell.
 * @author Grégory Van den Borre
 */
public interface WindowShell {

    /**
     * The the window title.
     * @param title Title to set.
     * @return This object for chaining.
     */
    WindowShell setTitle(String title);

    /**
     * The the window size and position.
     * @param coordinates Window size and position to set.
     * @return This object for chaining.
     */
    WindowShell setCoordinates(Coordinates coordinates);

    /**
     * Set the window icon.
     * @param file Icon file path.
     * @return This object for chaining.
     */
    WindowShell setIcon(String file);

    WindowShell setBackground(Color color);

    WindowShell setBackground(String file);

    WindowShell setSize(int width, int height);

    WindowShell setVisible(boolean visible);

    WindowShell setFullScreen();

    ScreenSize getScreenSize();

    void update();

    void open();

    void close();

    void checkForEvent();

    WindowModal createMessageBox();

    WindowModal createMessageButtonBox();

    WindowTextArea createTextArea();

    WindowTextLine createTextLine();

    WindowButton createButton();

    WindowButton createButton(String background, String hover);

    WindowImage createImage(String image);

    WindowProgressBar createProgressBar();

    WindowTreeRoot createTreeRoot(int height, int width, WindowTreeElement... elements);

    WindowDropdown createDropdown();

    WindowTextButton createTextButton();
}
