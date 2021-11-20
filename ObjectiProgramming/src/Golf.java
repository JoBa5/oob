public class Golf extends Vehicle {

//    public String drive;
    public Drive naped;

    public Golf(int dateOfProduction, String model, boolean airCon, int mileage, Drive drive){
        super(dateOfProduction, model, airCon, mileage);
        this.naped = drive;

    }

}
