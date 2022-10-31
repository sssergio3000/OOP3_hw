package Vehicle;

public class Ship extends Vehicle{
    String port;
    int passNum;
    public Ship(int coordX, int coordY, int price, int speed, int year, String port, int passNum) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.port = port;
        this.passNum = passNum;
    }//constructor

    public String getPort() {
        return port;
    }

    public int getPassNum() {
        return passNum;
    }
    public void show(){
        System.out.println("port: "+this.getPort());
        System.out.println("number of passengers: "+this.getPassNum());
        System.out.println("year: "+this.getYear());
        System.out.println("speed: "+this.getSpeed());
        System.out.println("price: "+this.getPrice());
        System.out.println("coord_X: "+this.getCoordX());
        System.out.println("coord_Y: "+this.getCoordY());
    }//show
}//class
