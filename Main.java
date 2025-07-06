import java.awt.*;
import java.awt.event.*;

class Main{
    public static void main(String[] args){
        var window = new Frame();
        window.setTitle("AWT");
        window.setSize(320, 240);
        window.setLocationRelativeTo(null);
        window.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent x){
                window.dispose();
            }
        });
        window.setLayout(new FlowLayout());

        var buttons = new Button[3];
        for(var n : buttons){
            n = new Button("按鈕");
            window.add(n);
        }

        window.setVisible(true);
    }
}