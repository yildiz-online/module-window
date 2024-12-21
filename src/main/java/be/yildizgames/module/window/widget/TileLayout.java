package be.yildizgames.module.window.widget;

/**
 * @author Grégory Van den Borre
 */
public interface TileLayout<T extends WindowWidget<T>> extends WindowWidget<TileLayout<T>>{

    void addItem(T image);

    void setGap(int horizontal, int vertical);

    int numberOfRow();

    int numberOfColumn();

    void removeItem(T image);

    int getSize();
}
