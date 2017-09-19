import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button btExit = new Button("exit");
    private Button btAdd = new Button("Add");
    private Label lb1 = new Label("0");
    private int v1 = 0;
    public MainFrame(){
        initComp();
    }
    private void initComp(){
        this.setLayout(null);
        this.setLocation(100,120);
        this.setSize(400,200);
        btExit.setBounds(50,30,50,30);
        btAdd.setBounds(50,60,50,30);
        lb1.setBounds(50,100,50,30);
        btExit.setBackground(Color.CYAN);
        this.add(btExit);
        this.add(btAdd);
        this.add(lb1);
        btExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               v1++;
               lb1.setText(Integer.toString(v1));
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        }
    }


