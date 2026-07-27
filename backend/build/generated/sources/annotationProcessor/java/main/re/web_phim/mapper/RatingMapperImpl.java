package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.RatingDTO;
import re.web_phim.entity.Rating;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class RatingMapperImpl implements RatingMapper {

    @Override
    public RatingDTO toDTO(Rating rating) {
        if ( rating == null ) {
            return null;
        }

        RatingDTO.RatingDTOBuilder ratingDTO = RatingDTO.builder();

        ratingDTO.id( rating.getId() );
        ratingDTO.rating( rating.getRating() );
        ratingDTO.review( rating.getReview() );
        ratingDTO.createdAt( rating.getCreatedAt() );
        ratingDTO.updatedAt( rating.getUpdatedAt() );

        return ratingDTO.build();
    }

    @Override
    public Rating toEntity(RatingDTO ratingDTO) {
        if ( ratingDTO == null ) {
            return null;
        }

        Rating.RatingBuilder rating = Rating.builder();

        rating.id( ratingDTO.getId() );
        rating.rating( ratingDTO.getRating() );
        rating.review( ratingDTO.getReview() );
        rating.createdAt( ratingDTO.getCreatedAt() );
        rating.updatedAt( ratingDTO.getUpdatedAt() );

        return rating.build();
    }
}
