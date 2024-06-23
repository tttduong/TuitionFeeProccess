public class FE_Request {
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

    public FE_Request(int id, FeeExtendedRequest fer){
        this.id = id;
        this.fer = fer ;
    }
    public boolean addNewFE_Request(FE_Request fers ){
        DatabaseConnection db = new DatabaseConnection();
        if(db.setFE_Request(fers)){
            return true;
        }else{
            return false;
        }
    }

}
