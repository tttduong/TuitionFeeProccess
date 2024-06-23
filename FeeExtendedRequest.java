import java.util.Date;

public class FeeExtendedRequest {
    private int id ;
    private Date extendToDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getExtendToDate() {
        return extendToDate;
    }

    public void setExtendToDate(Date extendToDate) {
        this.extendToDate = extendToDate;
    }

    public FeeExtendedRequest (int id, Student st, Date extendToDate) {
        this. id = id;
        this.extendToDate = extendToDate;
    }
    public boolean addFeeExtension(FeeExtendedRequest fer){
        DatabaseConnection db = new DatabaseConnection();
        if(db.setExtendedFee(fer)){
            return true;
        }else {
            return false;
        }}
}
