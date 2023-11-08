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

package be.yildizgames.module.window.widget;

import be.yildizgames.module.coordinates.Coordinates;
import be.yildizgames.module.coordinates.FullCoordinates;
import be.yildizgames.module.coordinates.Position;
import be.yildizgames.module.coordinates.Size;
import be.yildizgames.module.window.ViewableElement;

import java.nio.file.Path;

/**
 * @author Grégory Van den Borre
 */
public interface WindowMediaPlayer extends ViewableElement<WindowMediaPlayer> {

    WindowMediaPlayer setMedia(String url);


    WindowMediaPlayer setSize(Size size);

    WindowMediaPlayer setPosition(Position position);

    WindowMediaPlayer setCoordinates(Coordinates coordinates);

    /**
     * Widget left position.
     * @return the widget left position.
     */
    int getLeft();

    /**
     * Widget right position.
     * @return the widget right position.
     */
    int getRight();

    /**
     * Widget top position.
     * @return the widget top position.
     */
    int getTop();

    /**
     * Widget bottom position.
     * @return the widget bottom position.
     */
    int getBottom();


    default WindowMediaPlayer setTop(int top) {
        return this.setPosition(FullCoordinates.position(getLeft(), top));
    }

    default WindowMediaPlayer setLeft(int left) {
        return this.setPosition(FullCoordinates.position(left, getTop()));
    }

    WindowMediaPlayer setMedia(Path path);

    WindowMediaPlayer play();

    WindowMediaPlayer stop();
}
