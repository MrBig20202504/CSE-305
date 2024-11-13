public class Main {
    public static void main(String[] args) {
        RequestCreator lowPriorityCreator = new LowPriorityRequestCreator();
        RequestCreator mediumPriorityCreator = new MediumPriorityRequestCreator();
        RequestCreator highPriorityCreator = new HighPriorityRequestCreator();

        lowPriorityCreator.processRequest();

        mediumPriorityCreator.processRequest();

        highPriorityCreator.processRequest();
    }
}
