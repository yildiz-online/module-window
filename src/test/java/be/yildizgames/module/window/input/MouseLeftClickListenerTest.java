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

package be.yildizgames.module.window.input;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Grégory Van den Borre
 */
public class MouseLeftClickListenerTest {

    @Test
    public void testClick() {
        DummyListener l = new DummyListener();
        Assertions.assertFalse(l.clicked);
        l.click();
        Assertions.assertTrue(l.clicked);
    }

    @Test
    public void testClickAt() {
        DummyListener l = new DummyListener();
        l.clickAt(MouseMoveMockFactory.get(10, 10));
        Assertions.assertEquals(10, l.p.getX());
        Assertions.assertEquals(10, l.p.getY());
    }

    private static class DummyListener implements MouseLeftClickListener {

        private MousePosition p;

        private boolean clicked;

        @Override
        public void click() {
            this.clicked = true;
        }

        @Override
        public void clickAt(MousePosition position) {
            this.clicked = true;
            this.p = position;
        }
    }
}
