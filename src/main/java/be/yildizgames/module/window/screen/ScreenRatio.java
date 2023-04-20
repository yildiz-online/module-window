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

package be.yildizgames.module.window.screen;

/**
 * @author Grégory Van den Borre
 */
public enum ScreenRatio {

    RATIO_16_9, RATIO_21_9, RATIO_4_3;

    public static ScreenRatio compute(final ScreenSize screenSize) {
        return compute(screenSize.width, screenSize.height);
    }

    public static ScreenRatio compute(final float width, final float height) {
        var ratio = width / height;
        if (ratio < 1.8f && ratio > 1.7f) {
            return RATIO_16_9;
        } else if (ratio < 2.4f && ratio > 2.3f) {
            return RATIO_21_9;
        } else if (ratio < 1.4f && ratio > 1.3f) {
            return RATIO_4_3;
        }
        return RATIO_16_9;
    }
}
