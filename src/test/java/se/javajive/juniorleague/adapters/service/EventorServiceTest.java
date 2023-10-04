//package se.javajive.juniorleague.adapters.service;
//
//import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
//import io.micronaut.http.client.annotation.Client;
//import io.micronaut.http.client.MockClient;
//import org.junit.jupiter.api.Test;
//
//import static io.micronaut.http.HttpRequest.GET;
//import static io.micronaut.http.HttpResponse.ok;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//import static org.mockito.Mockito.when;
//
//@MicronautTest
//public class EventorServiceTest {
//
//    @Inject
//    @Client("/")
//    MockClient client;
//
//    @Inject
//    EventorServiceImpl service;
//
//    @Test
//    void testFetchRunners() {
//        when(client.toBlocking().exchange(GET("/persons/organisations/123"), List.class))
//                .thenReturn(ok(Collections.singletonList(new RunnerDTO(/* your mock data here */))));
//
//        List<RunnerDTO> runners = service.fetchRunnersByOrganisationId(123L);
//
//        assertNotNull(runners);
//        // your additional assertions here
//    }
//}
