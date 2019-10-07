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

import java.io.Serializable;
import java.util.Random;

/**
 * Class representing RGBA color.
 * Immutable class.
 *
 * @author Grégory Van den Borre
 */
public final class Color implements Serializable {


    /**
     * Black constant.
     */
    public static final Color BLACK = Color.rgb(0, 0, 0);

    private static final Random RANDOM = new Random();

    /**
     * Max value for a color parameter(255).
     */
    static final int MAX_VALUE = 255;
    /**
     * White constant.
     */
    public static final Color WHITE = Color.rgb(Color.MAX_VALUE, Color.MAX_VALUE, Color.MAX_VALUE);
    /**
     * Red constant.
     */
    public static final Color RED = Color.rgb(Color.MAX_VALUE, 0, 0);
    /**
     * Green constant.
     */
    public static final Color GREEN = Color.rgb(0, Color.MAX_VALUE, 0);
    /**
     * Blue constant.
     */
    public static final Color BLUE = Color.rgb(0, 0, Color.MAX_VALUE);
    /**
     * Yellow constant.
     */
    public static final Color YELLOW = Color.rgb(Color.MAX_VALUE, Color.MAX_VALUE, 0);
    /**
     * Orange constant.
     */
    public static final Color ORANGE = Color.rgb(Color.MAX_VALUE, 70, 0);
    /**
     * Gray constant.
     */
    public static final Color GRAY = Color.rgba(127, 127, 127, Color.MAX_VALUE);
    /**
     * Min value for a color parameter(0).
     */
    static final int MIN_VALUE = 0;
    /***/
    private static final long serialVersionUID = -2169198600911019532L;
    /**
     * Red value, must be between MIN_VALUE and MAX_VALUE.
     */
    public final int redValue;

    /**
     * Green value, must be between MIN_VALUE and MAX_VALUE.
     */
    public final int greenValue;

    /**
     * Blue value, must be between MIN_VALUE and MAX_VALUE.
     */
    public final int blueValue;

    /**
     * Alpha value, must be between MIN_VALUE and MAX_VALUE.
     */
    public final int alphaValue;

    /**
     * Red value, must be between 0 and 1.
     */
    //FIXME export in a separate class to avoid computing when not required
    //Create an instance of the new class in the code using it(ogre, javafx,...)
    //The user of the color class must not know about this new class, it is internal
    public final float normalizedRedValue;

    /**
     * Green value, must be between 0 and 1.
     */
    public final float normalizedGreenValue;

    /**
     * Blue value, must be between 0 and 1.
     */
    public final float normalizedBlueValue;

    /**
     * Alpha value, must be between 0 and 1.
     */
    public final float normalizedAlphaValue;

    /**
     * Full constructor.
     *
     * @param redValue   Red value(must be between MIN_VALUE and MAX_VALUE).
     * @param greenValue Green value(must be between MIN_VALUE and MAX_VALUE).
     * @param blueValue  Blue value(must be between MIN_VALUE and MAX_VALUE).
     * @param alphaValue Alpha value (must be between MIN_VALUE and MAX_VALUE).
     */
    private Color(final int redValue, final int greenValue, final int blueValue, final int alphaValue) {
        super();
        this.redValue = Color.checkValue(redValue);
        this.greenValue = Color.checkValue(greenValue);
        this.blueValue = Color.checkValue(blueValue);
        this.alphaValue = Color.checkValue(alphaValue);
        this.normalizedRedValue = this.redValue / (float) Color.MAX_VALUE;
        this.normalizedBlueValue = this.blueValue / (float) Color.MAX_VALUE;
        this.normalizedGreenValue = this.greenValue / (float) Color.MAX_VALUE;
        this.normalizedAlphaValue = this.alphaValue / (float) Color.MAX_VALUE;
    }

    /**
     * Create a color instance for RGB values, alpha is set at 255.
     *
     * @param red   Red value(must be between 0 and 255).
     * @param green Green value(must be between 0 and 255).
     * @param blue  Blue value(must be between 0 and 255).
     * @return The created color.
     */
    public static Color rgb(final int red, final int green, final int blue) {
        return Color.rgba(red, green, blue, Color.MAX_VALUE);
    }

    /**
     * Create a color instance for RGB values, alpha is set at 255.
     *
     * @param rgb RGB values(must be between 0 and 255).
     * @return The created color.
     */
    public static Color rgb(final int rgb) {
        return Color.rgba(rgb, rgb, rgb, Color.MAX_VALUE);
    }

    /**
     * Create a color instance for RGBA values.
     *
     * @param red   Red value(must be between 0 and 255).
     * @param green Green value(must be between 0 and 255).
     * @param blue  Blue value(must be between 0 and 255).
     * @param alpha Alpha value (must be between 0 and 255).
     * @return The created color.
     */
    public static Color rgba(final int red, final int green, final int blue, final int alpha) {
        return new Color(red, green, blue, alpha);
    }

    /**
     * Check if the value is between MIN_VALUE and MAX_VALUE.
     *
     * @param value Value to check.
     * @return MIN_VALUE if value is <=MIN_VALUE, MAX_VALUE if value >=
     * MAX_VALUE or value if it is between MIN_VALUE and MAX_VALUE.
     */
    private static int checkValue(final int value) {
        if (value >= Color.MAX_VALUE) {
            return Color.MAX_VALUE;
        } else return Math.max(value, Color.MIN_VALUE);
    }

    public static Color random() {
        return Color.rgb(RANDOM.nextInt(MAX_VALUE), RANDOM.nextInt(MAX_VALUE), RANDOM.nextInt(MAX_VALUE));
    }

    /**
     * Create a copy of this color with a value added to RGB values, alpha is
     * not updated.
     *
     * @param value Value to add.
     * @return A new color with the same value as this one added to the given
     * value.
     */
    public Color add(final int value) {
        return Color.rgba(this.redValue + value, this.greenValue + value, this.blueValue + value, this.alphaValue);
    }

    public Color add(final int red, final int green, final int blue) {
        return Color.rgba(this.redValue + red, this.greenValue + green, this.blueValue + blue, this.alphaValue);
    }

    /**
     * Test equality between the RGBA values.
     *
     * @param obj Other object to test.
     * @return true if the 2 object have RGBA identical values.
     */
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Color)) {
            return false;
        }
        Color other = (Color) obj;
        return this.blueValue == other.blueValue && this.greenValue == other.greenValue && this.redValue == other.redValue && this.alphaValue == other.alphaValue;
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + this.blueValue;
        result = PRIME * result + this.greenValue;
        result = PRIME * result + this.redValue;
        result = PRIME * result + this.alphaValue;
        return result;
    }

    /**
     * @return red value + ',' + green value + ',' + blue value + ',' + alpha.
     */
    @Override
    public String toString() {
        return this.redValue + "," + this.greenValue + "," + this.blueValue + "," + this.alphaValue;
    }
}
