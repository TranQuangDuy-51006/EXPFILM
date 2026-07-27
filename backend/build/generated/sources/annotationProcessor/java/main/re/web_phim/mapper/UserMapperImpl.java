package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.SubscriptionDTO;
import re.web_phim.dto.response.UserDTO;
import re.web_phim.entity.Subscription;
import re.web_phim.entity.User;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDTO toDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO.UserDTOBuilder userDTO = UserDTO.builder();

        userDTO.roles( rolesToStrings( user.getRoles() ) );
        userDTO.subscription( subscriptionToSubscriptionDTO( user.getSubscription() ) );
        userDTO.id( user.getId() );
        userDTO.username( user.getUsername() );
        userDTO.email( user.getEmail() );
        userDTO.fullName( user.getFullName() );
        userDTO.avatar( user.getAvatar() );
        userDTO.dateOfBirth( user.getDateOfBirth() );
        userDTO.gender( user.getGender() );
        userDTO.phone( user.getPhone() );
        userDTO.bio( user.getBio() );
        userDTO.isActive( user.getIsActive() );
        userDTO.emailVerified( user.getEmailVerified() );
        userDTO.twoFAEnabled( user.getTwoFAEnabled() );
        userDTO.createdAt( user.getCreatedAt() );
        userDTO.updatedAt( user.getUpdatedAt() );

        return userDTO.build();
    }

    @Override
    public User toEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.roles( stringsToRoles( userDTO.getRoles() ) );
        user.id( userDTO.getId() );
        user.username( userDTO.getUsername() );
        user.email( userDTO.getEmail() );
        user.fullName( userDTO.getFullName() );
        user.avatar( userDTO.getAvatar() );
        user.dateOfBirth( userDTO.getDateOfBirth() );
        user.gender( userDTO.getGender() );
        user.phone( userDTO.getPhone() );
        user.bio( userDTO.getBio() );
        user.isActive( userDTO.getIsActive() );
        user.emailVerified( userDTO.getEmailVerified() );
        user.twoFAEnabled( userDTO.getTwoFAEnabled() );
        user.subscription( subscriptionDTOToSubscription( userDTO.getSubscription() ) );
        user.createdAt( userDTO.getCreatedAt() );
        user.updatedAt( userDTO.getUpdatedAt() );

        return user.build();
    }

    protected SubscriptionDTO subscriptionToSubscriptionDTO(Subscription subscription) {
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

    protected Subscription subscriptionDTOToSubscription(SubscriptionDTO subscriptionDTO) {
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
