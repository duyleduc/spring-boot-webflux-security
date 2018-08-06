# spring-boot-webflux-security

Configure your spring boot webflux security using authentication with authorization header

You could find my article at: 

> Start application
> To get token 
POST /authorize
Body: 
{
  "username": "admin",
  "password: "password"
}

> To Test ws with authorization header
GET /api/hello?name=world
Authorization: Bearer ${token}

Resultat:
Hello world
