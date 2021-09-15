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
package be.yildizgames.module.coordinates;

import be.yildizgames.module.window.widget.ImageMetadata;

import java.util.Objects;

/**
 * @author Grégory Van den Borre
 */
public class PercentRelativeCoordinate implements RelativeCoordinate {

    private final Coordinates root;

    public PercentRelativeCoordinate(Coordinates root) {
        super();
        this.root = Objects.requireNonNull(root);
    }

    public PercentRelativeCoordinate(CoordinatesProvider root) {
        super();
        this.root = root.getCoordinates();
    }

    @Override
    public final Coordinates compute(int percentWidth, int percentHeight, int percentLeft, int percentTop) {
        var w = root.getWidth();
        var h = root.getHeight();
        if(w == 0) {
            w = 1;
        }
        if(h == 0) {
            h = 1;
        }
        float width = w * 0.01f * percentWidth;
        float height = h * 0.01f * percentHeight;
        float top =  root.getTop() + h * 0.01f * percentTop;
        float left = root.getLeft() + w * 0.01f * percentLeft;
        return FullCoordinates.full(Math.round(width), Math.round(height),  Math.round(left), Math.round(top));
    }

    @Override
    public final Position computePosition(int percentLeft, int percentTop) {
        var w = root.getWidth();
        var h = root.getHeight();
        if(w == 0) {
            w = 1;
        }
        if(h == 0) {
            h = 1;
        }
        float top =  root.getTop() + h * 0.01f * percentTop;
        float left = root.getLeft() + w * 0.01f * percentLeft;
        return FullCoordinates.position(Math.round(left), Math.round(top));
    }

    @Override
    public final Coordinates compute(Coordinates percents) {
        return this.compute(percents.getWidth(), percents.getHeight(), percents.getLeft(), percents.getTop());
    }

    @Override
    public final Coordinates compute(CoordinatesProvider provider) {
        return compute(provider.getCoordinates());
    }

    @Override
    public final Size computeSizeWithRatio(int percent, ImageMetadata imageMetadata) {
        return computeWithRatio(percent, percent, 0, 0, imageMetadata);
    }

    @Override
    public final Size computeSizeWithRatio(int percentWidth, int percentHeight, ImageMetadata imageMetadata) {
        return computeWithRatio(percentWidth, percentHeight, 0, 0, imageMetadata);
    }

    @Override
    public final Coordinates computeWithRatio(int percentWidth, int percentHeight, int percentLeft, int percentTop, ImageMetadata imageMetadata) {
        var w = root.getWidth();
        var h = root.getHeight();
        if(w == 0) {
            w = 1;
        }
        if(h == 0) {
            h = 1;
        }

        float width = w * 0.01f * percentWidth;
        float height = width / (float)imageMetadata.getRatio();

        float maxHeight = h * 0.01f * percentHeight;
        if(height > maxHeight) {
            height = root.getHeight() * 0.01f * percentHeight;
            width = height * (float)imageMetadata.getRatio();
        }

        float top =  root.getTop() + h * 0.01f * percentTop;
        float left = root.getLeft() + w * 0.01f * percentLeft;
        return FullCoordinates.full(Math.round(width), Math.round(height),  Math.round(left), Math.round(top));
    }

    @Override
    public final Coordinates computeWithRatio(Coordinates percent, ImageMetadata imageMetadata) {
        return computeWithRatio(percent.getWidth(), percent.getHeight(), percent.getLeft(), percent.getTop(), imageMetadata);
    }

    @Override
    public final Coordinates computeWithRatio(CoordinatesProvider percent, ImageMetadata imageMetadata) {
        return computeWithRatio(percent.getCoordinates(), imageMetadata);
    }
}
