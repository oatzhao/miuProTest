package FPP.Lecture8.prob3;

import java.util.Objects;

public class Marketing{
    private String employeename;
    private String productname;
    private String salesamount;

    Marketing(String employeename, String productname, String salesamount){
        this.employeename = employeename;
        this.productname = productname;
        this.salesamount = salesamount;
    }

    public String getEmployeename() {
        return employeename;
    }

    public String getProductname() {
        return productname;
    }

    public String getSalesamount() {
        return salesamount;
    }

    @Override
    public boolean equals(Object o){
        if(o == this)
            return true;
        if(!(o instanceof Marketing))
            return false;
        Marketing marketing = (Marketing) o;
        boolean employeeNameEquals = (this.employeename == null && marketing.employeename == null)
                || (this.employeename != null && this.employeename.equals(marketing.employeename));
        boolean productNameEquals = (this.productname == null && marketing.productname == null)
                || (this.productname != null && this.productname.equals(marketing.productname ));
        boolean salesAmountEquals = (this.salesamount == null && marketing.salesamount == null)
                || (this.salesamount != null && this.salesamount.equals(marketing.salesamount ));
        return salesAmountEquals && employeeNameEquals && productNameEquals;

    }

    @Override
    public int hashCode() {
        return Objects.hash(employeename, productname);
    }

    @Override
    public String toString(){
        return "Market employeename:" +employeename+ "  productname:" +productname +"  salesamount:"+ salesamount;
    }
}
