# Micro Service Workshop. Cool Stuff.

## Kompilera och starta
```sh
git clone https://github.com/Omegapoint/micro-clients.git
git checkout umejug
```
Byt till rätt directory
```sh
cd micro-clients/channel
```
Bygg och starta tjänsten
```sh
mvn spring-boot:run -Dserver.port=8080
```
eller
```sh
mvn clean && mvn package && java -Dserver.port=8080 -jar target/channel-0.0.1-SNAPSHOT.jar
```

-> Öppna http://localhost:8080/channelInfo i webläsaren

## Uppgift 1: Ändra kanalinformation

Channel info används för att returnera information kanalen. Uppgiften går helt enkelt ut på att modifiera informationen till er egen.

* Lägg till gruppdeltagarnas namn i channelInfo.
 (Tips: kolla i InfoController.java)
* Ändra Kanalnamnet (både i InfoController.java och i application.yml)
* Starta om!

-> Öppna http://localhost:8080/channelInfo i webläsaren

Kolla resultatet i http://localhost:8080/channelInfo

## Uppgift 2: Registrera din micro service

För att din mikrotjänst ska kunna upptäckas av servern måste den registrera sig hos service discovery-tjänsten. Service discovery (SD) är en term som används inom micro service-världen, och det går ut på att klienterna vid uppstart registrerar vilken typ av applikation den är och vad den har för ip-address hos en SD-server. På så vis kan mikrotjänsterna hitta varandra genom att fråga SD-servern var den kan hitta en viss typ av tjänst.

* Lägg till @EnableEurekaClient i ChannelApplication.java. Detta är en annotation som genom SpringBoot-magi kommmer att registrera er mikrotjänst hos SD-servern. För att det ska fungera behövs två saker, ip-addressen till SD-servern samt information om vilken typ av tjänst som registreras. Här används ert kanalnamn för detta.
* Ändra ip-addressen i application.yml (specificerar var SD-servern finns)
* Ändra eureka client enabled till true i application.yml (berättar för applikationen att den är en mikrotjänst som ska registrera sig hos SD-servern)
* Ändra spring application name till ert gruppnamn (tv###) i application.yml (berättar vilken typ av mikrotjänst som registreras)
* Starta om!
* Syns din tv-kanal på projektorn?

## Uppgift 3: Returnera dina tv-program

Nu är din mikrotjänst registrerad och redo att börja returnera data. Den här uppgiften går ut på att ändra koden till att returnera information om de tv-program som sänds på kanalen. Genom att öppna http://localhost8080/shows i webbläsaren ser ni vilka program som returneras (Obs, innan ni gjort klart uppgiften returneras ett felmeddelande).

* Börja med att kolla i ShowController.java. Försök hitta vilket Repository som används för att hämta information om tv-program.
* När du hittat rätt klass (obs, det finns hjälpkommentarer i koden) lägger du till några tv-program och returnerar dessa. T.ex i en passande ArrayList (detailedShowList).
* Tips: kolla in funktionen detailedShowToShow för att konvertera från DetailedShow till Show-objekt
* Starta om!
* Syns dina program på projektorn?

## Uppgift 4: Returnera information om ett enskilt tv-program

När man klickar på ett program i listan skall detaljerad information om programmet visas. För att det ska fungera behövs ny funktionalitet implementeras:

* Implementera så att /showDetails?id=#ID# returnerar detaljerad information om ett tv-program med id = #ID#.
* Fråga om hjälp om ni fastnar.
* Starta om!
* Testa genom att klicka på ett program.

## Uppgift 5: Hämta och returnera vidare information om antal tittare

Antalet tittare just nu kommer att visas tillsammans med programansvariga. Det finns en service som tillhandahåller den informationen, *stat-server*. Implementera en endpoint i InfoController.java som anropar *stat-server*. Görs lämpligt vis via en service på samma sätt som ShowController använder
ShowService.
1. Använd EurekaClient för att få tag på en url till stat-server (enpoint:en ser ut så här: *viewers?channelId={id}*)
2. Använd RestTemplate för att göra själva anropet

## Uppgift 6: Hantera långsam och opålitlig service
Tyvärr är *stat-server* lite opålitlig och ofta satt under hög last, vidta åtgärder så att er kanaltjänst inte drabbas om statistiktjänsten går trögt eller fel.

Netflix  [Hystrix](http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html) ger ett bra skydd mot långsamma och opålitliga externa tjänster.

När ni har lagt på Hystrix runt anropet till den extrerna statisktjänsten så är det dags att slå på Hystrix Dashboarden (@EnableHystrixDashboard i ChannelApplication)

Surfa till http://localhost:8080/hystrix ange *http://localhost:8080/hystrix.stream* som som stream i det översta input-fältet, de nedre kan ni skippa.
