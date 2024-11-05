public class NormalDoc implements Document {
    private String extension;
    private String encryption;

    @Override
    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    @Override
    public Document buildDoc() {
        System.out.println("Normal Document Created");
        return this;
    }
}