# spring-boot-webflux-security

Configure your spring boot webflux security using authentication with authorization header

You could find my article at: https://medium.com/@ldduy1006/spring-webflux-security-configuration-28ac86423a42

> Start application
> Get token 
POST /authorize
Body: 
{
  "username": "admin",
  "password: "password"
}

> Call WS with authorization header
GET /api/hello?name=world
Authorization: Bearer ${token}

>> Resultat:
Hello world
