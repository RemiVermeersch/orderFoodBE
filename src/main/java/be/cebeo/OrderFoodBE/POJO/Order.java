package be.cebeo.OrderFoodBE.POJO;

public class Order {
    private String maandag;
    private String dinsdag;
    private String woensdag;
    private String donderdag;
    private String vrijdag;

    public String getMaandag(){
        return maandag;
    }

    public void setMaandag(String maandag){
        this.maandag = maandag;
    }

    public String getDinsdag(){
        return dinsdag;
    }

    public void setDinsdag(String dinsdag){
        this.dinsdag = dinsdag;
    }

    public String getWoensdag(){
        return woensdag;
    }

    public void setWoensdag(String woensdag){
        this.woensdag = woensdag;
    }

    public String getDonderdag(){
        return donderdag;
    }

    public void setDonderdag(String donderdag){
        this.donderdag = donderdag;
    }
    
    public String getVrijdag(){
        return vrijdag;
    }

    public void setVrijdag(String vrijdag){
        this.vrijdag = vrijdag;
    }


}
