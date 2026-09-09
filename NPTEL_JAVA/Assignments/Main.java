package NPTEL_JAVA.Assignments;
class Vehicle {
    
public void move() {
System.out.println("The vehicle moves");
}
}
class Car extends Vehicle {
public void move() {
System.out.println("The car moves");
}
}
public class Main {
public static void main(String[] args) {
Vehicle vehicle = new Car();
vehicle.move();
}
}

// Car inherits from Vehicle.

// But Car provides its own version of move().

// That's called method overriding.

// So:

// Vehicle → move() → "The vehicle moves"
// Car     → move() → "The car moves"
// 3. The confusing line
// Vehicle vehicle = new Car();

// This is the important part.

// You have:

// Reference type = Vehicle
// Actual object  = Car

// Think of it as:

// Vehicle vehicle ─────────→ Car object

// The variable is called vehicle, and its declared type is Vehicle, but the object actually created is a Car.

// This is allowed because:

// A Car is a Vehicle.

// 4. Now this line
// vehicle.move();

// You might think:

// "vehicle is a Vehicle, so shouldn't it print The vehicle moves?"

// No.

// Java uses the actual object's overridden method at runtime.

// The actual object is:

// new Car()

// and Car has overridden move().

// Therefore:

// vehicle.move()
//       ↓
// actual object = Car
//       ↓
// Car.move()
//       ↓
// "The car moves"
// Output:
// The car moves