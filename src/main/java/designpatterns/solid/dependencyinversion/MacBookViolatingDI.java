package designpatterns.solid.dependencyinversion;

public class MacBookViolatingDI {
    private Keyboard keyboard;
    private Mouse mouse;

    /**
     *
     * Code to a concrete class violating DI principle
     */
    public MacBookViolatingDI(){
        keyboard=new WiredKeyboard();
        mouse=new WiredMouse();
    }
}
