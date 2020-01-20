package cgd.pt.cgdintegrationtests.model;

import javax.persistence.Entity;

@Entity
public class Message extends BaseEntity {

    private String message;

    public Message() {
    }

    public Message(Long id, String message) {
        super.setId(id);
        this.message = message;
    }

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
