package be.yildizgames.module.window.widget.experimental;

import be.yildizgames.module.window.widget.keyboard.KeyboardLayout;

import java.util.List;

/**
 * @author Grégory Van den Borre
 */
public enum Layouts implements KeyboardLayout {

    SIMPLE_QWERTY(new SimpleQwertyKeyboardLayout()),
    SIMPLE_AZERTY(new SimpleAzertyKeyboardLayout()),
    EMAIL_QWERTY(new EmailQwertyKeyboardLayout());

    private final KeyboardLayout layout;

    Layouts(KeyboardLayout layout) {
        this.layout = layout;
    }

    @Override
    public final int getNumberOfRows() {
        return this.layout.getNumberOfRows();
    }

    @Override
    public final int getNumberOfKeyForRow(final int row) {
        return this.layout.getNumberOfKeyForRow(row);
    }

    @Override
    public final KeyboardLayoutKey getKey(final int row, final int key) {
        return this.layout.getKey(row, key);
    }

    @Override
    public final List<KeyboardLayoutKey> getKeys() {
        return this.layout.getKeys();
    }
}
