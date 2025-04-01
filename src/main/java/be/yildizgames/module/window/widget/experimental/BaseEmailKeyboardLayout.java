package be.yildizgames.module.window.widget.experimental;

import be.yildizgames.module.window.input.Key;

/**
 * @author Grégory Van den Borre
 */
abstract class BaseEmailKeyboardLayout extends BaseSimpleKeyboardLayout {

    //#%'^_`{|}~
    protected static final KeyboardLayoutKey PERIOD = new KeyboardLayoutKey(".", ".", Key.PERIOD);
    protected static final KeyboardLayoutKey AT = new KeyboardLayoutKey("@", "@", Key.AT);
    protected static final KeyboardLayoutKey EXCLAMATION = new KeyboardLayoutKey("!", "!", Key.EXCLAMATION);
    protected static final KeyboardLayoutKey INTERROGATION = new KeyboardLayoutKey("?", "?", Key.INTERROGATION); //
    protected static final KeyboardLayoutKey EQUALS = new KeyboardLayoutKey("=", "=", Key.EQUALS);
    protected static final KeyboardLayoutKey PLUS = new KeyboardLayoutKey("+", "+", Key.PLUS);
    protected static final KeyboardLayoutKey MINUS = new KeyboardLayoutKey("-", "-", Key.MINUS);
    protected static final KeyboardLayoutKey STAR = new KeyboardLayoutKey("*", "*", Key.STAR);
    protected static final KeyboardLayoutKey AMP = new KeyboardLayoutKey("&", "&", Key.AMPERSAND);
    protected static final KeyboardLayoutKey SLASH = new KeyboardLayoutKey("/", "/", Key.SLASH);
    protected static final KeyboardLayoutKey DOLLAR = new KeyboardLayoutKey("$", "$", Key.DOLLAR);

    protected BaseEmailKeyboardLayout(KeyboardLayoutKey[][] keys) {
        super(keys);
    }
}
