package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.EpisodeDTO;
import re.web_phim.entity.Episode;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class EpisodeMapperImpl implements EpisodeMapper {

    @Override
    public EpisodeDTO toDTO(Episode episode) {
        if ( episode == null ) {
            return null;
        }

        EpisodeDTO.EpisodeDTOBuilder episodeDTO = EpisodeDTO.builder();

        episodeDTO.id( episode.getId() );
        episodeDTO.episodeNumber( episode.getEpisodeNumber() );
        episodeDTO.title( episode.getTitle() );
        episodeDTO.description( episode.getDescription() );
        episodeDTO.duration( episode.getDuration() );
        episodeDTO.videoUrl( episode.getVideoUrl() );
        episodeDTO.m3u8Url( episode.getM3u8Url() );
        episodeDTO.thumbnail( episode.getThumbnail() );
        episodeDTO.isActive( episode.getIsActive() );
        episodeDTO.createdAt( episode.getCreatedAt() );
        episodeDTO.updatedAt( episode.getUpdatedAt() );

        return episodeDTO.build();
    }

    @Override
    public Episode toEntity(EpisodeDTO episodeDTO) {
        if ( episodeDTO == null ) {
            return null;
        }

        Episode.EpisodeBuilder episode = Episode.builder();

        episode.id( episodeDTO.getId() );
        episode.episodeNumber( episodeDTO.getEpisodeNumber() );
        episode.title( episodeDTO.getTitle() );
        episode.description( episodeDTO.getDescription() );
        episode.duration( episodeDTO.getDuration() );
        episode.videoUrl( episodeDTO.getVideoUrl() );
        episode.m3u8Url( episodeDTO.getM3u8Url() );
        episode.thumbnail( episodeDTO.getThumbnail() );
        episode.isActive( episodeDTO.getIsActive() );
        episode.createdAt( episodeDTO.getCreatedAt() );
        episode.updatedAt( episodeDTO.getUpdatedAt() );

        return episode.build();
    }
}
