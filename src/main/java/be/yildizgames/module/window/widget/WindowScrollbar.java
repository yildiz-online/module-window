package be.yildizgames.module.window.widget;

/**
 * @author Grégory Van den Borre
 */
public interface WindowScrollbar extends WindowWidget<WindowScrollbar>{
    void scrollToTop();

    void scrollToBottom();

    void down(double value);

    void up(double value);
}
