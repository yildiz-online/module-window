package be.yildizgames.module.window.widget;

/**
 * @author Grégory Van den Borre
 */
public interface BorderLayout {

    BorderLayoutPart getTop();

    BorderLayoutPart getBottom();

    BorderLayoutPart getLeft();

    BorderLayoutPart getCenter();

    BorderLayoutPart getRight();
}
