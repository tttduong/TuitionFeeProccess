public class FeeExtendedRequestStudent {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FeeExtendedRequest getFer() {
        return fer;
    }

    public void setFer(FeeExtendedRequest fer) {
        this.fer = fer;
    }

    private FeeExtendedRequest fer;

    public FeeExtendedRequestStudent(int id, FeeExtendedRequest fer){
        this.id = id;
        this.fer = fer ;
    }
    public boolean addNewFE_Request(FeeExtendedRequestStudent fers ){
        DatabaseConnection db = new DatabaseConnection();
        if(db.setFE_Request(fers)){
            return true;
        }else{
            return false;
        }
    }

}
