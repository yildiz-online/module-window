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

package be.yildizgames.module.window.dummy;

import be.yildizgames.module.window.BaseWindowEngine;
import be.yildizgames.module.window.Cursor;
import be.yildizgames.module.window.ScreenSize;
import be.yildizgames.module.window.WindowHandle;
import be.yildizgames.module.window.WindowThreadManager;
import be.yildizgames.module.window.input.WindowInputListener;
import be.yildizgames.module.window.widget.WindowShellFactory;

/**
 * @author Grégory Van den Borre
 */
public class DummyWindowEngine implements BaseWindowEngine {

    private final System.Logger logger = System.getLogger(DummyWindowEngine.class.getName());

    public DummyWindowEngine() {
        super();
        this.logger.log(System.Logger.Level.INFO, "Window Engine Dummy implementation initializing...");
        this.logger.log(System.Logger.Level.INFO, "Window Engine Dummy implementation initialized.");
    }


    @Override
    public Cursor createCursor(Cursor cursor) {
        return cursor;
    }

    @Override
    public void setWindowTitle(String title) {
        // does nothing.
    }

    @Override
    public void setCursor(Cursor cursor) {
        // does nothing.
    }

    @Override
    public void update() {
        // does nothing.
    }

    @Override
    public void showCursor() {
        // does nothing.
    }

    @Override
    public void hideCursor() {
        // does nothing.
    }

    @Override
    public ScreenSize getScreenSize() {
        return new ScreenSize(1,1);
    }

    @Override
    public void setWindowIcon(String file) {
        // does nothing.
    }

    @Override
    public WindowShellFactory getWindowShellFactory() {
        return null;
    }

    @Override
    public WindowThreadManager getThreadManager() {
        return null;
    }

    @Override
    public void deleteLoadingResources() {
        // does nothing.
    }

    @Override
    public WindowHandle getHandle() {
        return new WindowHandle(0L);
    }

    @Override
    public void registerInput(WindowInputListener listener) {
        // does nothing.
    }

}
