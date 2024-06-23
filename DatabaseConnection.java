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

    public boolean setFeeComplete(FeeComplete fcrs){
        System.out.println("Add fee-completed request student successfully: "+ fcrs.getId() +" - "+ fcrs.getSt().getSid()+ " "+ fcrs.getSt().getName()+ " - "+fcrs.getFee());
        boolean rs = true;
        return rs;
    }

    public boolean setFE_Request(FE_Request fers){
        System.out.println("Add fee-extended request student successfully: "+ fers.getId()+" - "+ fers.getFer().getId()+" "+fers.getFer().getExtendToDate());
        boolean rs = true;
        return rs;
    }

    public boolean setTuitionFee(TuitionStudent ts){
        System.out.println("Add tuition request student successfully: "+ ts.getSt().toString() + " - "+ts.getFee());
        boolean rs = true;
        return rs;
    }

    public boolean setPayment(Payment pm){
        System.out.println("Add tuition request student successfully: "+ pm.getSt().toString() + " - "+pm.getFee());
        boolean rs = true;
        return rs;
    }
}
