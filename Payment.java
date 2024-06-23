public class Payment {
    private Student st;
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
