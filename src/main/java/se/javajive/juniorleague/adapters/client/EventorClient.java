package se.javajive.juniorleague.adapters.client;


import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.client.annotation.Client;

import java.time.LocalDate;


@Client("https://eventor.orientering.se/api")
public interface EventorClient {

    @Get("/persons/organisations/{organisationId}")
    //@Header(name = "ApiKey", value = "${eventor.api-key}")
    @Header(name = "ApiKey", value = "b05deb67157844d8bfd1f341555d70f2")
    HttpResponse<String> getRunners(String organisationId);

//    String apiKey = "b05deb67157844d8bfd1f341555d70f2";
//    String uri = "https://eventor.orientering.se";
//    @Get("/persons/organisations/{organisationId}")
//    List<Runner> getRunners(String organisationId, HttpHeaders headers);

    @Get("/results/person?personId={loparEventorId}&fromDate={from}&toDate={to}")
    HttpResponse<String> getResults(String loparEventorId, LocalDate from, LocalDate to, HttpHeaders headers);

    @Get("/event/{eventId}")
    HttpResponse<String> getCompetition(String eventId, HttpHeaders headers);
}
