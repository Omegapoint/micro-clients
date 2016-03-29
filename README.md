# Micro Service Workshop. Cool Stuff.

## Kompilera och starta
```sh
git clone https://github.com/Omegapoint/micro-clients.git
```
```sh
cd micro-clients
```
```sh
mvn clean && mvn package && java -Dserver.port=<PORT> -jar target/channel-0.0.1-SNAPSHOT.jar
(Kom ihåg att ändra port)
```

-> Öppna http://localhost:#PORT#/channelInfo i webläsaren

## Uppgit 1: Ändra channelInfo
* Lägg till gruppdeltagarnas namn i channelInfo. 
 (Tips: kolla i InfoController.java)
* Ändra Kanalnamnet (både i InfoController.java och i application.yml)
* Starta om...

Kolla resultatet i http://localhost:#PORT#/channelInfo

## Uppgift 2: Registrera din micro service
* Lägg till @EnableEurekaClient i ChannelApplication.java
* Ändra ip-address i application.yml (i resource-mappen)
* Ändra eureka client enabled till true i application.yml
* Ändra spring applicatio name till gruppnamnet (tv...) i application.yml
* Starta om...
* Syns din tv-kanal på projektorn?

## Uppgift 3: Returnera dina tv-program
* Börja med att kolla i ShowController.java. Försök hitta vilket Repotirory som används för att hämta information om tv-program.
* När du hittat rätt klass (obs, det finns hjälpkommentarer i koden) lägger du till några tv-program och returnerar dessa. T.ex i en passande ArrayList.
* Tips: kolla in funktionen detailedShowToShow för att konvertera från DetailedShow till Show-objekt
* Starta om...
* Syns dina program på projektorn?

## Uppgift 4: Returnera infornation om ett enskilt tv-program
* Implementera så att /showDetails?id=<ID> returnerar detaljerad information om ett tv-program med id = <ID>.
* Fråga om hjälp om ni fastnar. 
* Starta om...
* Testa genom att klicka på ett program. 

## (BONUS!) Uppgift 5: Skapa endpoint för att lägga till tv-program
* Skapa en POST endpoint för att lägga till nya Show-objekt
