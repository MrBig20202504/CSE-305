public class MediumPriorityRequestCreator extends RequestCreator {
    @Override
    public RequestProduct createRequest() {
        return new MediumPriorityRequest();
    }
}
