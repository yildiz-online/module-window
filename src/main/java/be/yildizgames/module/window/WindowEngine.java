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
package be.yildizgames.module.window;

import be.yildizgames.module.window.widget.WindowShellFactory;

/**
 * Window engine API.
 *
 * @author Grégory Van den Borre
 */
public interface WindowEngine {


    /**
     * Create a new cursor.
     *
     * @param cursor Contains the data to build the cursor.
     */
    Cursor createCursor(Cursor cursor);

    /**
     * Set the title for the main window.
     *
     * @param title Title to print.
     */
    void setWindowTitle(String title);

    /**
     * Set a new cursor in the game window.
     *
     * @param cursor Cursor to use.
     */
    void setCursor(Cursor cursor);

    /**
     * Display the mouse.
     */
    void showCursor();

    /**
     * Hide the mouse.
     */
    void hideCursor();

    /**
     * @return The screen size, never null.
     */
    ScreenSize getScreenSize();

    /**
     * Set the window icon.
     *
     * @param file Icon file.
     */
    void setWindowIcon(String file);

    /**
     * Provide the factory to build window shell and widgets.
     * @return The factory, never null.
     */
    WindowShellFactory getWindowShellFactory();

    /**
     * Provide the manager to handle threads in window.
     * @return The manager, never null.
     */
    WindowThreadManager getThreadManager();

    void registerView(RegisteredView view);
}
