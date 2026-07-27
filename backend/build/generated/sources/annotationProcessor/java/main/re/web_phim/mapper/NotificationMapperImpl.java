package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.NotificationDTO;
import re.web_phim.entity.Notification;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class NotificationMapperImpl implements NotificationMapper {

    @Override
    public NotificationDTO toDTO(Notification notification) {
        if ( notification == null ) {
            return null;
        }

        NotificationDTO.NotificationDTOBuilder notificationDTO = NotificationDTO.builder();

        notificationDTO.id( notification.getId() );
        notificationDTO.title( notification.getTitle() );
        notificationDTO.message( notification.getMessage() );
        notificationDTO.type( notification.getType() );
        notificationDTO.isRead( notification.getIsRead() );
        notificationDTO.relatedMovieId( notification.getRelatedMovieId() );
        notificationDTO.createdAt( notification.getCreatedAt() );
        notificationDTO.updatedAt( notification.getUpdatedAt() );

        return notificationDTO.build();
    }

    @Override
    public Notification toEntity(NotificationDTO notificationDTO) {
        if ( notificationDTO == null ) {
            return null;
        }

        Notification.NotificationBuilder notification = Notification.builder();

        notification.id( notificationDTO.getId() );
        notification.title( notificationDTO.getTitle() );
        notification.message( notificationDTO.getMessage() );
        notification.type( notificationDTO.getType() );
        notification.isRead( notificationDTO.getIsRead() );
        notification.relatedMovieId( notificationDTO.getRelatedMovieId() );
        notification.createdAt( notificationDTO.getCreatedAt() );
        notification.updatedAt( notificationDTO.getUpdatedAt() );

        return notification.build();
    }
}
