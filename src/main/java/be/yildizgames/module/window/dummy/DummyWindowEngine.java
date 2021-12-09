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
import be.yildizgames.module.window.util.image.ImageResizeChecker;
import be.yildizgames.module.window.RegisteredView;
import be.yildizgames.module.window.ScreenSize;
import be.yildizgames.module.window.WindowHandle;
import be.yildizgames.module.window.WindowThreadManager;
import be.yildizgames.module.window.input.WindowInputListener;

/**
 * @author Grégory Van den Borre
 */
public class DummyWindowEngine implements BaseWindowEngine {

    public DummyWindowEngine() {
        super();
        System.Logger logger = System.getLogger(DummyWindowEngine.class.getName());
        logger.log(System.Logger.Level.INFO, "Window Engine Dummy implementation initializing...");
        logger.log(System.Logger.Level.INFO, "Window Engine Dummy implementation initialized.");
    }

    @Override
    public final Cursor createCursor(Cursor cursor) {
        return cursor;
    }

    @Override
    public final DummyWindowEngine setWindowTitle(String title) {
        return this;
    }

    @Override
    public final DummyWindowEngine setCursor(Cursor cursor) {
        return this;
    }

    @Override
    public final DummyWindowEngine update() {
        return this;
    }

    @Override
    public BaseWindowEngine setLoadingImage(String image) {
        return this;
    }

    @Override
    public final DummyWindowEngine showCursor() {
        return this;
    }

    @Override
    public final DummyWindowEngine hideCursor() {
        return this;
    }

    @Override
    public final ScreenSize getScreenSize() {
        return new ScreenSize(1,1);
    }

    @Override
    public final DummyWindowEngine setWindowIcon(String file) {
        return this;
    }

    @Override
    public final WindowThreadManager getThreadManager() {
        return null;
    }

    @Override
    public ImageResizeChecker createImageResizeChecker(int width, int height) {
        return null;
    }

    @Override
    public final DummyWindowEngine registerView(RegisteredView view) {
        return this;
    }

    @Override
    public final DummyWindowEngine deleteLoadingResources() {
        return this;
    }

    @Override
    public final WindowHandle getHandle() {
        return new WindowHandle(0L);
    }

    @Override
    public final DummyWindowEngine registerInput(WindowInputListener listener) {
        return this;
    }

}
