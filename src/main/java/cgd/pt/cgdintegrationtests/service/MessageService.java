package cgd.pt.cgdintegrationtests.service;

import cgd.pt.cgdintegrationtests.model.Message;

public interface MessageService extends CrudService<Message, Long> {

    Message findById(Long id);
}
