package DSA_JAVA;

public class numofwheel {
    public static void main(String[] args) {
        int wheel = 540;
        int vehicle = 200;
        int car = 0;
        int bike = 0;
        if(wheel<2*vehicle || wheel%2 != 0 || wheel > 4*vehicle){
            System.out.println("invalid input");
        } else {
        car = (wheel-2*vehicle)/2;
        bike = vehicle-car;
        System.out.println("Number of cars: " + car);
        System.out.println("Number of bikes: " + bike);
    }
}
}

