package LabRTS_2.App2;

public class Main {

    private static final int noOfThreads = 6;
    private static final int processorLoad = 1000000;

    public static void main(String[] args) {
        //you create an object from each class
        Model model = new Model(noOfThreads);
        View view = new View(model);
        Controller controller = new Controller(model, view, processorLoad);

        for (int i = 0; i < noOfThreads; i++) {
            new Fir(i, i + 2, controller).start();
        }
    }
}


