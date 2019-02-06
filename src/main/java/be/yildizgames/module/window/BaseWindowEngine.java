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

import be.yildizgames.module.window.dummy.DummyWindowEngineProvider;
import be.yildizgames.module.window.input.WindowInputListener;

import java.util.ServiceLoader;

/**
 * Complete window engine, in addition of the window engine exposed API, provide some functionalities to be used internally by associated engines..
 *
 * @author Grégory Van den Borre
 */
public interface BaseWindowEngine extends WindowEngine {

    /**
     * Update the window wrapping the game viewports.
     */
    void updateWindow();

    /**
     * Delete the resources used when loading the engine.
     */
    void deleteLoadingResources();

    /**
     * @return The handle of this window.
     */
    WindowHandle getHandle();

    /**
     * Add an input listener to retrieve input event from this window.
     *
     * @param listener Listener to add.
     */
    void registerInput(WindowInputListener listener);

    static BaseWindowEngine getEngine() {
        ServiceLoader<WindowEngineProvider> provider = ServiceLoader.load(WindowEngineProvider.class);
        return provider.findFirst().orElseGet(DummyWindowEngineProvider::new).getEngine();
    }
}
