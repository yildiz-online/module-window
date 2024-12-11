package be.yildizgames.module.window.widget;

import java.util.Optional;

/**
 * @author Grégory Van den Borre
 */
public interface WindowMultiLayerImage extends WindowWidget<WindowMultiLayerImage> {

    /**
     * Set the image to display.
     *
     * @param url Url of the image to display [not null].
     * @param layer Layer [>=0].
     * @return This object for chaining [not null].
     */
    WindowMultiLayerImage setImage(String url, int layer);

    /**
     * Get the image associated to the layer.
     * @param layer Layer [>=0].
     * @return The image associated to the layer [not null].
     */
    Optional<WindowImage> getImage(int layer);

    /**
     * Force the displayed image ratio to be preserved.
     *
     * @return This object for chaining [not null].
     */
    WindowMultiLayerImage preserveRatio();
}
