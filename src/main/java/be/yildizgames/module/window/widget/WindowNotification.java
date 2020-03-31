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

import java.time.Duration;

/**
 * A notification to display in the window, the visual will depend on the implementation.
 * Different types of notification are possible to display informative, warning or error notification.
 *
 * @author Grégory Van den Borre
 */
public interface WindowNotification {

    /**
     * Display a standard notification.
     */
    void show();

    /**
     * Display an error notification.
     */
    void showError();

    /**
     * Display a warning notification.
     */
    void showWarning();

    /**
     * Display a informative notification.
     */
    void showInfo();

    /**
     * Hide the notification after a given time.
     * @param duration Duration of the notification display, null is not allowed.
     * @return This object, never null.
     */
    WindowNotification hideAfter(Duration duration);

    /**
     * Set the notification title.
     * @param title Notification title, null is not allowed.
     * @return This object, never null.
     */
    WindowNotification setTitle(String title);

    /**
     * Set the notification text.
     * @param text Notification text, null is not allowed.
     * @return This object, never null.
     */
    WindowNotification setText(String text);

    default WindowNotification setData(WindowNotificationData data) {
        this.setTitle(data.title);
        this.setText(data.body);
        return this;
    }
}
