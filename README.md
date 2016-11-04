Sample spring-boot with spring security and jersey project which illustrates issues
with authentication.

Steps:
  * Clone the repository
  * run using ```./gradlew bootrun```
  * curl the ```/status``` endpoint as follows: ```curl -XGET http://localhost:8080/v1/status -v --user user:{key_from_startup}```
    
    
 The third step should return a ```401``` status code instead it returns a ```404```.
 
    
