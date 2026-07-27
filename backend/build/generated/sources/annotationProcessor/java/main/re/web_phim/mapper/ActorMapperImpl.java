package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.ActorDTO;
import re.web_phim.entity.Actor;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class ActorMapperImpl implements ActorMapper {

    @Override
    public ActorDTO toDTO(Actor actor) {
        if ( actor == null ) {
            return null;
        }

        ActorDTO.ActorDTOBuilder actorDTO = ActorDTO.builder();

        actorDTO.id( actor.getId() );
        actorDTO.name( actor.getName() );
        actorDTO.slug( actor.getSlug() );
        actorDTO.bio( actor.getBio() );
        actorDTO.profileImage( actor.getProfileImage() );
        actorDTO.dateOfBirth( actor.getDateOfBirth() );
        actorDTO.placeOfBirth( actor.getPlaceOfBirth() );
        actorDTO.createdAt( actor.getCreatedAt() );
        actorDTO.updatedAt( actor.getUpdatedAt() );

        return actorDTO.build();
    }

    @Override
    public Actor toEntity(ActorDTO actorDTO) {
        if ( actorDTO == null ) {
            return null;
        }

        Actor.ActorBuilder actor = Actor.builder();

        actor.id( actorDTO.getId() );
        actor.name( actorDTO.getName() );
        actor.slug( actorDTO.getSlug() );
        actor.bio( actorDTO.getBio() );
        actor.profileImage( actorDTO.getProfileImage() );
        actor.dateOfBirth( actorDTO.getDateOfBirth() );
        actor.placeOfBirth( actorDTO.getPlaceOfBirth() );
        actor.createdAt( actorDTO.getCreatedAt() );
        actor.updatedAt( actorDTO.getUpdatedAt() );

        return actor.build();
    }
}
