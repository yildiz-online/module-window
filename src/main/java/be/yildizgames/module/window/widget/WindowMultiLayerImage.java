package be.yildizgames.module.window.widget;

import be.yildizgames.module.coordinates.Coordinates;
import be.yildizgames.module.coordinates.Position;
import be.yildizgames.module.coordinates.Size;
import be.yildizgames.module.window.input.MouseOverListener;

import java.util.Optional;

/**
 * @author Grégory Van den Borre
 */
public interface WindowMultiLayerImage extends WindowWidget<WindowMultiLayerImage> {

    WindowMultiLayerImage setCoordinates(Coordinates coordinates);

    WindowMultiLayerImage setPosition(Position position);

    WindowMultiLayerImage setSize(Size size);

    WindowMultiLayerImage setImage(String url, int layer);

    Optional<WindowImage> getImage(int layer);

    WindowMultiLayerImage addOnMouseOverListener(MouseOverListener l);

    WindowMultiLayerImage toFront();

    WindowMultiLayerImage toBack();

    WindowMultiLayerImage preserveRatio();
}
