package se.javajive.juniorleague.core;

import io.micronaut.data.annotation.Id;
import lombok.Value;

@Value
public class Runner {
    @Id
    Long id;
    String name;
    String organizationId;
}
