public class TuitionStudent {
    private Student st;

    public Student getSt() {
        return st;
    }

    public void setSt(Student st) {
        this.st = st;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    private double fee;
    public TuitionStudent (Student st, double fee){
        this.st = st;
        this.fee = fee;
    }

    public boolean addNewPay(TuitionStudent ts){
        DatabaseConnection db = new DatabaseConnection();
        if(db.setTuitionFee(ts)){
            return true;
        }else{
            return false;
        }
    }
}
