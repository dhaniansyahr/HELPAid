public class Document {
    private String documentID;
    private String fileName;
    private String description;

    public Document(String documentID, String fileName, String description) {
        this.documentID = documentID;
        this.fileName = fileName;
        this.description = description;
    }

    public String getDocumentID() {
        return documentID;
    }

    public String getFileName() {
        return fileName;
    }

    public String getDescription() {
        return description;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
