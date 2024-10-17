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

import be.yildizgames.module.color.Color;
import be.yildizgames.module.coordinates.Coordinates;
import be.yildizgames.module.window.audio.AudioEffect;
import be.yildizgames.module.window.input.KeyboardListener;
import be.yildizgames.module.window.screen.ScreenSize;
import be.yildizgames.module.window.widget.experimental.VirtualKeyboard;

import java.nio.file.Path;

/**
 * Native window shell.
 *
 * @author Grégory Van den Borre
 */
public interface WindowShell extends WindowWidget<WindowShell> {

    WindowState addState(StateName name);

    void selectState(StateName name);

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
     * Set the window background color for the active state.
     * @param color Color to use.
     * @return This object for chaining.
     */
    WindowShell setBackground(Color color);

    /**
     * Set the window background color for a given state.
     * @param color Color to use.
     * @param state State name.
     * @return This object for chaining.
     */
    WindowShell setBackground(Color color, StateName state);

    /**
     * Set the window background image.
     * @param file Background image file.
     * @return This object for chaining.
     */
    WindowShell setBackground(String file);

    WindowShell setBackground(String file, StateName state);

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

    WindowShape createRectangle();

    WindowShape createRectangle(StateName state);

    WindowToggle createToggle();

    WindowNotificationPane createNotificationPane(StateName state);

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

    WindowTextLine createTextLine(StateName state);

    /**
     * Create a new button widget.
     * @return The created button.
     */
    WindowButton createButton();

    WindowButton createButton(String background, String hover);

    WindowButton createButton(StateName state);

    /**
     * Create a new image widget.
     * @return The created image.
     */
    WindowImage createImage(String image);

    WindowImage createImage(String image, StateName state);

    WindowProgressBar createProgressBar();

    WindowTreeRoot createTreeRoot(int width, int height, WindowTreeElement... elements);

    WindowProgressBar createProgressBar(StateName state);

    WindowDropdown createDropdown();

    WindowDropdown createDropdown(StateName state);

    WindowButtonText createTextButton();

    WindowButtonText createTextButton(StateName state);

    WindowInputBox createInputBox();

    WindowMenuBar createMenuBar(WindowMenuBarElementDefinition... elements);

    WindowModalFile createOpenFileBox();

    WindowCheckBox createCheckBox(StateName state);

    WindowFont createFont(String path, int height);

    WindowToggle createToggle(StateName state);

    WindowNotification createNotification();

    VirtualKeyboard createVirtualKeyboard(KeyboardListener listener, StateName state);

    WindowNotificationPane createNotificationPane();

    WindowCanvas createCanvas();

    WindowInputBox createInputBox(StateName state);

    WindowCheckBox createCheckBox();

    WindowShell addKeyListener(KeyboardListener listener);

    WindowShell toBack();

    WindowShell toFront();

    WindowShell minimize(OnMinimize... minimizes);

    WindowShell maximize();

    WindowMediaPlayer createMediaPlayer();

    WindowMediaPlayer createMediaPlayer(StateName state);

    VirtualKeyboard createVirtualKeyboard(KeyboardListener listener);

    DirectoryChooser createDirectoryChooser();

    void exit();

    Coordinates getCoordinates();

    WindowAlert createAlert();

    WindowShell showCursor();

    WindowShell hideCursor();

    WindowFileChooser createFileChooser();

    AudioEffect createAudioEffect(String file);
}