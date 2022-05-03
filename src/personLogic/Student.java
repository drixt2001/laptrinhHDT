package personLogic;

public class Student extends Person implements TaxInterface {

    private String truong;

    private String lop;

    public Student() {
    }

    @Override
    public double calcTax(double thunhap) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
