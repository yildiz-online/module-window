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

package be.yildizgames.module.window.widget.animation;

import java.time.Duration;

/**
 * @author Grégory Van den Borre
 */
public class AnimationBehavior {

    private double fromX;

    private double fromY;

    private double fromZ;

    private double byX;

    private double byY;

    private double byZ;

    private double toX;

    private double toY;

    private double toZ;

    private Duration duration = Duration.ZERO;

    public AnimationBehavior() {
        super();
    }

    public final AnimationBehavior setFrom(double from) {
        this.fromX = from;
        this.fromY = from;
        this.fromZ = from;
        return this;
    }

    public final AnimationBehavior setBy(double by) {
        this.byX = by;
        this.byY = by;
        this.byZ = by;
        return this;
    }

    public final AnimationBehavior setTo(double to) {
        this.toX = to;
        this.toY = to;
        this.toZ = to;
        return this;
    }

    public final double getFromX() {
        return fromX;
    }

    public final AnimationBehavior setFromX(double fromX) {
        this.fromX = fromX;
        return this;
    }

    public final double getFromY() {
        return fromY;
    }

    public final AnimationBehavior setFromY(double fromY) {
        this.fromY = fromY;
        return this;
    }

    public final double getFromZ() {
        return fromZ;
    }

    public final AnimationBehavior setFromZ(double fromZ) {
        this.fromZ = fromZ;
        return this;
    }

    public final double getByX() {
        return byX;
    }

    public final AnimationBehavior setByX(double byX) {
        this.byX = byX;
        return this;
    }

    public final double getByY() {
        return byY;
    }

    public final AnimationBehavior setByY(double byY) {
        this.byY = byY;
        return this;
    }

    public final double getByZ() {
        return byZ;
    }

    public final AnimationBehavior setByZ(double byZ) {
        this.byZ = byZ;
        return this;
    }

    public final double getToX() {
        return toX;
    }

    public final AnimationBehavior setToX(double toX) {
        this.toX = toX;
        return this;
    }

    public final double getToY() {
        return toY;
    }

    public final AnimationBehavior setToY(double toY) {
        this.toY = toY;
        return this;
    }

    public final double getToZ() {
        return toZ;
    }

    public final AnimationBehavior setToZ(double toZ) {
        this.toZ = toZ;
        return this;
    }

    public final Duration getDuration() {
        return duration;
    }

    public final AnimationBehavior setDuration(Duration duration) {
        this.duration = duration;
        return this;
    }
}
