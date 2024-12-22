package be.yildizgames.module.window.widget;

/**
 * @author Grégory Van den Borre
 */
public interface VerticalLayout extends WindowWidget<VerticalLayout> {

    VerticalLayout addWidget(WindowWidget<?> widget);

    <T extends WindowWidget<T>> T getWidget(int index, Class<T> clazz);
}
