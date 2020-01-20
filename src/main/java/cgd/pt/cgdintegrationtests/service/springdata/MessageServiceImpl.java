package cgd.pt.cgdintegrationtests.service.springdata;

import cgd.pt.cgdintegrationtests.model.Message;
import cgd.pt.cgdintegrationtests.repository.MessageRepository;
import cgd.pt.cgdintegrationtests.service.MessageService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile({"prod"})
public class MessageServiceImpl implements MessageService {

    private MessageRepository repository;

    public MessageServiceImpl(MessageRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<Message> findAll() {
        Set<Message> msgs = new HashSet<>();
        repository.findAll().forEach(msgs::add);
        return msgs;
    }

    @Override
    public Message findById(Long id) {
        return repository.findById(id).orElse(new Message());
    }

    @Override
    public Message save(Message object) {
        return repository.save(object);
    }

    @Override
    public void delete(Message object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        repository.deleteById(aLong);
    }
}
