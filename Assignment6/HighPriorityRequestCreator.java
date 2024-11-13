public class HighPriorityRequestCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        return new HighPriorityRequest();
    }
}