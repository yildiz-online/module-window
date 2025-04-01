/*
 *
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2019 Grégory Van den Borre
 *
 * More infos available: https://engine.yildiz-games.be
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without
 * limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 * OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 *
 */

package be.yildizgames.module.window.widget;

import be.yildizgames.module.coordinates.Coordinates;
import be.yildizgames.module.coordinates.CoordinatesProvider;
import be.yildizgames.module.coordinates.FullCoordinates;
import be.yildizgames.module.coordinates.Position;
import be.yildizgames.module.coordinates.Size;
import be.yildizgames.module.window.ViewableElement;
import be.yildizgames.module.window.input.MouseOverListener;
import be.yildizgames.module.window.widget.animation.AnimationBehavior;

/**
 * Base element with common behavior for the different widgets.
 *
 * @param <T> Widget true type.
 * @author Grégory Van den Borre
 */
public interface WindowWidget<T extends WindowWidget<T>> extends CoordinatesProvider, ViewableElement<T> {

    /**
     * Apply a css class to the widget.
     *
     * @param cssClass Name of the css class [not null].
     * @return This object for chaining [not null].
     */
    T setCssStyleClass(String cssClass);

    /**
     * Make this widget blinking indefinitely.
     *
     * @param duration Blinking rate in seconds [>0].
     * @return This object for chaining [not null].
     */
    T playBlinkAnimation(double duration);

    /**
     * Stop the widget blinking.
     *
     * @return This object for chaining [not null].
     */
    T stopBlinkAnimation();

    /**
     * Prepare the scale animation for the widget with the necessary scale configuration.
     *
     * @param animation Scale behavior [not null].
     * @return This object for chaining [not null].
     */
    T setScaleAnimation(AnimationBehavior animation);

    /**
     * Scale the widget following the configuration provided by setScaleAnimation.
     *
     * @return This object for chaining [not null].
     */
    T playScaleAnimation();

    /**
     * Stop the scale animation.
     *
     * @return This object for chaining [not null].
     */
    T stopScaleAnimation();

    /**
     * Prepare the translation animation for the widget with the necessary translation configuration.
     *
     * @param animation Translation behavior [not null].
     * @return This object for chaining [not null].
     */
    T setTranslationAnimation(AnimationBehavior animation);

    /**
     * Translate the widget following the configuration provided by setTranslationAnimation.
     *
     * @return This object for chaining [not null].
     */
    T playTranslationAnimation();

    /**
     * Stop the translation animation.
     *
     * @return This object for chaining [not null].
     */
    T stopTranslationAnimation();

    /**
     * Set the widget size and position.
     *
     * @param coordinates New widget size and position [not null].
     * @return This object for chaining [not null].
     */
    T setCoordinates(Coordinates coordinates);

    /**
     * Set the widget size and position.
     *
     * @param width  New widget width [>=0].
     * @param height New widget height [>=0].
     * @param left   New widget left position [>=0].
     * @param top    New widget top position [>=0].
     * @return This object for chaining [not null].
     */
    default T setCoordinates(int width, int height, int left, int top) {
        return setCoordinates(FullCoordinates.full(width, height, left, top));
    }

    /**
     * Set the widget opacity.
     *
     * @param opacity New opacity, 0 is transparent 1 is opaque [>=0] [&le;1].
     * @return This object for chaining [not null].
     */
    T setOpacity(float opacity);

    /**
     * Set the widget size.
     *
     * @param size New size [>=0].
     * @return This object for chaining [not null].
     */
    T setSize(Size size);

    /**
     * Request the focus for this widget.
     *
     * @return This object for chaining [not null].
     */
    T requestFocus();

    /**
     * Set the widget size.
     *
     * @param width  New width [>=0].
     * @param height New height [>=0].
     * @return This object for chaining [not null].
     */
    default T setSize(int width, int height) {
        return this.setSize(FullCoordinates.size(width, height));
    }

    /**
     * Set the widget size.
     *
     * @param size New size [>=0].
     * @return This object for chaining [not null].
     */
    default T setSize(int size) {
        return this.setSize(FullCoordinates.size(size, size));
    }

    /**
     * Provide the widget height.
     *
     * @return The widget height [>=0].
     */
    int getHeight();

    /**
     * Provide the widget width.
     *
     * @return The widget width [>=0].
     */
    int getWidth();

    default Size getDimensions() {
        return FullCoordinates.size(getWidth(), getHeight());
    }

    /**
     * Set the widget position.
     *
     * @param position New position [not null].
     * @return This object for chaining [not null].
     */
    T setPosition(Position position);

    /**
     * Set the widget top position.
     *
     * @param top New top position [>=0].
     * @return This object for chaining [not null].
     */
    default T setTop(int top) {
        return this.setPosition(FullCoordinates.position(getLeft(), top));
    }

    /**
     * Set the widget left position.
     *
     * @param left New left position [>=0].
     * @return This object for chaining [not null].
     */
    default T setLeft(int left) {
        return this.setPosition(FullCoordinates.position(left, getTop()));
    }

    /**
     * Set the widget position.
     *
     * @param left New left position [>=0].
     * @param top  New top position [>=0].
     * @return This object for chaining [not null].
     */
    default T setPosition(int left, int top) {
        return this.setPosition(FullCoordinates.position(left, top));
    }

    /**
     * Set the widget position.
     *
     * @param position New position [>=0].
     * @return This object for chaining [not null].
     */
    default T setPosition(int position) {
        return this.setPosition(FullCoordinates.position(position, position));
    }

    /**
     * Show or hide the widget.
     *
     * @param visible True will set the widget visible, false will hide it.
     * @return This object for chaining [not null].
     */
    T setVisible(boolean visible);

    /**
     * Widget left position.
     *
     * @return the widget left position [>= 0].
     */
    int getLeft();

    /**
     * Widget right position.
     *
     * @return the widget right position [>= 0].
     */
    int getRight();

    /**
     * Widget top position.
     *
     * @return the widget top position [>= 0].
     */
    int getTop();

    /**
     * Widget bottom position.
     *
     * @return the widget bottom position [>= 0].
     */
    int getBottom();

    /**
     * Add a mouse over listener on this widget.
     *
     * @param listener Listener triggered the the mouse is over the widget [not null].
     * @return This object for chaining [not null].
     */
    default T addOnMouseOverListener(MouseOverListener listener) {
        return (T) this;
    }

    /**
     * Fire an event from this widget.
     *
     * @param event Event to fire [not null].
     * @return This object for chaining [not null].
     */
    default T fireEvent(WidgetEvent event) {
        return (T) this;
    }

    /**
     * Provide the focus state.
     *
     * @return True if the widget is focused, false otherwise.
     */
    default boolean isFocused() {
        return false;
    }

    /**
     * Put the widget in 'above' the others.
     *
     * @return This object for chaining [not null].
     */
    T toFront();

    /**
     * Put the widget in 'under' the others.
     *
     * @return This object for chaining [not null].
     */
    T toBack();
}
