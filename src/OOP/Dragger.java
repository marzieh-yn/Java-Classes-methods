package OOP;

public class Dragger {
    public void drag(UIWidget draggable){
        draggable.drag();
        draggable.render();
        System.out.println("Drag is done");
    }
}
