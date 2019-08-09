package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        Drawable d2 = ()->{
            System.out.println("hello world ");
        };

        d2.draw();

        List<String> list= new ArrayList<String>();
    }
}
