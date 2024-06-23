import java.util.Date;

public class Main {
    public static void main (String[] args){
        Date d1 = new Date(2024, 07, 04);
        Student st1 = new Student(21053, "Ta Thi Thuy Duong");
        FeeExtendedRequest fer1 = new FeeExtendedRequest(1, st1, d1);


        Controller ctl = new Controller();
        ctl.sendNotifyFee(1, "Pay Tuition Fee");
        ctl.requestFeeExtension(1, new Student(21053, "Ta Thi Thuy Duong" ), d1);
        ctl.sendFeeComplete(1, new Student (21053, "Ta Thi Thuy Duong"), 240.000);
        ctl.sendFE_Request(1, fer1);
        ctl.sendTuitionStudent(st1,240.000);
        ctl.payTuitionFee(st1,240.000);

    }
}
