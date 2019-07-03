package be.yildizgames.module.window.widget;

import be.yildizgames.module.window.WindowThreadManager;

public interface WindowShellFactory {

    WindowShell buildShell();

    WindowShell buildShellWithClose();

    WindowThreadManager getThreadManager();

    WindowShell buildShellNoClose(WindowImageProvider provider);
}
