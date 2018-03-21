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

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Grégory Van den Borre
 */
class SizeTest {

    @Test
    void test() {
        Size s = new Size(15, 20);
        assertEquals(15, s.width);
        assertEquals(20, s.height);
        assertEquals(0, s.left);
        assertEquals(0, s.top);
        Size s2 = new Size(s);
        assertEquals(s, s2);
        BaseCoordinate bc = new Position(5, 10);
        Size s3 = new Size(bc);
        assertEquals(s3, BaseCoordinate.ZERO);
        s = new Size(10);
        assertEquals(new BaseCoordinate(10, 10, 0, 0), s);
    }

    @Test
    void testNegative() {
        assertThrows(AssertionError.class, () -> new Size(-1));
    }

    @Test
    void testNegativeHeight() {
        assertThrows(AssertionError.class, () -> new Size(10, -1));
    }

    @Test
    void testNegativeWidth() {
        assertThrows(AssertionError.class, () -> new Size(-1, 10));
    }

}
