package model;

public class Booking {
//    mã booking, ngày bắt đầu, ngày kết thúc, mã khách hàng, tên dịch vụ.
    private String idBooking;
    private  String startDay;
    private  String enDay;
    private  String idCustomer;
    private String service;

    public Booking(String idBooking, String startDay, String enDay, String idCustomer, String service) {
        this.idBooking = idBooking;
        this.startDay = startDay;
        this.enDay = enDay;
        this.idCustomer = idCustomer;
        this.service = service;
    }

    public Booking() {
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEnDay() {
        return enDay;
    }

    public void setEnDay(String enDay) {
        this.enDay = enDay;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "idBooking='" + idBooking + '\'' +
                ", startDay='" + startDay + '\'' +
                ", enDay='" + enDay + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                ", service='" + service + '\'' +
                '}';
    }
}
