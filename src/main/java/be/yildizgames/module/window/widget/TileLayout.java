package be.yildizgames.module.window.widget;

/**
 * @author Grégory Van den Borre
 */
public interface TileLayout {

    void addItem(WindowImage image);

    void setGap(int horizontal, int vertical);

    int numberOfRow();

    int numberOfColumn();

    void removeItem(WindowImage image);

    int getSize();
}
