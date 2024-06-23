public class FeeCompletedRequestStudent {
    private int id;
    private Student st;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    private Double fee;

    public FeeCompletedRequestStudent(int id, Student st, Double fee){
        this.id = id;
        this.st = st;
        this.fee = fee;
    }

    public boolean addNewFeeComplete(FeeCompletedRequestStudent fcrs){
        DatabaseConnection db = new DatabaseConnection();
        if(db.setFeeComplete(fcrs)){
            return true;
        }else{
            return false;
        }
    }

}
