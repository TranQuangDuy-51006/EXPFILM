package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.WatchHistoryDTO;
import re.web_phim.entity.WatchHistory;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class WatchHistoryMapperImpl implements WatchHistoryMapper {

    @Override
    public WatchHistoryDTO toDTO(WatchHistory watchHistory) {
        if ( watchHistory == null ) {
            return null;
        }

        WatchHistoryDTO.WatchHistoryDTOBuilder watchHistoryDTO = WatchHistoryDTO.builder();

        watchHistoryDTO.id( watchHistory.getId() );
        watchHistoryDTO.watchedDuration( watchHistory.getWatchedDuration() );
        watchHistoryDTO.totalDuration( watchHistory.getTotalDuration() );
        watchHistoryDTO.watchPercentage( watchHistory.getWatchPercentage() );
        watchHistoryDTO.lastWatchedAt( watchHistory.getLastWatchedAt() );
        watchHistoryDTO.createdAt( watchHistory.getCreatedAt() );
        watchHistoryDTO.updatedAt( watchHistory.getUpdatedAt() );

        return watchHistoryDTO.build();
    }

    @Override
    public WatchHistory toEntity(WatchHistoryDTO watchHistoryDTO) {
        if ( watchHistoryDTO == null ) {
            return null;
        }

        WatchHistory.WatchHistoryBuilder watchHistory = WatchHistory.builder();

        watchHistory.id( watchHistoryDTO.getId() );
        watchHistory.watchedDuration( watchHistoryDTO.getWatchedDuration() );
        watchHistory.totalDuration( watchHistoryDTO.getTotalDuration() );
        watchHistory.watchPercentage( watchHistoryDTO.getWatchPercentage() );
        watchHistory.lastWatchedAt( watchHistoryDTO.getLastWatchedAt() );
        watchHistory.createdAt( watchHistoryDTO.getCreatedAt() );
        watchHistory.updatedAt( watchHistoryDTO.getUpdatedAt() );

        return watchHistory.build();
    }
}
