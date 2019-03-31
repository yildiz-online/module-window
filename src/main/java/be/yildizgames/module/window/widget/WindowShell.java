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
import be.yildizgames.module.window.ScreenSize;

/**
 * Native window shell.
 * @author Grégory Van den Borre
 */
public interface WindowShell extends BaseWindowWidget<WindowShell>{

    /**
     * The the window title.
     * @param title Title to set.
     * @return This object for chaining.
     */
    WindowShell setTitle(String title);

    /**
     * Set the window icon.
     * @param file Icon file path.
     * @return This object for chaining.
     */
    WindowShell setIcon(String file);

    /**
     * Set the window background color.
     * @param color Color to use.
     * @return This object for chaining.
     */
    WindowShell setBackground(Color color);

    /**
     * Set the window background image.
     * @param file Background image file.
     * @return This object for chaining.
     */
    WindowShell setBackground(String file);

    /**
     * Set the window size.
     * @param width Window width.
     * @param height Window height.
     * @return This object for chaining.
     */
    WindowShell setSize(int width, int height);

    WindowShell setFullScreen();

    /**
     * Provide the window size.
     * @return The window size.
     */
    ScreenSize getScreenSize();

    /**
     * Open the window.
     */
    void open();

    /**
     * Close the window.
     */
    void close();

    /**
     * Check for an event and sleep if none.
     */
    void update();

    /**
     * Check for an event without sleeping.
     */
    void checkForEvent();

    /**
     * Create a new message modal window.
     * @return The created modal window.
     */
    WindowModal createMessageBox();

    /**
     * Create a new message modal window with a button for confirmation.
     * @return The created modal window.
     */
    WindowModal createMessageButtonBox();

    /**
     * Create a new text area widget.
     * @return The created text area.
     */
    WindowTextArea createTextArea();

    /**
     * Create a new text line widget.
     * @return The created text line.
     */
    WindowTextLine createTextLine();

    /**
     * Create a new button widget.
     * @return The created button.
     */
    WindowButton createButton();

    WindowButton createButton(String background, String hover);

    /**
     * Create a new image widget.
     * @return The created image.
     */
    WindowImage createImage(String image);

    WindowProgressBar createProgressBar();

    WindowTreeRoot createTreeRoot(int width, int height, WindowTreeElement... elements);

    WindowDropdown createDropdown();

    WindowButtonText createTextButton();

    WindowInputBox createInputBox();

    WindowShell createChildWindow();

    WindowMenuBar createMenuBar(WindowMenuBarElement... elements);

    WindowModalFile createOpenFileBox();
}
