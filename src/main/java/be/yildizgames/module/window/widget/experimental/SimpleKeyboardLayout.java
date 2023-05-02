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

import be.yildizgames.module.window.input.Key;
import be.yildizgames.module.window.widget.experimental.KeyboardLayout;
import be.yildizgames.module.window.widget.experimental.KeyboardLayoutKey;

/**
 * @author Grégory Van den Borre
 */
public abstract class SimpleKeyboardLayout implements KeyboardLayout {

    protected static KeyboardLayoutKey _1 = new KeyboardLayoutKey("1", "1",Key.DIGIT1);
    protected static KeyboardLayoutKey _2 = new KeyboardLayoutKey("2", "2", Key.DIGIT2);
    protected static KeyboardLayoutKey _3 = new KeyboardLayoutKey("3", "3", Key.DIGIT3);
    protected static KeyboardLayoutKey _4 = new KeyboardLayoutKey("4", "4", Key.DIGIT4);
    protected static KeyboardLayoutKey _5 = new KeyboardLayoutKey("5", "5", Key.DIGIT5);
    protected static KeyboardLayoutKey _6 = new KeyboardLayoutKey("6", "6", Key.DIGIT6);
    protected static KeyboardLayoutKey _7 = new KeyboardLayoutKey("7", "7", Key.DIGIT7);
    protected static KeyboardLayoutKey _8 = new KeyboardLayoutKey("8", "8", Key.DIGIT8);
    protected static KeyboardLayoutKey _9 = new KeyboardLayoutKey("9", "9", Key.DIGIT9);
    protected static KeyboardLayoutKey _0 = new KeyboardLayoutKey("0", "0", Key.DIGIT0);
    protected static KeyboardLayoutKey Q = new KeyboardLayoutKey("q", "Q", Key.Q);
    protected static KeyboardLayoutKey W = new KeyboardLayoutKey("w", "W", Key.W);
    protected static KeyboardLayoutKey E = new KeyboardLayoutKey("e", "E", Key.E);
    protected static KeyboardLayoutKey R = new KeyboardLayoutKey("r", "R", Key.R);
    protected static KeyboardLayoutKey T = new KeyboardLayoutKey("t", "T", Key.T);
    protected static KeyboardLayoutKey Y = new KeyboardLayoutKey("y", "Y", Key.Y);
    protected static KeyboardLayoutKey U = new KeyboardLayoutKey("u", "U", Key.U);
    protected static KeyboardLayoutKey I = new KeyboardLayoutKey("i", "I", Key.I);
    protected static KeyboardLayoutKey O = new KeyboardLayoutKey("o", "O", Key.O);
    protected static KeyboardLayoutKey P = new KeyboardLayoutKey("p", "P", Key.P);
    protected static KeyboardLayoutKey A = new KeyboardLayoutKey("a", "A", Key.A);
    protected static KeyboardLayoutKey S = new KeyboardLayoutKey("s", "S", Key.S);
    protected static KeyboardLayoutKey D = new KeyboardLayoutKey("d", "D", Key.D);
    protected static KeyboardLayoutKey F = new KeyboardLayoutKey("f", "F", Key.F);
    protected static KeyboardLayoutKey G = new KeyboardLayoutKey("g", "G", Key.G);
    protected static KeyboardLayoutKey H = new KeyboardLayoutKey("h", "H", Key.H);
    protected static KeyboardLayoutKey J = new KeyboardLayoutKey("j", "J", Key.J);
    protected static KeyboardLayoutKey K = new KeyboardLayoutKey("k", "K", Key.K);
    protected static KeyboardLayoutKey L = new KeyboardLayoutKey("l", "L", Key.L);
    protected static KeyboardLayoutKey Z = new KeyboardLayoutKey("z", "Z", Key.Z);
    protected static KeyboardLayoutKey X = new KeyboardLayoutKey("x", "X", Key.X);
    protected static KeyboardLayoutKey C = new KeyboardLayoutKey("c", "C", Key.C);
    protected static KeyboardLayoutKey V = new KeyboardLayoutKey("v", "V", Key.V);
    protected static KeyboardLayoutKey B = new KeyboardLayoutKey("b", "B", Key.B);
    protected static KeyboardLayoutKey N = new KeyboardLayoutKey("n", "N", Key.N);
    protected static KeyboardLayoutKey M = new KeyboardLayoutKey("m", "M", Key.M);
    protected static KeyboardLayoutKey SPACE = new KeyboardLayoutKey(" ", " ", Key.SPACE);
}
