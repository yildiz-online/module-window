
/*
 This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 Copyright (c) 2025 Grégory Van den Borre
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

/**
 * @author Grégory Van den Borre
 */
class EmailAzertyKeyboardLayout extends BaseEmailKeyboardLayout {

    EmailAzertyKeyboardLayout() {
        super(new KeyboardLayoutKey[][]{
                {
                        EXCLAMATION, INTERROGATION, PLUS, MINUS, STAR, SLASH, EQUALS, AMP, DOLLAR
                },
                {
                        _1, _2, _3, _4, _5, _6, _7, _8, _9, _0
                },
                {
                        A, Z, E, R, T, Y, U, I, O, P
                },
                {
                        Q, S, D, F, G, H, J, K, L, M
                },
                {
                        W, X, C, V, B, N
                },
                {
                    AT, SPACE, PERIOD
                }
        });
    }
}
