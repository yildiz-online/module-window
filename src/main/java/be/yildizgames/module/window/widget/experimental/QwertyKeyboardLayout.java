/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2022 Grégory Van den Borre
 *
 * More infos available: https://engine.yildiz-games.be
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the
 * following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 */

package be.yildizgames.module.window.widget.experimental;


import be.yildizgames.module.window.input.Key;

import java.util.Arrays;
import java.util.List;

/**
 * @author Grégory Van den Borre
 */
public class QwertyKeyboardLayout implements KeyboardLayout {

    private final KeyboardLayoutKey[][] keys = new KeyboardLayoutKey[][]{
            {
                    new KeyboardLayoutKey("`", "~", Key.BACK_QUOTE),
                    new KeyboardLayoutKey("1", "!", Key.DIGIT1),
                    new KeyboardLayoutKey("2", "@", Key.DIGIT2),
                    new KeyboardLayoutKey("3", "#", Key.DIGIT3),
                    new KeyboardLayoutKey("4", "$", Key.DIGIT4),
                    new KeyboardLayoutKey("5", "%", Key.DIGIT5),
                    new KeyboardLayoutKey("6", "^", Key.DIGIT6),
                    new KeyboardLayoutKey("7", "&", Key.DIGIT7),
                    new KeyboardLayoutKey("8", "*", Key.DIGIT8),
                    new KeyboardLayoutKey("9", "(", Key.DIGIT9),
                    new KeyboardLayoutKey("0", ")", Key.DIGIT0),
                    new KeyboardLayoutKey("-", "_", Key.SUBTRACT),
                    new KeyboardLayoutKey("=", "+", Key.EQUALS)
            },
            {
                    new KeyboardLayoutKey("q", "Q", Key.Q),
                    new KeyboardLayoutKey("w", "W", Key.W),
                    new KeyboardLayoutKey("e", "E", Key.E),
                    new KeyboardLayoutKey("r", "R", Key.R),
                    new KeyboardLayoutKey("t", "T", Key.T),
                    new KeyboardLayoutKey("y", "Y", Key.Y),
                    new KeyboardLayoutKey("u", "U", Key.U),
                    new KeyboardLayoutKey("i", "I", Key.I),
                    new KeyboardLayoutKey("o", "O", Key.O),
                    new KeyboardLayoutKey("p", "P", Key.P),
                    new KeyboardLayoutKey("[", "{", Key.OPEN_BRACKET),
                    new KeyboardLayoutKey("]", "}", Key.CLOSE_BRACKET),
                    new KeyboardLayoutKey("\\", "|", Key.BACK_SLASH)
            },
            {
                    new KeyboardLayoutKey("a", "A", Key.A),
                    new KeyboardLayoutKey("s", "S", Key.S),
                    new KeyboardLayoutKey("d", "D", Key.D),
                    new KeyboardLayoutKey("f", "F", Key.F),
                    new KeyboardLayoutKey("g", "G", Key.G),
                    new KeyboardLayoutKey("h", "H", Key.H),
                    new KeyboardLayoutKey("j", "J", Key.J),
                    new KeyboardLayoutKey("k", "K", Key.K),
                    new KeyboardLayoutKey("l", "L", Key.L),
                    new KeyboardLayoutKey(";", ":", Key.SEMICOLON),
                    new KeyboardLayoutKey("'", "\"", Key.QUOTE)
            },
            {
                    new KeyboardLayoutKey("z", "Z", Key.Z),
                    new KeyboardLayoutKey("x", "X", Key.X),
                    new KeyboardLayoutKey("c", "C", Key.C),
                    new KeyboardLayoutKey("v", "V", Key.V),
                    new KeyboardLayoutKey("b", "B", Key.B),
                    new KeyboardLayoutKey("n", "N", Key.N),
                    new KeyboardLayoutKey("m", "M", Key.M),
                    new KeyboardLayoutKey(",", "<", Key.COMMA),
                    new KeyboardLayoutKey(".", ">", Key.PERIOD),
                    new KeyboardLayoutKey("/", "?", Key.SLASH)
            },
            {
                    new KeyboardLayoutKey(" ", " ", Key.SPACE)
            }
    };

    public QwertyKeyboardLayout() {
        super();
    }

    @Override
    public final int getNumberOfRows() {
        return 5;
    }

    @Override
    public int getNumberOfKeyForRow(int row) {
        return this.keys[row].length;
    }

    @Override
    public KeyboardLayoutKey getKey(int column, int key) {
        return this.keys[column][key];
    }

    @Override
    public List<KeyboardLayoutKey> getKeys() {
        return Arrays.stream(this.keys)
                .flatMap(Arrays::stream)
                .toList();
    }
}
