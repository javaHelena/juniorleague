package se.javajive.juniorleague.ports;

import se.javajive.juniorleague.adapters.dto.RunnerDTO;
import java.util.List;

public interface RunnerPort {
    List<RunnerDTO> fetchRunners(Long organisationId);
}