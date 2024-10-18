package be.yildizgames.module.window.widget;

import be.yildizgames.module.color.Color;

public interface WindowState extends WindowWidgetCreator {

    WindowState activate();

    WindowShell getWindow();

    /**
     * Set the window background color for the active state.
     * @param color Color to use.
     * @return This object for chaining.
     */
    WindowState setBackground(Color color);

    /**
     * Set the window background image.
     * @param file Background image file.
     * @return This object for chaining.
     */
    WindowState setBackground(String file);
}
