package cgd.pt.cgdintegrationtests.bootstrap;

import cgd.pt.cgdintegrationtests.model.Message;
import cgd.pt.cgdintegrationtests.service.MessageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private MessageService service;

    public DataLoader(MessageService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {
        if (service.findAll().size() == 0) {
            loadData();
        }
    }

    private void loadData() {
        service.save(new Message(1L, "Hello!"));
    }
}
