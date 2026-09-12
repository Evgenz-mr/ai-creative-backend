# AI Creative Backend

Spring Boot API for the AI Creative Director portfolio and Kubernetes/Argo CD lab.

## Local run

```bash
./mvnw spring-boot:run
```

Health endpoints:
- `/actuator/health/liveness`
- `/actuator/health/readiness`

API endpoints:
- `GET /api/v1/profile`
- `GET /api/v1/projects`

The service is prepared for containerized deployment, Helm and GitOps. PostgreSQL support will be added behind configuration without changing the public API.
