package be.yildizgames.module.window.widget;

import be.yildizgames.module.coordinates.Coordinates;
import be.yildizgames.module.window.input.KeyboardListener;
import be.yildizgames.module.window.widget.experimental.VirtualKeyboard;

public interface WindowWidgetCreator {

    WindowShape createRectangle();

    WindowToggle createToggle();

    /**
     * Create a new text line widget.
     * @return The created text line.
     */
    WindowTextLine createTextLine();

    /**
     * Create a new button widget.
     * @return The created button.
     */
    WindowButton createButton();

    /**
     * Create a new image widget.
     * @return The created image.
     */
    WindowImage createImage(String image);

    WindowProgressBar createProgressBar();

    WindowDropdown createDropdown();

    WindowButtonText createTextButton();

    WindowInputBox createInputBox();

    WindowCheckBox createCheckBox();

    WindowMediaPlayer createMediaPlayer();

    VirtualKeyboard createVirtualKeyboard(KeyboardListener listener);

    WindowNotificationPane createNotificationPane();

    WindowWidgetCreator setCoordinates(Coordinates coordinates);

    WindowModal createMessageBox();

    WindowModal createMessageButtonBox();

    /**
     * Create a new text area widget.
     * @return The created text area.
     */
    WindowTextArea createTextArea();

    WindowMenuBar createMenuBar(WindowMenuBarElementDefinition... elements);

    WindowTreeRoot createTreeRoot(int width, int height, WindowTreeElement... elements);

    WindowModalFile createOpenFileBox();

    WindowCanvas createCanvas();

    WindowButton createButton(String background, String hover);

    WindowShell getWindow();

    WindowMultiLayerImage createMultiLayerImage();
}
