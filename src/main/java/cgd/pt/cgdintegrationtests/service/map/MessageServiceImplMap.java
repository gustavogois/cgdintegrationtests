package cgd.pt.cgdintegrationtests.service.map;

import cgd.pt.cgdintegrationtests.model.Message;
import cgd.pt.cgdintegrationtests.service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImplMap extends AbstractMapService<Message, Long> implements MessageService {

    public Message findById(Long id) {
        return super.findById(id);
    }
}
