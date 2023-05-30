package LabRTS_2.App2;

class Controller {
    private Model model;
    private View view;
    private int processorLoad;

    public Controller(Model model, View view, int processorLoad) {
        this.model = model;
        this.view = view;
        this.processorLoad = processorLoad;
    }

    public void setProgressValue(int id, int val) {
        model.setProgressValue(id, val);
    }

    public int getProcessorLoad() {
        return processorLoad;
    }
}
