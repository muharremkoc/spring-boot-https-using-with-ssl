# spring-boot-https-using-with-ssl



This Project's goal,Using HTTPS protocol with self-signed licence in Spring Boot

---

## Using

- Spring Boot DevTools
- Spring Boot Web
- Lombok
- Spring Data-JPA
- H2 database
- MapStruct
- Custom SSL


---
## Installation

- First,open CMd or PowerShell terminal(Run with Adminstrator(Optional)

- Second,Check the keytool, if there is a keytool, go to the 3rd step. If not, please install the keytool.

- Third,Please enter this code in Terminal and start SSL install 

```bash
keytool -genkeypair -alias http-ssl -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore http-ssl.p12 -validity 365 -ext san=dns:localhost
```

- Fourth,You can make these adjustments according to your own

```bash
Enter keystore password:
Re-enter new password:
What is your first and last name?
  [Unknown]:  Muharrem Koc
What is the name of your organizational unit?
  [Unknown]:  Technology
What is the name of your organization?
  [Unknown]:  Techonology
What is the name of your City or Locality?
  [Unknown]:  Turkey
What is the name of your State or Province?
  [Unknown]:  SVS
What is the two-letter country code for this unit?
  [Unknown]:  TR
```
- Fifth,Write yes and finish SSL setup

```bash
Is CN=Muharrem Koc, OU=Technology, O=Technology, L=Turkey, ST=SVS, C=TR correct? 
  [no]:  yes 
```
-Last,Copy this certificate in your project/src/main/resources

---


[Muharrem Koç](https://github.com/muharremkoc)
