package be.yildizgames.module.window.widget;

import be.yildizgames.module.coordinates.Position;

/**
 * @author Grégory Van den Borre
 */
public interface TileLayout {

    void addItem(WindowImage image);

    void setGap(int horizontal, int vertical);

   int numberOfRow();

   int numberOfColumn();
}
