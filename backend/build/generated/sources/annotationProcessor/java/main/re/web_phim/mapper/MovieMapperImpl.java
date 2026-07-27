package re.web_phim.mapper;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.ActorDTO;
import re.web_phim.dto.response.DirectorDTO;
import re.web_phim.dto.response.GenreDTO;
import re.web_phim.dto.response.MovieDTO;
import re.web_phim.entity.Actor;
import re.web_phim.entity.Director;
import re.web_phim.entity.Genre;
import re.web_phim.entity.Movie;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class MovieMapperImpl implements MovieMapper {

    @Autowired
    private GenreMapper genreMapper;
    @Autowired
    private ActorMapper actorMapper;
    @Autowired
    private DirectorMapper directorMapper;

    @Override
    public MovieDTO toDTO(Movie movie) {
        if ( movie == null ) {
            return null;
        }

        MovieDTO.MovieDTOBuilder movieDTO = MovieDTO.builder();

        movieDTO.id( movie.getId() );
        movieDTO.title( movie.getTitle() );
        movieDTO.slug( movie.getSlug() );
        movieDTO.description( movie.getDescription() );
        movieDTO.poster( movie.getPoster() );
        movieDTO.trailerUrl( movie.getTrailerUrl() );
        movieDTO.backdrop( movie.getBackdrop() );
        movieDTO.releaseDate( movie.getReleaseDate() );
        movieDTO.country( movie.getCountry() );
        movieDTO.duration( movie.getDuration() );
        movieDTO.language( movie.getLanguage() );
        movieDTO.rating( movie.getRating() );
        movieDTO.banner( movie.getBanner() );
        movieDTO.isActive( movie.getIsActive() );
        movieDTO.viewCount( movie.getViewCount() );
        movieDTO.genres( genreSetToGenreDTOSet( movie.getGenres() ) );
        movieDTO.actors( actorSetToActorDTOSet( movie.getActors() ) );
        movieDTO.directors( directorSetToDirectorDTOSet( movie.getDirectors() ) );
        movieDTO.createdAt( movie.getCreatedAt() );
        movieDTO.updatedAt( movie.getUpdatedAt() );

        return movieDTO.build();
    }

    @Override
    public Movie toEntity(MovieDTO movieDTO) {
        if ( movieDTO == null ) {
            return null;
        }

        Movie.MovieBuilder movie = Movie.builder();

        movie.id( movieDTO.getId() );
        movie.title( movieDTO.getTitle() );
        movie.slug( movieDTO.getSlug() );
        movie.description( movieDTO.getDescription() );
        movie.poster( movieDTO.getPoster() );
        movie.trailerUrl( movieDTO.getTrailerUrl() );
        movie.backdrop( movieDTO.getBackdrop() );
        movie.releaseDate( movieDTO.getReleaseDate() );
        movie.country( movieDTO.getCountry() );
        movie.duration( movieDTO.getDuration() );
        movie.language( movieDTO.getLanguage() );
        movie.rating( movieDTO.getRating() );
        movie.banner( movieDTO.getBanner() );
        movie.isActive( movieDTO.getIsActive() );
        movie.viewCount( movieDTO.getViewCount() );
        movie.genres( genreDTOSetToGenreSet( movieDTO.getGenres() ) );
        movie.actors( actorDTOSetToActorSet( movieDTO.getActors() ) );
        movie.directors( directorDTOSetToDirectorSet( movieDTO.getDirectors() ) );
        movie.createdAt( movieDTO.getCreatedAt() );
        movie.updatedAt( movieDTO.getUpdatedAt() );

        return movie.build();
    }

    protected Set<GenreDTO> genreSetToGenreDTOSet(Set<Genre> set) {
        if ( set == null ) {
            return null;
        }

        Set<GenreDTO> set1 = new LinkedHashSet<GenreDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Genre genre : set ) {
            set1.add( genreMapper.toDTO( genre ) );
        }

        return set1;
    }

    protected Set<ActorDTO> actorSetToActorDTOSet(Set<Actor> set) {
        if ( set == null ) {
            return null;
        }

        Set<ActorDTO> set1 = new LinkedHashSet<ActorDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Actor actor : set ) {
            set1.add( actorMapper.toDTO( actor ) );
        }

        return set1;
    }

    protected Set<DirectorDTO> directorSetToDirectorDTOSet(Set<Director> set) {
        if ( set == null ) {
            return null;
        }

        Set<DirectorDTO> set1 = new LinkedHashSet<DirectorDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Director director : set ) {
            set1.add( directorMapper.toDTO( director ) );
        }

        return set1;
    }

    protected Set<Genre> genreDTOSetToGenreSet(Set<GenreDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Genre> set1 = new LinkedHashSet<Genre>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( GenreDTO genreDTO : set ) {
            set1.add( genreMapper.toEntity( genreDTO ) );
        }

        return set1;
    }

    protected Set<Actor> actorDTOSetToActorSet(Set<ActorDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Actor> set1 = new LinkedHashSet<Actor>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( ActorDTO actorDTO : set ) {
            set1.add( actorMapper.toEntity( actorDTO ) );
        }

        return set1;
    }

    protected Set<Director> directorDTOSetToDirectorSet(Set<DirectorDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Director> set1 = new LinkedHashSet<Director>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( DirectorDTO directorDTO : set ) {
            set1.add( directorMapper.toEntity( directorDTO ) );
        }

        return set1;
    }
}
