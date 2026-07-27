package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.SubscriptionDTO;
import re.web_phim.entity.Subscription;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:08:59+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class SubscriptionMapperImpl implements SubscriptionMapper {

    @Override
    public SubscriptionDTO toDTO(Subscription subscription) {
        if ( subscription == null ) {
            return null;
        }

        SubscriptionDTO.SubscriptionDTOBuilder subscriptionDTO = SubscriptionDTO.builder();

        subscriptionDTO.id( subscription.getId() );
        subscriptionDTO.name( subscription.getName() );
        subscriptionDTO.slug( subscription.getSlug() );
        subscriptionDTO.description( subscription.getDescription() );
        subscriptionDTO.price( subscription.getPrice() );
        subscriptionDTO.durationDays( subscription.getDurationDays() );
        subscriptionDTO.maxDevices( subscription.getMaxDevices() );
        subscriptionDTO.maxQuality( subscription.getMaxQuality() );
        subscriptionDTO.isActive( subscription.getIsActive() );
        subscriptionDTO.createdAt( subscription.getCreatedAt() );
        subscriptionDTO.updatedAt( subscription.getUpdatedAt() );

        return subscriptionDTO.build();
    }

    @Override
    public Subscription toEntity(SubscriptionDTO subscriptionDTO) {
        if ( subscriptionDTO == null ) {
            return null;
        }

        Subscription.SubscriptionBuilder subscription = Subscription.builder();

        subscription.id( subscriptionDTO.getId() );
        subscription.name( subscriptionDTO.getName() );
        subscription.slug( subscriptionDTO.getSlug() );
        subscription.description( subscriptionDTO.getDescription() );
        subscription.price( subscriptionDTO.getPrice() );
        subscription.durationDays( subscriptionDTO.getDurationDays() );
        subscription.maxDevices( subscriptionDTO.getMaxDevices() );
        subscription.maxQuality( subscriptionDTO.getMaxQuality() );
        subscription.isActive( subscriptionDTO.getIsActive() );
        subscription.createdAt( subscriptionDTO.getCreatedAt() );
        subscription.updatedAt( subscriptionDTO.getUpdatedAt() );

        return subscription.build();
    }
}
