package td2.composite.forum.v1;

import td2.composite.forum.v1.Salon;

import java.util.ArrayList;
import java.util.List;

public class Theme {

    private final String topic;
    private List<Salon> children;

    public Theme(String topic){
        this.topic=topic;
        this.children = new ArrayList<>();
    }

    public String sujet(){
        return this.topic;
    }

    public void add(Salon child){
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
        return "Theme{" +
                "topic='" + topic + '\'' +
                '}';
    }
}
