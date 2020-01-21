package cgd.pt.cgdintegrationtests.service.springdata;

import cgd.pt.cgdintegrationtests.model.Message;
import cgd.pt.cgdintegrationtests.repository.MessageRepository;
import cgd.pt.cgdintegrationtests.service.MessageService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MessageServiceImplTestMock {

    MessageRepository repository;

    MessageService service;

    @BeforeEach
    void setUp() {
        repository = mock(MessageRepository.class);
        service = new MessageServiceImpl(repository);
    }

    @Test
    void save() {

        when(repository.findById(2L)).thenReturn(Optional.of(new Message("Teste")));

        service.save(new Message(2L, "Teste"));
        Message msg = service.findById(2L);

        assertThat(msg.getMessage()).isEqualTo("Teste");
    }
}