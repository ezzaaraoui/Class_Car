public class Car {
    short speed ;
    String color ;
    boolean nitroSpeed ;
    String model ;
    short enginePower ;
    String name ;

    public Car(short speed , String color , boolean nitroSpeed , String model , short enginePower , String name){
        this.speed = speed;
        this.color = color;
        this.nitroSpeed = nitroSpeed;
        this.model=model ;
        this.enginePower = enginePower;
        this.name = name;
    }

    public void turn(){
        System.out.println("Car turn");
    }

    public void accelerate(){
        System.out.println("Car accelerating");
    }

    public void brake(){
        System.out.println("Car braking");
    }

    public void boost(){
        System.out.println("Car boosting");
    }

    public void Start(){
        System.out.println("Car starting");
    }

    public void Stop(){
        System.out.println("Car stopping");
    }

    public void changeGear(){
        System.out.println("Car changing gears");
    }
}
