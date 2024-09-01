# Java 8 Features Demo Project

This project demonstrates various Java 8 features including Streams, Optional, Interfaces, and Adapter patterns. The project is structured to showcase practical implementations of these features using a car management system as an example.

## Project Structure

```
src/
├── com/
│   └── java8/
│       ├── adapter/         # Adapter pattern implementation
│       ├── interfaces/      # Interface implementations
│       ├── optional/        # Optional feature demonstrations
│       └── stream/          # Stream API implementations
│           ├── domain/      # Domain models
│           ├── exec/        # Execution examples
│           └── filter/      # Stream filtering examples
└── test/                   # Test cases
```

## Features

### 1. Stream API Demonstrations

The project includes several examples of Java 8 Stream API usage:

- **Car Filtering**: Demonstrates filtering cars based on various criteria
- **Distinct Operations**: Shows how to get unique car entries
- **Stream Collection**: Examples of collecting stream results into different collection types

### 2. Domain Model

The project uses a `Car` class as its primary domain model with the following attributes:
- `model`: String representing the car model
- `year`: Integer representing the manufacturing year

### 3. Key Components

#### CarService
The main service class that demonstrates various Stream API operations:
- `getAboveYear(int year)`: Filters cars manufactured after a specific year
- `getAllCars()`: Retrieves and displays all cars
- `getYearByModel()`: Gets the year of a specific car model
- `getDistinctCar()`: Retrieves unique car entries
- `isOverthan(String x, String y)`: Utility method for string length comparison
- `isGreatherThan()`: Demonstrates string comparison functionality

#### Car Domain Model
The `Car` class implements:
- Comparable interface for car comparison
- Proper equals() and hashCode() implementations
- Getters and setters for all properties

### 4. Testing

The project includes unit tests using:
- JUnit for test framework
- Mockito for mocking and spying
- Test cases for various service methods

## Usage Examples

### Filtering Cars by Year
```java
CarService carService = new CarService();
carService.getAboveYear(2020);  // Gets all cars manufactured after 2020
```

### Getting Distinct Cars
```java
carService.getDistinctCar();  // Retrieves unique car entries
```

### Finding Car by Model
```java
carService.getYearByModel();  // Gets year for a specific car model
```

## Dependencies

The project uses the following main dependencies:
- Java 8
- JUnit
- Mockito

## Testing

To run the tests:
1. Ensure you have Java 8 installed
2. Run the test cases using your preferred IDE or build tool
3. The tests demonstrate various scenarios including string comparison and car filtering

## Design Patterns

The project implements several design patterns:
1. **Adapter Pattern**: Used in the car adapter implementation
2. **Interface-based Design**: Demonstrates interface usage for better abstraction
3. **Stream API**: Shows functional programming features introduced in Java 8

## Best Practices

The project follows several Java best practices:
- Proper encapsulation with private fields and public getters/setters
- Implementation of equals() and hashCode() for proper object comparison
- Use of Java 8 features for more concise and functional code
- Comprehensive unit testing
- Clear separation of concerns between different components 
=======
# java8

