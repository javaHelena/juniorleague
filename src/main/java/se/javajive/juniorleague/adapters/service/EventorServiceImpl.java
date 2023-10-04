package se.javajive.juniorleague.adapters.service;

import se.javajive.juniorleague.adapters.client.EventorClient;
import se.javajive.juniorleague.adapters.dto.RunnerDTO;
import se.javajive.juniorleague.ports.EventorService;

import java.util.List;

public class EventorServiceImpl implements EventorService {

    private final EventorClient eventorClient;

    public EventorServiceImpl(EventorClient eventorClient) {
        this.eventorClient = eventorClient;
    }


    @Override
    public List<RunnerDTO> fetchAllRunners() {
        return null;
    }
}
