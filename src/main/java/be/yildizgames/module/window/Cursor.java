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

package be.yildizgames.module.window;

import java.util.Objects;

/**
 * Cusror definition, contains the unique id, the image path, the x offset, if any, the y offset if any.
 * @author Grégory Van den Borre
 */
public class Cursor {

    /**
     * cursor unique id.
     */
    private final String id;

    /**
     * Path to the graphic asset.
     */
    private final String path;

    /**
     * X offset value, in pixels.
     */
    private final int x;

    /**
     * Y offset value, in pixels.
     */
    private final int y;

    /**
     * Build a new Cursor without any offset.
     *
     * @param id   Unique id.
     * @param path Path to the graphic asset.
     */
    public Cursor(final String id, final String path) {
        this(id, path, 0, 0);
    }

    /**
     * Build a new Cursor with offset.
     *
     * @param id      Unique id.
     * @param path    Path to the graphic asset.
     * @param offsetX Cursor position x offset, in pixels.
     * @param offsetY Cursor position y offset, in pixels.
     */
    public Cursor(final String id, final String path, final int offsetX, final int offsetY) {
        super();
        Objects.requireNonNull(id);
        Objects.requireNonNull(path);
        this.id = id;
        this.path = path;
        this.x = offsetX;
        this.y = offsetY;
    }

    public final String getId() {
        return id;
    }

    public final String getPath() {
        return path;
    }

    public final int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Cursor other = (Cursor) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
