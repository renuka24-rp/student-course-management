# Use official Java image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy project files
COPY . .

# Build the project
RUN ./mvnw clean install -DskipTests

# Expose port
EXPOSE 8080

# Run the jar file
CMD ["java", "-jar", "target/student-course-management-0.0.1-SNAPSHOT.jar"]
