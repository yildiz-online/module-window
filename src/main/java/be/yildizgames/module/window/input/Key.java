/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 * Copyright (c) 2018 Grégory Van den Borre
 *
 * More infos available: https://www.yildiz-games.be
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons
 * to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE  SOFTWARE.
 */

package be.yildizgames.module.window.input;

import be.yildizgames.module.window.dummy.DummyKeyValueProvider;

import java.util.Objects;
import java.util.ServiceLoader;

public class Key {

    private static final KeyValue values = Key.getKeyValue();

    public static final Key ENTER = values.enter();

    public static final Key CTRL = values.ctrl();

    public static final Key DELETE = values.delete();

    public static final Key ESC = values.esc();

    public static final Key TAB = values.tab();

    public static final Key UP = values.up();

    public static final Key DOWN = values.down();

    public static final Key LEFT = values.left();

    public static final Key RIGHT = values.right();

    private final int value;

    private Key(int value) {
        super();
        this.value = value;
    }

    public static Key valueOf(int value) {
        return new Key(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Key key = (Key) o;
        return value == key.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    private static KeyValue getKeyValue() {
        ServiceLoader<KeyValueProvider> provider = ServiceLoader.load(KeyValueProvider.class);
        return provider.findFirst().orElseGet(DummyKeyValueProvider::new).getKeyValue();
    }
}
