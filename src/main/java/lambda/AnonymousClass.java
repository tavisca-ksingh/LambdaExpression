package lambda;

interface Drawable{
    public void draw();
}
public class AnonymousClass {

    public static void main(String[] args) {
        int width  = 10;
        Drawable d = new Drawable(){
            @Override
            public void draw() {
                System.out.println("width : " + width);
            }
        };
    d.draw();
    }
}
