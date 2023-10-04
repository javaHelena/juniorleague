package se.javajive.juniorleague.adapters.client;

import io.micronaut.http.HttpResponse;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@MicronautTest
public class EventorClientTest {

    public static final String ORGANISATION_ID = "198";

    @Inject
    EventorClient eventorClient;

    @Test
    void testFetchData() {
        HttpResponse<String> response = eventorClient.getRunners(ORGANISATION_ID);

        System.out.println(response.body()  + " " + response.status().getCode() );
        // Assert status code
        assertEquals(200, response.status().getCode());

        // Assert response body
        assertNotNull(response.body());
    }
}
