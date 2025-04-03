# Pet Clinic Appointment System Backend

A robust backend system for managing pet clinic appointments, built with Spring Boot 3.4.4 and Java 21. This system facilitates appointment booking between pet owners and veterinarians, handling scheduling, user management, and payment processing.

## Features

- **User Management**
  - Doctor registration and verification
  - Customer account management
  - Admin dashboard for platform management

- **Appointment System**
  - Advanced scheduling system for doctors
  - Flexible appointment booking for customers
  - Real-time slot availability
  - Appointment reminders and notifications

- **Payment Processing**
  - Secure payment handling
  - Commission management (5% platform fee)
  - Multiple payment withdrawal options for doctors
  - Automated refund processing

- **Search and Discovery**
  - Advanced doctor search functionality
  - Filter by multiple criteria (location, availability, specialization)
  - Rating and review system

## Technology Stack

- **Framework:** Spring Boot 3.4.4
- **Language:** Java 21
- **Database:** MySQL
- **Security:** Spring Security
- **API Documentation:** Swagger/OpenAPI
- **Build Tool:** Maven

## Prerequisites

- JDK 21
- Maven 3.x
- MySQL 8.x
- Docker (optional)

## Getting Started

1. **Clone the repository**
   ```bash
   git clone [repository-url]
   cd pet-clinic
   ```

2. **Configure MySQL**
   - Create a MySQL database
   - Update `application.properties` with your database credentials

3. **Build the application**
   ```bash
   mvn clean install
   ```

4. **Run the application**
   ```bash
   mvn spring-boot:run
   ```
   
   Alternatively, using Docker:
   ```bash
   docker-compose up
   ```

The application will be available at `http://localhost:8080`

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/charithm/petclinic/
│   │       ├── config/        # Configuration files
│   │       ├── controller/    # REST controllers
│   │       ├── model/        # Entity classes
│   │       ├── repository/   # Data access layer
│   │       ├── service/      # Business logic
│   │       └── security/     # Security configuration
│   └── resources/
│       └── application.properties
```

## API Documentation

Once the application is running, you can access the API documentation at:
- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`

## Security

- JWT-based authentication
- Role-based access control
- Encrypted sensitive data
- Secure payment processing
- GDPR compliance measures

## Database Schema

The application uses the following core entities:
- Doctors
- Customers
- Appointments
- Payments
- Reviews

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Support

For support and queries, please contact [ncroxmadushan@gmail.com]

## Future Enhancements

- Mobile application support
- Video consultation integration
- Prescription management system
- Medical records storage
- Integration with pet health monitoring devices 