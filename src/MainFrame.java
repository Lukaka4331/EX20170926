import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame{
private Button btn1=new Button("Add");
private Button btn2=new Button("Exit");
private Label lab1=new Label("^-00-^");
private int count=0,labX=50,labY=50,vX=0;
private Timer t1;
private boolean  flag=true;

    public MainFrame(){
        initComp();
    }
    private void initComp(){

this.setBounds(800,300,300,300);
this.addWindowListener(new WindowAdapter() {
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
});
btn1.setBounds(80,100,50,30);
btn2.setBounds(170,100,50,30);
lab1.setBounds(45,50,50,30);
this.add(btn1);
this.add(btn2);
this.add(lab1);
this.setLayout(null);

btn1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
     //   count++;
        MainFrame.this.setTitle(Integer.toString(++count));

        t1.start();
    }
});
btn2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);

    }
});

t1=new Timer(300, new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

     if(labX<800){
       



     }else {


     };












    }
});

    }
}
