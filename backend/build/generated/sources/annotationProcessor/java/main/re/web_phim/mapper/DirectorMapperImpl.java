package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.DirectorDTO;
import re.web_phim.entity.Director;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class DirectorMapperImpl implements DirectorMapper {

    @Override
    public DirectorDTO toDTO(Director director) {
        if ( director == null ) {
            return null;
        }

        DirectorDTO.DirectorDTOBuilder directorDTO = DirectorDTO.builder();

        directorDTO.id( director.getId() );
        directorDTO.name( director.getName() );
        directorDTO.slug( director.getSlug() );
        directorDTO.bio( director.getBio() );
        directorDTO.profileImage( director.getProfileImage() );
        directorDTO.dateOfBirth( director.getDateOfBirth() );
        directorDTO.placeOfBirth( director.getPlaceOfBirth() );
        directorDTO.createdAt( director.getCreatedAt() );
        directorDTO.updatedAt( director.getUpdatedAt() );

        return directorDTO.build();
    }

    @Override
    public Director toEntity(DirectorDTO directorDTO) {
        if ( directorDTO == null ) {
            return null;
        }

        Director.DirectorBuilder director = Director.builder();

        director.id( directorDTO.getId() );
        director.name( directorDTO.getName() );
        director.slug( directorDTO.getSlug() );
        director.bio( directorDTO.getBio() );
        director.profileImage( directorDTO.getProfileImage() );
        director.dateOfBirth( directorDTO.getDateOfBirth() );
        director.placeOfBirth( directorDTO.getPlaceOfBirth() );
        director.createdAt( directorDTO.getCreatedAt() );
        director.updatedAt( directorDTO.getUpdatedAt() );

        return director.build();
    }
}
