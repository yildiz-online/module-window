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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Grégory Van den Borre
 */
class BaseCoordinateTest {

    @Test
    void test() {
        assertEquals(0, BaseCoordinate.ZERO.width);
        assertEquals(0, BaseCoordinate.ZERO.height);
        assertEquals(0, BaseCoordinate.ZERO.left);
        assertEquals(0, BaseCoordinate.ZERO.top);
    }

    @Test
    void testConstructor() {
        int top = 5;
        int left = 10;
        int width = 12;
        int height = 9;
        BaseCoordinate bc = new BaseCoordinate(width, height, left, top);
        assertEquals(top, bc.top);
        assertEquals(left, bc.left);
        assertEquals(width, bc.width);
        assertEquals(height, bc.height);
    }

    @Test
    void testContains() {
        int top = 5;
        int left = 10;
        int width = 12;
        int height = 9;
        BaseCoordinate bc = new BaseCoordinate(width, height, left, top);
        BaseCoordinate bc2 = new BaseCoordinate(10, 7, 11, 6);
        assertTrue(bc.contains(bc2));
        bc2 = new BaseCoordinate(width, height, left, top);
        assertTrue(bc.contains(bc2));
        bc2 = new BaseCoordinate(width + 1, height, left, top);
        assertFalse(bc.contains(bc2));
        bc2 = new BaseCoordinate(width, height + 1, left, top);
        assertFalse(bc.contains(bc2));
    }

    @Test
    void testEquals() {
        int top = 5;
        int left = 10;
        int width = 12;
        int height = 9;
        BaseCoordinate bc = new BaseCoordinate(width, height, left, top);
        BaseCoordinate bc2 = new BaseCoordinate(width, height, left, top);
        assertEquals(bc, bc2);
        assertFalse(bc.equals(null));
        assertFalse(bc.equals(new BaseCoordinate(width + 1, height, left, top)));
        assertFalse(bc.equals(new BaseCoordinate(width, height + 1, left, top)));
        assertFalse(bc.equals(new BaseCoordinate(width, height, left + 1, top)));
        assertFalse(bc.equals(new BaseCoordinate(width, height, left, top + 1)));
        assertFalse(bc.equals("abc"));
    }

    @Test
    void testToString() {
        int top = 5;
        int left = 10;
        int width = 12;
        int height = 9;
        BaseCoordinate bc = new BaseCoordinate(width, height, left, top);
        assertEquals("Width:" + 12 + ", height:" + 9 + ", left:" + 10 + ", top:" + 5, bc.toString());
    }

}
