public class FeeExtendedRequestStudent {
    private int id;
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
