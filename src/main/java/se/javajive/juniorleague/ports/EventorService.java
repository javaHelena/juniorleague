package se.javajive.juniorleague.ports;


import se.javajive.juniorleague.adapters.dto.RunnerDTO;

import java.util.List;

public interface EventorService {
    List<RunnerDTO> fetchAllRunners();
}
