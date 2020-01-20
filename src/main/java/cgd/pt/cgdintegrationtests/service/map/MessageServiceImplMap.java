package cgd.pt.cgdintegrationtests.service.map;

import cgd.pt.cgdintegrationtests.model.Message;
import cgd.pt.cgdintegrationtests.service.MessageService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"dev"})
@Primary
public class MessageServiceImplMap extends AbstractMapService<Message, Long> implements MessageService {

    public Message findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Set<Message> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Message object) {
        super.delete(object);
    }

    @Override
    public Message save(Message object) {
        return super.save(object);
    }
}
