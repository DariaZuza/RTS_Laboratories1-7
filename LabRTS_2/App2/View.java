package LabRTS_2.App2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

class View extends JFrame implements Observer {
    private ArrayList<JProgressBar> bars;

    private void init(Model model) {
        bars = new ArrayList<>();
        for (int i = 0; i < model.getProgressValues().size(); i++) {
            JProgressBar pb = new JProgressBar();
            pb.setMaximum(1000);
            pb.setBounds(50, (i + 1) * 30, 350, 20);
            this.add(pb);
            bars.add(pb);
        }
        model.addObserver(this);
    }

    public View(Model model) {
        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        init(model);
        this.setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        int id = (int) arg;
        int val = ((Model) o).getProgressValue(id);
        bars.get(id).setValue(val);
    }
}
