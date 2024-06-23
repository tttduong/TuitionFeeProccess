public class Payment {
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
    public Payment (Student st, double fee){
        this.st = st;
        this.fee = fee;
    }

    public boolean addPayment(Payment pm){
        DatabaseConnection db = new DatabaseConnection();
        if(db.setPayment(pm)){
            return true;
        }else{
            return false;
        }
    }
}
