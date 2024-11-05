public interface Document {
    void setExtension(String extension);

    void setEncryption(String encryption);

    Document buildDoc();
}