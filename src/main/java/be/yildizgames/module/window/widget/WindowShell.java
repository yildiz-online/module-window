/*
 This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 Copyright (c) 2019-2023 Grégory Van den Borre
 More infos available: https://engine.yildiz-games.be
 Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright
 notice and this permission notice shall be included in all copies or substantial portions of the  Software.
 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package be.yildizgames.module.window.widget;

import be.yildizgames.module.coordinates.Coordinates;
import be.yildizgames.module.coordinates.Position;
import be.yildizgames.module.coordinates.Size;
import be.yildizgames.module.window.audio.AudioEffect;
import be.yildizgames.module.window.input.KeyboardListener;
import be.yildizgames.module.window.screen.ScreenSize;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Native window shell.
 *
 * @author Grégory Van den Borre
 */
public interface WindowShell {

    WindowState createState();

    WindowState createState(Path template) throws IOException;

    WindowState createState(Path template, Properties properties) throws IOException;

    WindowShell setVisible(boolean visible);

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

    WindowShell setFullScreen();

    /**
     * Provide the window size.
     * @return The window size.
     */
    ScreenSize getSize();

    /**
     * Provide the monitor size.
     * @return The monitor size.
     */
    ScreenSize getMonitorSize();

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

    WindowShell setCss(Path cssFile);

    /**
     * Check for an event without sleeping.
     */
    void checkForEvent();

    WindowFont createFont(String path, int height);

    WindowNotification createNotification();

    WindowShell setSize(Size size);

    WindowShell setPosition(Position position);

    WindowShell addKeyListener(KeyboardListener listener);

    WindowShell toBack();

    WindowShell toFront();

    WindowShell minimize(OnMinimize... minimizes);

    WindowShell maximize();

    WindowShell hide();

    DirectoryChooser createDirectoryChooser();

    void exit();

    Coordinates getCoordinates();

    WindowAlert createAlert();

    WindowShell showCursor();

    WindowShell hideCursor();

    WindowFileChooser createFileChooser();

    AudioEffect createAudioEffect(String file);
}
