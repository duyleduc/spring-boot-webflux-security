# spring-boot-webflux-security

Configure your spring boot webflux security using authentication with authorization header

You could find my article at: https://medium.com/@ldduy1006/spring-webflux-security-configuration-28ac86423a42

- Start application
- Get token 

POST /authorize
- Body: 
````
{
  "username": "admin",
  "password: "password"
}
````
- Response: 
````
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOLFJPTEVfVVNFUiIsImV4cCI6MTUzMzc2MjM0M30.O_pUCQFWUGk9hOn-kSegjr5jHUK5rvYpHj-DRKQeEYdjp16Tu9L6yUfzesECEV9KUQDSC-SMQ5EVZ-PiqA6kFQ"
}
````
- Call WS with authorization header
GET /api/hello?name=world
````
Authorization: Bearer ${token}
````
- Result:
Hello world
