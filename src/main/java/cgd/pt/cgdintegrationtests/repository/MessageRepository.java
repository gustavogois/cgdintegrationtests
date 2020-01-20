package cgd.pt.cgdintegrationtests.repository;

import cgd.pt.cgdintegrationtests.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
