package re.web_phim.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import re.web_phim.dto.response.TransactionDTO;
import re.web_phim.entity.Transaction;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-07-10T16:09:00+0700",
    comments = "version: 1.5.5.Final, compiler: IncrementalProcessingEnvironment from gradle-java-compiler-worker-9.5.1.jar, environment: Java 21.0.11 (Microsoft)"
)
@Component
public class TransactionMapperImpl implements TransactionMapper {

    @Override
    public TransactionDTO toDTO(Transaction transaction) {
        if ( transaction == null ) {
            return null;
        }

        TransactionDTO.TransactionDTOBuilder transactionDTO = TransactionDTO.builder();

        transactionDTO.id( transaction.getId() );
        transactionDTO.transactionCode( transaction.getTransactionCode() );
        transactionDTO.amount( transaction.getAmount() );
        transactionDTO.paymentMethod( transaction.getPaymentMethod() );
        transactionDTO.status( transaction.getStatus() );
        transactionDTO.referenceId( transaction.getReferenceId() );
        transactionDTO.description( transaction.getDescription() );
        transactionDTO.startDate( transaction.getStartDate() );
        transactionDTO.endDate( transaction.getEndDate() );
        transactionDTO.createdAt( transaction.getCreatedAt() );
        transactionDTO.updatedAt( transaction.getUpdatedAt() );

        return transactionDTO.build();
    }

    @Override
    public Transaction toEntity(TransactionDTO transactionDTO) {
        if ( transactionDTO == null ) {
            return null;
        }

        Transaction.TransactionBuilder transaction = Transaction.builder();

        transaction.id( transactionDTO.getId() );
        transaction.transactionCode( transactionDTO.getTransactionCode() );
        transaction.amount( transactionDTO.getAmount() );
        transaction.paymentMethod( transactionDTO.getPaymentMethod() );
        transaction.status( transactionDTO.getStatus() );
        transaction.referenceId( transactionDTO.getReferenceId() );
        transaction.description( transactionDTO.getDescription() );
        transaction.startDate( transactionDTO.getStartDate() );
        transaction.endDate( transactionDTO.getEndDate() );
        transaction.createdAt( transactionDTO.getCreatedAt() );
        transaction.updatedAt( transactionDTO.getUpdatedAt() );

        return transaction.build();
    }
}
