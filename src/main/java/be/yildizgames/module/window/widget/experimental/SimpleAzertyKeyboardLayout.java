/*
 This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 Copyright (c) 2023 Grégory Van den Borre
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

package be.yildizgames.module.window.widget.experimental;

import java.util.Arrays;
import java.util.List;

/**
 * @author Grégory Van den Borre
 */
public class SimpleAzertyKeyboardLayout extends SimpleKeyboardLayout {

    private final KeyboardLayoutKey[][] keys;

    public SimpleAzertyKeyboardLayout() {
        this.keys = new KeyboardLayoutKey[][]{
                {
                        _1, _2, _3, _4, _5, _6, _7, _8, _9, _0
                },
                {
                        Q, W, E, R, T, Y, U, I, O, P
                },
                {
                        A, S, D, F, G, H, J, K, L
                },
                {
                        Z, X, C, V, B, N, M
                },
                {
                    SPACE
                }
        };
    }

    public final int getNumberOfRows() {
        return 5;
    }

    public int getNumberOfKeyForRow(int row) {
        return this.keys[row].length;
    }

    public KeyboardLayoutKey getKey(int column, int key) {
        return this.keys[column][key];
    }

    public List<KeyboardLayoutKey> getKeys() {
        return Arrays.stream(this.keys).flatMap(Arrays::stream).toList();
    }
}
