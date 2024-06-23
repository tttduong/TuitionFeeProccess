public class TuitionStudent {
    private Student st;
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
