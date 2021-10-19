package td2.composite.forum.v1;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final String topic;
    private List<Theme> children;

    public Forum(String topic) {
        this.topic = topic;
        this.children = new ArrayList<>();
    }

    public String sujet(){
        return this.topic;
    }

    public void add(Theme child){
        this.children.add(child);
    }

    public void remove(Integer index){
        this.children.remove(index);
    }

    public Integer size(){
        return this.children.size();
    }

    @Override
    public String toString() {
        return "Forum{" +
                "topic='" + topic + '\'' +
                '}';
    }
}
