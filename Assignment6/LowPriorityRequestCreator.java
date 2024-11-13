public class LowPriorityRequestCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        return new LowPriorityRequest();
    }
}
