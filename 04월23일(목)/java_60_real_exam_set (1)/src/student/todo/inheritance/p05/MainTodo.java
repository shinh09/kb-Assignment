package student.todo.inheritance.p05;

class VehicleTodo {
    // TODO 1: run() 작성
    public void run(){
        System.out.println("차량이 달린다. ");
    }
}

class BusTodo extends VehicleTodo {
    // TODO 2: run() 오버라이딩
    public void run(){
        System.out.println("버스가 달린다.");
    }
}

class DriverTodo {
    // TODO 3: drive(VehicleTodo vehicle) 작성
    public void drive(VehicleTodo vehicle){
        vehicle.run();
    }
}

public class MainTodo {
    public static void main(String[] args) {
        // TODO 4: DriverTodo가 BusTodo를 운전하도록 호출
        DriverTodo driver = new DriverTodo();
        VehicleTodo vehicle = new BusTodo();
        driver.drive(vehicle);

    }
}
