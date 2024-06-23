public class DatabaseConnection {
    public DatabaseConnection(){

    }

    public boolean setNoti(FeeNotification nt){
        System.out.println("Add notification successfully: "+ nt.getId()+" - "+nt.getNotiContent());
        boolean rs = true;
        return rs;

    }

    public boolean setExtendedFee(FeeExtendedRequest fer){
        System.out.println("Add fee-extended request successfully: "+ fer.getId() +" - "+fer.getExtendToDate());
        boolean rs = true;
        return rs;
    }

    public boolean setFeeComplete(FeeCompletedRequestStudent fcrs){
        System.out.println("Add fee-completed request student successfully: "+ fcrs.toString());
        boolean rs = true;
        return rs;
    }

    public boolean setFE_Request(FeeExtendedRequestStudent fers){
        System.out.println("Add fee-extended request student successfully: "+ fers.toString());
        boolean rs = true;
        return rs;
    }

    public boolean setTuitionFee(TuitionStudent ts){
        System.out.println("Add tuition request student successfully: "+ ts.toString());
        boolean rs = true;
        return rs;
    }

    public boolean setPayment(Payment pm){
        System.out.println("Add tuition request student successfully: "+ pm.toString());
        boolean rs = true;
        return rs;
    }
}
