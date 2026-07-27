package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.GenreDTO;
import re.web_phim.entity.Genre;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class GenreMapperImpl implements GenreMapper {

    @Override
    public GenreDTO toDTO(Genre genre) {
        if ( genre == null ) {
            return null;
        }

        GenreDTO.GenreDTOBuilder genreDTO = GenreDTO.builder();

        genreDTO.id( genre.getId() );
        genreDTO.name( genre.getName() );
        genreDTO.slug( genre.getSlug() );
        genreDTO.description( genre.getDescription() );
        genreDTO.createdAt( genre.getCreatedAt() );
        genreDTO.updatedAt( genre.getUpdatedAt() );

        return genreDTO.build();
    }

    @Override
    public Genre toEntity(GenreDTO genreDTO) {
        if ( genreDTO == null ) {
            return null;
        }

        Genre.GenreBuilder genre = Genre.builder();

        genre.id( genreDTO.getId() );
        genre.name( genreDTO.getName() );
        genre.slug( genreDTO.getSlug() );
        genre.description( genreDTO.getDescription() );
        genre.createdAt( genreDTO.getCreatedAt() );
        genre.updatedAt( genreDTO.getUpdatedAt() );

        return genre.build();
    }
}
