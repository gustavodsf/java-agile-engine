Sure, here's a sample README file for your project, updated to use Gradle instead of Maven:

---

# E-commerce Application

This is a simple e-commerce application built with Spring Boot, JPA, and PostgreSQL. The application allows you to manage orders and order items.

## Prerequisites

- JDK 21
- Gradle
- Docker
- Docker Compose

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/yourusername/ecommerce-app.git
cd ecommerce-app
```

### Build the Project

Use Gradle to build the project and create a JAR file.

```bash
./gradlew clean build
```

### Run the Application with Docker Compose

Ensure Docker and Docker Compose are installed on your machine. Use Docker Compose to start the application and the PostgreSQL database.

```bash
docker-compose up --build
```

This command will:

1. Build the application using Gradle.
2. Start a PostgreSQL database container.
3. Start the Spring Boot application container.

### Access the Application

Once the application is running, you can access it at `http://localhost:8080`.

## API Endpoints

### Order API

- **GET /api/orders** - Get a list of all orders
- **GET /api/orders/{id}** - Get an order by ID
- **POST /api/orders** - Create a new order
- **PUT /api/orders/{id}** - Update an existing order
- **DELETE /api/orders/{id}** - Delete an order by ID

### OrderItem API

- **GET /api/order-items** - Get a list of all order items
- **GET /api/order-items/{id}** - Get an order item by ID
- **POST /api/order-items** - Create a new order item
- **PUT /api/order-items/{id}** - Update an existing order item
- **DELETE /api/order-items/{id}** - Delete an order item by ID

## Running Tests

To run the tests, use the following command:

```bash
./gradlew test
```

## Building the Docker Image Manually

If you want to build the Docker image manually, you can use the following commands:

```bash
# Build the project
./gradlew clean build

# Build the Docker image
docker build -t ecommerce-app .

# Run the Docker container
docker run -p 8080:8080 ecommerce-app
```

## Configuration

The application uses the following environment variables for configuration:

- `SPRING_DATASOURCE_URL` - The JDBC URL for the PostgreSQL database.
- `SPRING_DATASOURCE_USERNAME` - The username for the PostgreSQL database.
- `SPRING_DATASOURCE_PASSWORD` - The password for the PostgreSQL database.

These variables are set in the `docker-compose.yml` file.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Spring Boot
- PostgreSQL
- Docker

---

Feel free to customize this README file according to your project's specific details and requirements.