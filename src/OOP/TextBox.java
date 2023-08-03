package OOP;

public class TextBox extends UIControl {
    public String text = ""; // Fields
//  bcuz textBox class inherit of UIControl class and in constructor of UIControl class we have a value, we got error here in
//    constructor of textBox bcuz it is inherited of UIControl class, so it will need a value for that, which does not have it, so we need to
//    add it as super in our constructor to call our base constructor class
//    public TextBox() {
//        super(true);
//    }
    @Override
    public String toString(){
        return text;
    }

    @Override
    public void render() {
//        super.render();
        System.out.println("Text Box Render");
    }

    public void setText(String text){
        this.text = text;
    }
    public void clear(){
        text = "";
    }
}
