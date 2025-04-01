/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *  Copyright (c) 2022-2025 Grégory Van den Borre
 *  More infos available: https://engine.yildiz-games.be
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without limitation
 *  the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 *  permit persons to whom the Software is furnished to do so, subject to the following conditions: The above copyright
 *  notice and this permission notice shall be included in all copies or substantial portions of the  Software.
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 *  OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package be.yildizgames.module.window.widget.keyboard;

import be.yildizgames.module.window.widget.experimental.KeyboardLayoutKey;

import java.util.List;

/**
 * Represent the layout for a keyboard.
 * Provides the rows and keys for that layout.
 * Immutable
 * @author Grégory Van den Borre
 */
public interface KeyboardLayout {

    /**
     * This provides the number of rows on this keyboard.
     *
     * @return How many rows of keys are on this keyboard. (>=0)
     */
    int getNumberOfRows();

    /**
     * This provides the number of keys on a specific row on this keyboard.
     *
     * @param row Row number to use. (>=0 and < getNumberOfRows())
     * @return How many keys are on the given row on this keyboard. (>=0)
     */
    int getNumberOfKeyForRow(int row);

    /**
     * Retrieve the key position on a given row and key.
     *
     * @param row Row number to use. (>=0 and < getNumberOfRows())
     * @param key Key number to use. (>=0 and getNumberOfKeyForRow(int row))
     * @return The found key. (not null)
     */
    KeyboardLayoutKey getKey(int row, int key);

    /**
     * Provides all keys.
     *
     * @return The list of all keys. (not null)
     */
    List<KeyboardLayoutKey> getKeys();
}
