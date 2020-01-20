package cgd.pt.cgdintegrationtests.service.springdata;

import cgd.pt.cgdintegrationtests.model.Message;
import cgd.pt.cgdintegrationtests.service.MessageService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class MessageServiceImplTest {

    @Autowired
    MessageService service;

    @Test
    void save() {
        service.save(new Message(2L, "Teste"));

        Message msg = service.findById(2L);

        assertThat(msg.getMessage()).isEqualTo("Teste");
    }
}