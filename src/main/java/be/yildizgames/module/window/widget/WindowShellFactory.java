package be.yildizgames.module.window.widget;

public interface WindowShellFactory {

    WindowShell buildShell();

    WindowShell buildShellWithClose();

    WindowShell buildShellNoClose(WindowImageProvider provider);
}
