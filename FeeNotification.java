public class FeeNotification {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNotiContent() {
        return notiContent;
    }

    public void setNotiContent(String notiContent) {
        this.notiContent = notiContent;
    }

    private String notiContent;

    public FeeNotification(int id, String notiContent){
        this.id = id;
        this.notiContent = notiContent;
    }

    public boolean addNewNotify(FeeNotification nt){
        DatabaseConnection db = new DatabaseConnection();
        if(db.setNoti(nt)){
            return true;
        }else{
            return false;
        }
    }
}
