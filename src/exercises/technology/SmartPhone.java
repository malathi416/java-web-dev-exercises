package exercises.technology;

public class SmartPhone extends Computer {
    private Boolean isScreenProtected;
    public SmartPhone(String abrand,int amemorysize,double adisplaysize,double aweight,boolean aisScreenProtected){
        super(abrand,amemorysize,adisplaysize,aweight);
       this.isScreenProtected = true;
    }


    public Boolean getScreenProtected() {
        return isScreenProtected;
    }
}
