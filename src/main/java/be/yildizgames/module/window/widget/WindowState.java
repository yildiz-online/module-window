package be.yildizgames.module.window.widget;

import be.yildizgames.module.color.Color;

import java.util.Optional;

public interface WindowState extends WindowWidgetCreator {

    WindowState activate();

    BorderLayout createBorderLayout();

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

    Optional<WindowTextLine> findTextLine(String id);

    Optional<WindowImage> findImage(String id);

    Optional<WindowShape> findShape(String id);

    Optional<WindowButton> findButton(String id);

    Optional<GridLayout> findGrid(String id);

    Optional<WindowScrollbar> findScrollbar(String id);

    Optional<TileLayout> findTile(String id);

    Optional<BorderLayout> findBorder(String id);

    Optional<WindowMediaPlayer> findMediaPlayer(String id);

    Optional<WindowInputBox> findInputBox(String id);

    String getId();

}
