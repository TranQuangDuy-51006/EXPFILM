package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.CommentDTO;
import re.web_phim.entity.Comment;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public CommentDTO toDTO(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDTO.CommentDTOBuilder commentDTO = CommentDTO.builder();

        commentDTO.id( comment.getId() );
        commentDTO.user( userMapper.toDTO( comment.getUser() ) );
        commentDTO.content( comment.getContent() );
        commentDTO.isApproved( comment.getIsApproved() );
        commentDTO.isReported( comment.getIsReported() );
        commentDTO.likeCount( comment.getLikeCount() );
        commentDTO.createdAt( comment.getCreatedAt() );
        commentDTO.updatedAt( comment.getUpdatedAt() );

        return commentDTO.build();
    }

    @Override
    public Comment toEntity(CommentDTO commentDTO) {
        if ( commentDTO == null ) {
            return null;
        }

        Comment.CommentBuilder comment = Comment.builder();

        comment.id( commentDTO.getId() );
        comment.user( userMapper.toEntity( commentDTO.getUser() ) );
        comment.content( commentDTO.getContent() );
        comment.isApproved( commentDTO.getIsApproved() );
        comment.isReported( commentDTO.getIsReported() );
        comment.likeCount( commentDTO.getLikeCount() );
        comment.createdAt( commentDTO.getCreatedAt() );
        comment.updatedAt( commentDTO.getUpdatedAt() );

        return comment.build();
    }
}
