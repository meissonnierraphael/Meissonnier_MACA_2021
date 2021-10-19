package td2.composite.forum.v1;

public class Message {

    private final String topic;
    private final String contenu;

    public Message(String topic, String contenu){

        this.topic = topic;
        this.contenu = contenu;
    }

    public String sujet(){
        return this.topic;
    }

    @Override
    public String toString() {
        return "Message{" +
                "topic='" + topic + '\'' +
                ", contenu='" + contenu + '\'' +
                '}';
    }
}
