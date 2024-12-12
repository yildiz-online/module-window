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

    /**
     * Sets the starting position for all axes to the same value.
     *
     * @param from Starting position value for all axes
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setFrom(double from) {
        this.fromX = from;
        this.fromY = from;
        this.fromZ = from;
        return this;
    }

    /**
     * Sets the relative movement value for all axes.
     *
     * @param by Movement value for all axes
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setBy(double by) {
        this.byX = by;
        this.byY = by;
        this.byZ = by;
        return this;
    }

    /**
     * Sets the destination position for all axes to the same value.
     *
     * @param to Destination position value for all axes
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setTo(double to) {
        this.toX = to;
        this.toY = to;
        this.toZ = to;
        return this;
    }

    /**
     * Gets the starting X position.
     *
     * @return The X axis starting position
     */
    public final double getFromX() {
        return fromX;
    }

    /**
     * Sets the starting X position.
     *
     * @param fromX Starting position for X axis
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setFromX(double fromX) {
        this.fromX = fromX;
        return this;
    }

    /**
     * Gets the starting Y position.
     *
     * @return The Y axis starting position
     */
    public final double getFromY() {
        return fromY;
    }

    /**
     * Sets the starting Y position.
     *
     * @param fromY Starting position for Y axis
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setFromY(double fromY) {
        this.fromY = fromY;
        return this;
    }

    /**
     * Gets the starting Z position.
     *
     * @return The Z axis starting position
     */
    public final double getFromZ() {
        return fromZ;
    }

    /**
     * Sets the starting Z position.
     *
     * @param fromZ Starting position for Z axis
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setFromZ(double fromZ) {
        this.fromZ = fromZ;
        return this;
    }

    /**
     * Gets the relative X movement value.
     *
     * @return The X axis movement value
     */
    public final double getByX() {
        return byX;
    }

    /**
     * Sets the relative X movement value.
     *
     * @param byX Movement value for X axis
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setByX(double byX) {
        this.byX = byX;
        return this;
    }

    /**
     * Gets the relative Y movement value.
     *
     * @return The Y axis movement value
     */
    public final double getByY() {
        return byY;
    }

    /**
     * Sets the relative Y movement value.
     *
     * @param byY Movement value for Y axis
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setByY(double byY) {
        this.byY = byY;
        return this;
    }

    /**
     * Gets the relative Z movement value.
     *
     * @return The Z axis movement value
     */
    public final double getByZ() {
        return byZ;
    }

    /**
     * Sets the relative Z movement value.
     *
     * @param byZ Movement value for Z axis
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setByZ(double byZ) {
        this.byZ = byZ;
        return this;
    }

    /**
     * Gets the destination X position.
     *
     * @return The X axis destination position
     */
    public final double getToX() {
        return toX;
    }

    /**
     * Sets the destination X position.
     *
     * @param toX Destination position for X axis
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setToX(double toX) {
        this.toX = toX;
        return this;
    }

    /**
     * Gets the destination Y position.
     *
     * @return The Y axis destination position
     */
    public final double getToY() {
        return toY;
    }

    /**
     * Sets the destination Y position.
     *
     * @param toY Destination position for Y axis
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setToY(double toY) {
        this.toY = toY;
        return this;
    }

    /**
     * Gets the destination Z position.
     *
     * @return The Z axis destination position
     */
    public final double getToZ() {
        return toZ;
    }

    /**
     * Sets the destination Z position.
     *
     * @param toZ Destination position for Z axis
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setToZ(double toZ) {
        this.toZ = toZ;
        return this;
    }

    /**
     * Gets the animation duration.
     *
     * @return The animation duration [not null]
     */
    public final Duration getDuration() {
        return duration;
    }

    /**
     * Sets the animation duration.
     *
     * @param duration Duration of the animation [not null]
     * @return This object for chaining [not null]
     */
    public final AnimationBehavior setDuration(Duration duration) {
        this.duration = duration;
        return this;
    }


}
