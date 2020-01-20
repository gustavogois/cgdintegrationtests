package cgd.pt.cgdintegrationtests.service;

import cgd.pt.cgdintegrationtests.model.Message;

public interface MessageService {

    Message findById(Long id);
}
