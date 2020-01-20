package cgd.pt.cgdintegrationtests.service.map;

import cgd.pt.cgdintegrationtests.model.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MessageServiceImplMapTest {

    MessageServiceImplMap service;

    @BeforeEach
    void setUp() {
        service = new MessageServiceImplMap();
        service.save(new Message(1L, "Hello!"));
    }

    @Test
    void findById() {
        Message message = service.findById(1L);
        assertEquals(message.getMessage(), "Hello!");
    }
}