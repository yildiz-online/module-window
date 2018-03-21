/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2018 Grégory Van den Borre
 *
 *  More infos available: https://www.yildiz-games.be
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without
 *  limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 *  of the Software, and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 */

package be.yildizgames.module.coordinate;

/**
 * Wrapper class for a relative value.
 *
 * @author Grégory Van den Borre
 */
public final class Relative {

    /**
     * Constant for 1 / 2.
     */
    public static final Relative HALF = new Relative(0.5f);

    /**
     * Constant for 1 / 3.
     */
    public static final Relative THIRD = new Relative(0.3333333f);

    /**
     * Constant for 1 / 4.
     */
    public static final Relative QUARTER = new Relative(0.25f);

    /**
     * Constant for 1 / 5.
     */
    public static final Relative FIFTH = new Relative(0.2f);

    /**
     * Constant for 1 / 8.
     */
    public static final Relative HEIGHTH = new Relative(0.125f);

    /**
     * Constant for 1 / 10.
     */
    public static final Relative TENTH = new Relative(0.1f);

    /**
     * Relative value.
     */
    public final float value;

    public Relative(float value) {
        this.value = value;
    }
}
