package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.AdvertisementDTO;
import re.web_phim.entity.Advertisement;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class AdvertisementMapperImpl implements AdvertisementMapper {

    @Override
    public AdvertisementDTO toDTO(Advertisement advertisement) {
        if ( advertisement == null ) {
            return null;
        }

        AdvertisementDTO.AdvertisementDTOBuilder advertisementDTO = AdvertisementDTO.builder();

        advertisementDTO.id( advertisement.getId() );
        advertisementDTO.title( advertisement.getTitle() );
        advertisementDTO.description( advertisement.getDescription() );
        advertisementDTO.imageUrl( advertisement.getImageUrl() );
        advertisementDTO.videoUrl( advertisement.getVideoUrl() );
        advertisementDTO.targetUrl( advertisement.getTargetUrl() );
        advertisementDTO.type( advertisement.getType() );
        advertisementDTO.duration( advertisement.getDuration() );
        advertisementDTO.position( advertisement.getPosition() );
        advertisementDTO.displayCount( advertisement.getDisplayCount() );
        advertisementDTO.clickCount( advertisement.getClickCount() );
        advertisementDTO.isActive( advertisement.getIsActive() );
        advertisementDTO.startDate( advertisement.getStartDate() );
        advertisementDTO.endDate( advertisement.getEndDate() );
        advertisementDTO.createdAt( advertisement.getCreatedAt() );
        advertisementDTO.updatedAt( advertisement.getUpdatedAt() );

        return advertisementDTO.build();
    }

    @Override
    public Advertisement toEntity(AdvertisementDTO advertisementDTO) {
        if ( advertisementDTO == null ) {
            return null;
        }

        Advertisement.AdvertisementBuilder advertisement = Advertisement.builder();

        advertisement.id( advertisementDTO.getId() );
        advertisement.title( advertisementDTO.getTitle() );
        advertisement.description( advertisementDTO.getDescription() );
        advertisement.imageUrl( advertisementDTO.getImageUrl() );
        advertisement.videoUrl( advertisementDTO.getVideoUrl() );
        advertisement.targetUrl( advertisementDTO.getTargetUrl() );
        advertisement.type( advertisementDTO.getType() );
        advertisement.duration( advertisementDTO.getDuration() );
        advertisement.position( advertisementDTO.getPosition() );
        advertisement.displayCount( advertisementDTO.getDisplayCount() );
        advertisement.clickCount( advertisementDTO.getClickCount() );
        advertisement.isActive( advertisementDTO.getIsActive() );
        advertisement.startDate( advertisementDTO.getStartDate() );
        advertisement.endDate( advertisementDTO.getEndDate() );
        advertisement.createdAt( advertisementDTO.getCreatedAt() );
        advertisement.updatedAt( advertisementDTO.getUpdatedAt() );

        return advertisement.build();
    }
}
