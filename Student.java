public class Student {
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){

        return name+ " "+ sid;
    }
    private int sid;
    private String name;
    public Student (int sid, String name){
        this.sid = sid ;
        this.name = name;
    }

}
