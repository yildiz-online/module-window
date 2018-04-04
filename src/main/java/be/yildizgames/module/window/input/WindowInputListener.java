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
 * Implementation of this listener are meant to receive the events from the underlying window element.
 *
 * @author Grégory Van den Borre
 */
public interface WindowInputListener {

    /**
     * Dispatch key from the keyboard to all listeners in the current Widget.
     *
     * @param character Key pressed.
     */
    default void keyboardKeyPressed(char character) {
    }

    /**
     * Keyboard enter key has been pressed.
     */
    default void keyboardEnterKeyPressed() {
    }

    /**
     * Dispatch special key from the keyboard to all listeners in the current Widget.
     *
     * @param key Key pressed.
     */
    default void specialKeyPressed(SpecialKey key) {
    }

    /**
     * Keyboard numeric pad number has been pressed.
     *
     * @param number Number pressed.
     */
    default void keyboardNumberPressed(int number) {
    }

    /**
     * Keyboard delete key has been pressed.
     */
    default void keyboardDeleteKeyPressed() {
    }

    /**
     * Keyboard arrow key has been pressed.
     *
     * @param key Enum value to get witch arrow has been pressed.
     */
    default void keyboardArrowPressed(ArrowKey key) {
    }

    /**
     * A keyboard key has been released.
     *
     * @param keyCode Code of the key released.
     */
    default void keyReleased(int keyCode) {
    }

    /**
     * Dispatch a left button release from the mouse to all listeners in the current Widget.
     *
     * @param position Current mouse position.
     */
    default void mouseLeftReleased(MousePosition position) {
    }

    /**
     * Dispatch a right button release from the mouse to all listeners in the current Widget.
     *
     * @param position Current mouse position.
     */
    default void mouseRightReleased(MousePosition position) {
    }

    /**
     * Dispatch a left click from the mouse to all listeners in the current Widget. Check the mouse position to set the current focus view.
     *
     * @param position Current mouse position.
     */
    default void mouseLeftClick(MousePosition position) {
    }

    /**
     * Dispatch a right click from the mouse to all listeners in the current Widget.
     *
     * @param position Current mouse position.
     */
    default void mouseRightClick(MousePosition position) {
    }

    /**
     * Dispatch a left double click from the mouse to all listeners in the current Widget.
     *
     * @param position Current mouse position
     */
    default void mouseDoubleClick(MousePosition position) {
    }

    /**
     * Dispatch a drag from the mouse with the right button to all listeners in the current Widget.
     *
     * @param position Current mouse position.
     * @param delta    Delta with the former mouse position.
     */
    default void mouseDragRight(MousePosition position, MousePosition delta) {
    }

    /**
     * Dispatch a drag from the mouse with the left button to all listeners in the current Widget.
     *
     * @param position Current mouse position.
     * @param delta    Delta with the former mouse position.
     */
    default void mouseDragLeft(MousePosition position, MousePosition delta) {
    }

    /**
     * Dispatch a drag from the mouse with the middle button to all listeners in the current Widget.
     *
     * @param position Current mouse position.
     * @param delta    Delta with the former mouse position.
     */
    default void mouseDragWheel(MousePosition position, MousePosition delta) {
    }

    /**
     * Dispatch a move from the mouse to all listeners in the current Widget. Check the mouse position to set the current view.
     *
     * @param cursorPosition Current mouse position.
     */
    default void mouseMove(MousePosition cursorPosition) {
    }

    /**
     * Dispatch a roll from the mouse wheel to all listeners in the current Widget. Check the mouse position to set the current view.
     *
     * @param cursorPosition Current mouse position.
     * @param count          Number of wheel roll.
     */
    default void mouseWheel(MousePosition cursorPosition, int count) {
    }

}
