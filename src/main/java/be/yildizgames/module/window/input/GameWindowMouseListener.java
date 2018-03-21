/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2018 Grégory Van den Borre
 *
 *  More infos available: https://www.yildiz-games.be
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

/**
 * Class for the mouse management. All event are catch here from SWT and then sent to the observer.
 *
 * @author Grégory Van den Borre
 */
public class GameWindowMouseListener {

    /**
     * Last cursor position.
     */
    private final MousePosition cursorPosition = new MousePosition();

    /**
     * This point is used to compute the difference between the last camera rotation.
     */
    private final MousePosition delta = new MousePosition();

    /**
     * Event dispatcher.
     */
    private final WindowInputListener dispatcher;

    /**
     * <code>true</code> if the right mouse button is pressed.
     */
    private boolean rightMouse;

    /**
     * <code>true</code> if the left mouse button is pressed.
     */
    private boolean leftMouse;

    /**
     * <code>true</code> if the wheel button is pressed.
     */
    private boolean wheelButton;

    /**
     * Full constructor.
     *
     * @param dispatcher Input listener
     */
    protected GameWindowMouseListener(final WindowInputListener dispatcher) {
        super();
        this.dispatcher = dispatcher;
    }

    protected final void mouseLeftPressed() {
        this.dispatcher.mouseLeftClick(this.cursorPosition);
        this.leftMouse = true;
    }

    protected final void mouseRightPressed() {
        this.dispatcher.mouseRightClick(this.cursorPosition);
        this.rightMouse = true;
    }

    protected final void mouseWheelPressed() {
        this.wheelButton = true;
    }

    protected final void mouseLeftReleased() {
        this.dispatcher.mouseLeftReleased(this.cursorPosition);
        this.leftMouse = false;
        this.delta.setValues(0, 0);
    }

    protected final void mouseRightReleased() {
        this.dispatcher.mouseRightReleased(this.cursorPosition);
        this.rightMouse = false;
        this.delta.setValues(0, 0);
    }

    protected final void mouseWheelReleased() {
        this.wheelButton = false;
        this.delta.setValues(0, 0);
    }

    protected final void mouseLeftDouble() {
        this.dispatcher.mouseDoubleClick(this.cursorPosition);
    }

    protected final void mouseMove(int x, int y) {
        this.delta.setX(this.cursorPosition.getX() - x);
        this.delta.setY(this.cursorPosition.getY() - y);
        this.cursorPosition.setValues(x, y);
        if (this.rightMouse) {
            this.dispatcher.mouseDragRight(this.cursorPosition, this.delta);
        } else if (this.leftMouse) {
            this.dispatcher.mouseDragLeft(this.cursorPosition, this.delta);
        } else if (this.wheelButton) {
            this.dispatcher.mouseDragWheel(this.cursorPosition, this.delta);
        } else {
            this.dispatcher.mouseMove(this.cursorPosition);
        }
    }

    protected final void mouseScrolled(final int count) {
        this.dispatcher.mouseWheel(this.cursorPosition, count);
    }
}
