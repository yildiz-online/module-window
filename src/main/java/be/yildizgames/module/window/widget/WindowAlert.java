/*
 * MIT License
 *
 * Copyright (c) 2021 Grégory Van den Borre
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package be.yildizgames.module.window.widget;

/**
 * @author Grégory Van den Borre
 */
public interface WindowAlert {

    WindowAlert setHeaderText(String header);

    WindowAlert setContentText(String content);

    WindowAlert setTitle(String title);

    WindowAlert open(OnClickAlertButtonListener listener);

    WindowAlert close();

    enum AlertType {

        INFO, CONFIRM, WARNING, ERROR, NONE

    }

    WindowAlert setType(AlertType type);

    enum AlertButtonType {
        APPLY, CANCEL, CLOSE, NO, FINISH, NEXT, PREVIOUS, YES, OK
    }

    interface OnClickAlertButtonListener {

        void onClick(AlertButtonType buttonType);

    }
}
