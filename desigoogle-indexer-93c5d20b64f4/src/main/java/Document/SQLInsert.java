package Document;

public class SQLInsert {
    private String docId;
    private double tfIDF;

    public SQLInsert(String docId, double tfIDF) {
        this.docId = docId;
        this.tfIDF = tfIDF;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public double getTfIDF() {
        return tfIDF;
    }

    public void setTfIDF(double tfIDF) {
        this.tfIDF = tfIDF;
    }
}
