package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.WatchlistDTO;
import re.web_phim.entity.Watchlist;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class WatchlistMapperImpl implements WatchlistMapper {

    @Autowired
    private MovieMapper movieMapper;

    @Override
    public WatchlistDTO toDTO(Watchlist watchlist) {
        if ( watchlist == null ) {
            return null;
        }

        WatchlistDTO.WatchlistDTOBuilder watchlistDTO = WatchlistDTO.builder();

        watchlistDTO.id( watchlist.getId() );
        watchlistDTO.movie( movieMapper.toDTO( watchlist.getMovie() ) );
        watchlistDTO.createdAt( watchlist.getCreatedAt() );

        return watchlistDTO.build();
    }

    @Override
    public Watchlist toEntity(WatchlistDTO watchlistDTO) {
        if ( watchlistDTO == null ) {
            return null;
        }

        Watchlist.WatchlistBuilder watchlist = Watchlist.builder();

        watchlist.id( watchlistDTO.getId() );
        watchlist.movie( movieMapper.toEntity( watchlistDTO.getMovie() ) );
        watchlist.createdAt( watchlistDTO.getCreatedAt() );

        return watchlist.build();
    }
}
