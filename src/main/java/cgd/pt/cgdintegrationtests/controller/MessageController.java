package cgd.pt.cgdintegrationtests.controller;

import cgd.pt.cgdintegrationtests.model.Message;
import cgd.pt.cgdintegrationtests.service.MessageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @GetMapping
    public String hello() {
        Message message = service.findById(1L);
        return message.getMessage();
    }
}
