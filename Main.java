public class Main{
    public static void main(String[] args) {
        Car car = new Car(200 , "red" ,true , "BMW " , 120 , "veen");
        car.color = "red" ;
        car.model = "BMW" ;
        car.speed = 280 ;
        car.nitroSpeed = true ;


        car.Start();
        car.accelerate();
        car.brake();
        car.boost();
        car.Stop();
        car.changeGear();
    }
}
