/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2019 Grégory Van den Borre
 *
 *  More infos available: https://engine.yildiz-games.be
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

package be.yildizgames.module.color;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Grégory Van den Borre
 */
class ColorTest {

    @Test
    final void testAdd() {
        Color base = Color.rgba(10, 20, 30, 40);
        Color base2 = base.add(10);
        assertEquals(Color.rgba(20, 30, 40, 40), base2);
    }

    @Test
    final void testAddAll() {
        Color base = Color.rgba(10, 20, 30, 40);
        Color base2 = base.add(1, 2, 3);
        assertEquals(Color.rgba(11, 22, 33, 40), base2);
    }

    /***/
    @Test
    final void testEqualsObject() {
        assertEquals(Color.BLACK, Color.BLACK);
        assertEquals(Color.BLACK, Color.rgb(0, 0, 0));
        assertNotEquals(null, Color.BLACK);
        assertNotEquals("aString", Color.BLACK);
        assertNotEquals(Color.BLACK, Color.rgb(1, 0, 0));
        assertNotEquals(Color.BLACK, Color.rgb(0, 1, 0));
        assertNotEquals(Color.BLACK, Color.rgb(0, 0, 1));
        assertEquals(Color.BLACK, Color.BLACK);
        assertEquals(Color.BLACK, Color.rgba(0, 0, 0, 255));
        assertNotEquals(Color.BLACK, Color.rgba(0, 0, 0, 0));
    }


    /***/
    @Test
    final void testHashCode() {
        assertEquals(Color.BLACK.hashCode(), Color.rgb(0, 0, 0).hashCode());
    }

    /***/
    @Test
    final void testToString() {
        Color c = Color.BLACK;
        assertEquals("0,0,0," + Color.MAX_VALUE, c.toString());
    }

    /***/
    @Test
    final void testYzColorIntIntInt() {
        final int value = 5;
        final int tooHighValue = 1000;
        final int tooLowValue = -5;
        Color ac = Color.rgb(value);
        assertEquals(value, ac.redValue);
        assertEquals(value, ac.blueValue);
        assertEquals(value, ac.greenValue);
        assertEquals(Color.MAX_VALUE, ac.alphaValue);

        Color c = Color.rgb(value, value + 2, value - 2);
        assertEquals(value, c.redValue);
        assertEquals(value - 2, c.blueValue);
        assertEquals(value + 2, c.greenValue);
        c = Color.rgb(tooHighValue, tooHighValue, tooHighValue);
        assertEquals(Color.MAX_VALUE, c.redValue);
        assertEquals(Color.MAX_VALUE, c.blueValue);
        assertEquals(Color.MAX_VALUE, c.greenValue);
        c = Color.rgb(tooLowValue, tooLowValue, tooLowValue);
        assertEquals(Color.MIN_VALUE, c.redValue);
        assertEquals(Color.MIN_VALUE, c.blueValue);
        assertEquals(Color.MIN_VALUE, c.greenValue);
    }

}
