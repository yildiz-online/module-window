/*
 * MIT License
 *
 * Copyright (c) 2019 Grégory Van den Borre
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package be.yildizgames.module.coordinates;

import be.yildizgames.module.window.widget.ImageMetadata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PercentRelativeCoordinateTest {

    @Nested
    class Constructor {

        @Test
        void happyFlow() {
            PercentRelativeCoordinate coordinate = new PercentRelativeCoordinate(FullCoordinates.full(100, 100, 100, 100));
            Assertions.assertNotNull(coordinate);
        }

        @Test
        void nullParameter() {
            Assertions.assertThrows(NullPointerException.class, () -> new PercentRelativeCoordinate((Coordinates)null));
        }
    }

    @Nested
    class GetCoordinate {

        @Test
        void happyFlow() {
            PercentRelativeCoordinate coordinate = new PercentRelativeCoordinate(FullCoordinates.full(1920, 1080, 0, 0));
            Coordinates result = coordinate.compute(10, 10, 20, 20);
            Assertions.assertEquals(192, result.getWidth());
            Assertions.assertEquals(108, result.getHeight());
            Assertions.assertEquals(384, result.getLeft());
            Assertions.assertEquals(216, result.getTop());
        }

        @Test
        void happyFlowObject() {
            PercentRelativeCoordinate coordinate = new PercentRelativeCoordinate(FullCoordinates.full(100, 200, 100, 100));
            Coordinates result = coordinate.compute(FullCoordinates.full(10, 10, 10, 10));
            Assertions.assertEquals(10, result.getWidth());
            Assertions.assertEquals(20, result.getHeight());
            Assertions.assertEquals(110, result.getLeft());
            Assertions.assertEquals(120, result.getTop());
        }

    }

    @Nested
    class WithRatio {

        @Test
        void happyFlow() {
            PercentRelativeCoordinate coordinate = new PercentRelativeCoordinate(FullCoordinates.full(1200, 1000, 100, 100));
            Coordinates result = coordinate.computeWithRatio(10,10,10,10, new ImageMetadata(512, 256));
            Assertions.assertEquals(120, result.getWidth());
            Assertions.assertEquals(60, result.getHeight());
            Assertions.assertEquals(220, result.getLeft());
            Assertions.assertEquals(200, result.getTop());
        }

        @Test
        void heighLargerThanWidth() {
            PercentRelativeCoordinate coordinate = new PercentRelativeCoordinate(FullCoordinates.full(1200, 1000, 100, 100));
            Coordinates result = coordinate.computeWithRatio(10,10,10,10, new ImageMetadata(256, 512));
            Assertions.assertEquals(50, result.getWidth());
            Assertions.assertEquals(100, result.getHeight());
            Assertions.assertEquals(220, result.getLeft());
            Assertions.assertEquals(200, result.getTop());
        }
    }

}
