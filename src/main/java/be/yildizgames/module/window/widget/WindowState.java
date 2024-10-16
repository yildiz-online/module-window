package be.yildizgames.module.window.widget;

import be.yildizgames.module.color.Color;

public interface WindowState extends WindowWidgetCreator {

    WindowState activate();

    WindowState setBackground(Color color);

    WindowState setBackground(String file);
}
