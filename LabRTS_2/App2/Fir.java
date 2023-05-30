package LabRTS_2.App2;
// extend fir class from observable
class Fir extends Thread {
    private int id;
    private Controller controller;

    public Fir(int id, int priority, Controller controller) {
        this.id = id;
        this.controller = controller;
        this.setPriority(priority);
    }

    public void run() {
        int c = 0;
        while (c < 1000) {
            for (int j = 0; j < controller.getProcessorLoad(); j++) {
                j++;
                j--;
            }
            c++;
            controller.setProgressValue(id, c);
        }
    }
}
