/*
 * MIT License
 *
 * Copyright (c) 2019 Grégory Van den Borre
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package be.yildizgames.module.window.widget.experimental;

import be.yildizgames.module.color.Color;
import be.yildizgames.module.coordinates.Position;
import be.yildizgames.module.coordinates.Size;
import be.yildizgames.module.window.input.Key;
import be.yildizgames.module.window.input.KeyboardListener;
import be.yildizgames.module.window.widget.WindowWidget;

/**
 * @author Grégory Van den Borre
 */
public interface VirtualKeyboard extends WindowWidget<VirtualKeyboard> {

    VirtualKeyboard setSize(Key key, int width, int height);

    VirtualKeyboard addListener(KeyboardListener listener);

    VirtualKeyboard clearListeners();

    VirtualKeyboard setPosition(Position position);

    Size getSize();

    int getLeft();

    int getTop();

    VirtualKeyboard setSize(Size size);

    VirtualKeyboard setImage(Key key, String image);

    VirtualKeyboard setColor(Key key, Color color);

    int getWidth();

    VirtualKeyboard setBackground(Color color);

    VirtualKeyboard press(Key key);

    VirtualKeyboard setBackground(String image);

    KeyboardLayout getLayout();

    VirtualKeyboard toFront();

    VirtualKeyboard shift(boolean enabled);

    VirtualKeyboard capsLock(boolean enabled);
}
