package OOP;

public abstract class UIControl {
    protected boolean isEnable = true;

//    public UIControl(boolean isEnable) {
//        this.isEnable = isEnable;
//    }
    public abstract void render();

    public void enable(){
        isEnable = true;
    }
    public void disable(){
        isEnable = false;
    }

    public boolean isEnable() {
        return isEnable;
    }
}
