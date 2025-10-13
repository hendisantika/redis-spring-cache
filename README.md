# Redis Spring Cache

A simple Spring Boot application demonstrating Redis caching with Spring Data Redis and Jedis client.

## Description

This project showcases how to integrate Redis caching in a Spring Boot application. It provides a basic implementation
of a Redis service that can store and retrieve key-value pairs with automatic expiration.

## Technologies Used

- Java 17
- Spring Boot 3.5.6
- Spring Data Redis
- Jedis 7.0.0 (Redis Java client)
- Maven
- Redis Server

## Features

- Redis connection configuration using Jedis
- Simple Redis service for key-value operations
- Automatic key expiration (5 seconds TTL)
- Production-ready Spring Boot application
- JUnit 5 test support

## Prerequisites

Before running this application, ensure you have:

- Java 17 or higher installed
- Maven 3.x installed
- Redis Server installed and running on localhost:6379

### Installing and Running Redis

**macOS:**

```bash
brew install redis
brew services start redis
```

**Linux:**

```bash
sudo apt-get install redis-server
sudo systemctl start redis
```

**Docker:**

```bash
docker run -d -p 6379:6379 redis:latest
```

### Verify Redis is Running

```bash
redis-cli ping
```

You should see `PONG` as the response.

## Installation

1. Clone the repository:

```bash
git clone <repository-url>
cd redis-spring-cache
```

2. Build the project:

```bash
mvn clean install
```

## Running the Application

### Using Maven:

```bash
mvn spring-boot:run
```

### Using Java:

```bash
java -jar target/redis-spring-cache-0.0.1-SNAPSHOT.jar
```

## Configuration

The application uses the following Redis configuration (defined in `application.properties`):

```properties
redis.host=localhost
redis.port=6379
```

You can modify these values to connect to a different Redis instance.

## Usage

The application provides a `RedisService` class with the following methods:

### Setting a Value

```java

@Autowired
private RedisService redisService;

// Set a value with automatic 5-second expiration
redisService.

setValue("myKey","myValue");
```

### Getting a Value

```java
// Retrieve a value by key
Object value = redisService.getValue("myKey");
```

## Project Structure

```
src/
├── main/
│   ├── java/com/hendisantika/redisspringcache/
│   │   ├── RedisSpringCacheApplication.java  # Main application class
│   │   ├── AppConfig.java                    # Redis configuration
│   │   ├── RedisService.java                 # Redis operations service
│   │   └── MessageProducer.java              # Message producer (placeholder)
│   └── resources/
│       └── application.properties            # Application configuration
└── test/
    └── java/com/hendisantika/redisspringcache/
        └── RedisSpringCacheApplicationTests.java  # Integration tests
```

## Key Components

### AppConfig.java

Configures the Redis connection using Jedis and sets up the RedisTemplate for data operations.

### RedisService.java

Provides methods to interact with Redis:

- `setValue(key, value)`: Stores a value with a 5-second expiration
- `getValue(key)`: Retrieves a value by key

## Testing

Run the tests with:

```bash
mvn test
```

## Dependencies

Key dependencies used in this project:

- `spring-data-redis`: Spring Data abstraction for Redis
- `jedis (7.0.0)`: Redis Java client
- `spring-boot-starter`: Core Spring Boot starter
- `spring-boot-starter-test`: Testing dependencies including JUnit 5

## Troubleshooting

### Redis Connection Refused

If you see connection errors, ensure Redis is running:

```bash
redis-cli ping
```

### Build Errors

Ensure you're using Java 17 or higher:

```bash
java -version
```

## Author

- Name: Hendi Santika
- Email: hendisantika@gmail.com
- Telegram: @hendisantika34

## License

This project is open source and available for educational purposes.
