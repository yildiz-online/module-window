package be.yildizgames.module.window;

public interface WindowThreadManager {

    void runAsync(Runnable r);

    void runLongTask(Runnable r);
}
