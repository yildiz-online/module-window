package be.yildizgames.module.window.widget.experimental;

import be.yildizgames.module.window.input.Key;

/**
 * @author Grégory Van den Borre
 */
abstract class BaseSimpleKeyboardLayout extends BaseKeyboardLayout {

    protected static final KeyboardLayoutKey _1 = new KeyboardLayoutKey("1", "1", Key.DIGIT1);
    protected static final KeyboardLayoutKey _2 = new KeyboardLayoutKey("2", "2", Key.DIGIT2);
    protected static final KeyboardLayoutKey _3 = new KeyboardLayoutKey("3", "3", Key.DIGIT3);
    protected static final KeyboardLayoutKey _4 = new KeyboardLayoutKey("4", "4", Key.DIGIT4);
    protected static final KeyboardLayoutKey _5 = new KeyboardLayoutKey("5", "5", Key.DIGIT5);
    protected static final KeyboardLayoutKey _6 = new KeyboardLayoutKey("6", "6", Key.DIGIT6);
    protected static final KeyboardLayoutKey _7 = new KeyboardLayoutKey("7", "7", Key.DIGIT7);
    protected static final KeyboardLayoutKey _8 = new KeyboardLayoutKey("8", "8", Key.DIGIT8);
    protected static final KeyboardLayoutKey _9 = new KeyboardLayoutKey("9", "9", Key.DIGIT9);
    protected static final KeyboardLayoutKey _0 = new KeyboardLayoutKey("0", "0", Key.DIGIT0);

    protected BaseSimpleKeyboardLayout(KeyboardLayoutKey[][] keys) {
        super(keys);
    }
}
