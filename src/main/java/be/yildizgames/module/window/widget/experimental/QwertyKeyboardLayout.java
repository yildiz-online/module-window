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

/**
 * @author Grégory Van den Borre
 */
class QwertyKeyboardLayout extends BaseKeyboardLayout {

    QwertyKeyboardLayout() {
        super(new KeyboardLayoutKey[][]{
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
                        Q, W, E, R, T, Y, U, I, O, P,
                        new KeyboardLayoutKey("[", "{", Key.OPEN_BRACKET),
                        new KeyboardLayoutKey("]", "}", Key.CLOSE_BRACKET),
                        new KeyboardLayoutKey("\\", "|", Key.BACK_SLASH)
                },
                {
                        A, S, D, F, G, H, J, K, L,
                        new KeyboardLayoutKey(";", ":", Key.SEMICOLON),
                        new KeyboardLayoutKey("'", "\"", Key.QUOTE)
                },
                {
                        Z, X, C, V, B, N, M,
                        new KeyboardLayoutKey(",", "<", Key.COMMA),
                        new KeyboardLayoutKey(".", ">", Key.PERIOD),
                        new KeyboardLayoutKey("/", "?", Key.SLASH)
                },
                {
                        SPACE
                }
        });
    }
}
