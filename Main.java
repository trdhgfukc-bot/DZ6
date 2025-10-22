public class Main {
    public static void main(String[] args) {
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "Black", 25000, "AB123CD"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000, "EF456GH"),
            new Car(3, "Toyota", "Corolla", 2021, "Red", 20000, "IJ789KL"),
            new Car(4, "BMW", "X5", 2018, "Blue", 45000, "MN012OP")
        };

        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        System.out.println("Toyota cars found: " + toyotaCars.length);
        
        Car[] audiCars = getCarByBrend(cars, "Audi");
        System.out.println("Audi cars found: " + audiCars.length);
    }

    public static Car[] getCarByBrend(Car[] cars, String brend) {
        // Считаем количество машин нужной марки
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                count++;
            }
        }

        // Создаем массив нужного размера
        Car[] result = new Car[count];
        int index = 0;
        
        // Заполняем массив
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                result[index] = car;
                index++;
            }
        }
        
        return result;
    }
}