import java.util.Date;

public class Controller {

    public Controller(){
    }

    public boolean sendNotifyFee(int id, String notiContent){
        FeeNotification nt = new FeeNotification(id, notiContent);
        if (nt.addNewNotify(nt)){
            return true;
        }else{
            return false;
        }
    }

    public boolean requestFeeExtension(int id, Student st, Date extendToDate){
        FeeExtendedRequest fer = new FeeExtendedRequest(id, st, extendToDate);
        if(fer.addFeeExtension(fer)){
            return true;
        }else {
            return false;
        }
    }

    public boolean sendFeeComplete(int id, Student st, double fee){
        FeeCompletedRequestStudent fcrs = new FeeCompletedRequestStudent(id, st, fee);
        if(fcrs.addNewFeeComplete(fcrs)) {
            return true;
        }else{
            return false;
        }
    }

    public boolean sendFE_Request(int id, FeeExtendedRequest fer){
        FeeExtendedRequestStudent fcrs = new FeeExtendedRequestStudent(id, fer);
        if(fcrs.addNewFE_Request(fcrs)) {
            return true;
        }else{
            return false;
        }
    }

    public boolean sendTuitionStudent(Student st, double fee){
        TuitionStudent ts = new TuitionStudent(st,fee);
        if(ts.addNewPay(ts)) {
            return true;
        }else{
            return false;
        }
    }

    public boolean payTuitionFee(Student st, double fee){
        Payment pm = new Payment(st, fee);
        if(pm.addPayment(pm)) {
            return true;
        }else{
            return false;
        }
    }
}
