/*
 Copyright (C) Grégory Van den Borre - All Rights Reserved
 Unauthorized copying of this file, via any medium is strictly prohibited
 Proprietary and confidential
 Written by Grégory Van den Borre <vandenborre.gregory@hotmail.fr> 2023
 */

package be.yildizgames.module.coordinates;

import be.yildizgames.module.window.screen.ScreenRatio;

class BlockSizeProvider {

    static BlockSize getBlockSize(Coordinates coordinates) {
        return switch (ScreenRatio.compute(coordinates.getWidth(), coordinates.getHeight())) {
            case RATIO_16_9 -> new BlockSize(Math.round(coordinates.getWidth() / 15f), Math.round(coordinates.getHeight() / 12f), 15, 12);
            case RATIO_21_9 -> new BlockSize(Math.round(coordinates.getWidth() / 20f), Math.round(coordinates.getHeight() / 12f), 20, 12);
            case RATIO_4_3 ->  new BlockSize(Math.round(coordinates.getWidth() / 11f),  Math.round(coordinates.getHeight() / 12f), 11, 12);
        };
    }
}
