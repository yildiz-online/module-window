/*
 * Copyright (C) Grégory Van den Borre - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Grégory Van den Borre <vandenborre.gregory@hotmail.com> 2019
 */
package be.yildizgames.module.coordinate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class PercentRelativeCoordinateTest {

    @Nested
    class Constructor {

        @Test
        void happyFlow() {
            PercentRelativeCoordinate coordinate = new PercentRelativeCoordinate(new Coordinates(100, 100, 100, 100));
            Assertions.assertNotNull(coordinate);
        }

        @Test
        void nullParameter() {
            Assertions.assertThrows(NullPointerException.class, () -> new PercentRelativeCoordinate(null));
        }
    }

    @Nested
    class GetCoordinate {

        @Test
        void happyFlow() {
            PercentRelativeCoordinate coordinate = new PercentRelativeCoordinate(new Coordinates(1920, 1080, 0, 0));
            BaseCoordinate result = coordinate.compute(10, 10, 20, 20);
            Assertions.assertEquals(192, result.width);
            Assertions.assertEquals(108, result.height);
            Assertions.assertEquals(384, result.left);
            Assertions.assertEquals(216, result.top);
        }

        @Test
        void happyFlowObject() {
            PercentRelativeCoordinate coordinate = new PercentRelativeCoordinate(new Coordinates(100, 200, 100, 100));
            BaseCoordinate result = coordinate.compute(new Coordinates(10, 10, 10, 10));
            Assertions.assertEquals(10, result.width);
            Assertions.assertEquals(20, result.height);
            Assertions.assertEquals(110, result.left);
            Assertions.assertEquals(120, result.top);
        }

    }

}
