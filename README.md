# SpringBootActuatorAndRestHATEOAS
This project demonstrates the usage of Spring Data REST and HATEOAS and also Spring Actuator.

Senza la creazione di un Controller o di alcun Service, le dipendenze di Spring Rest Data e Spring HATEOAS permettono la visualizzazione e le varie operazioni sulle entità, creando degli endpoint validi.

basta provare:
http://localhost:8080
http://localhost:8080/books
http://localhost:8080/books

Non essendoci controller, il database è pre-riempito usando un file data.sql inserito in /resources.

Inoltre, ho utilizzato Spring-Boot Actuator e i Docs di actuator per ottenere le info relative all'applicativo.
Per permettere un corretto utilizzo di actuator, anche senza inserire Spring Security, aggiungere nelle application.properties:

#info for Spring Boot Actuator
info.app.name=Spring Sample Application
info.app.description=Application to demonstrate Spring REST HATEOAS and Actuator
info.app.version=1.0.0
#disable Spring Security
management.security.enabled=false 

Attenzione alla versione del'actuator. Sono stato costretto a specificarla nel pom.xml altrimenti non funzionava l'actuator.
