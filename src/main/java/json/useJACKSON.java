package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class useJACKSON {
    public static void main(String[] args) {
        Cat cat = new Cat();

        String json = null;
        Cat cat1 = null;
        cat.setId(1L);
        cat.setName("SiAm");
        cat.setColor("Cream");
        cat.setEyecolor("Blue");
        cat.setBreed("Siamese");
        NestObj1 obj1 = new NestObj1();
        obj1.setName("obj1 Name");
        NestObj2 obj2 = new NestObj2();
        obj2.setName("obj2 Name");
        cat.setObj1(obj1);
        cat.setObj2(obj2);
        //cat.setCert(bytesRoot);
        ObjectMapper mapper = new ObjectMapper();
        try {
            json = mapper.writeValueAsString(cat);
            System.out.println("ResultingJSONstring = " + json);
            //System.out.println(json);
            cat1 = mapper.readValue(json, Cat.class);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(cat1.getObj1().getName());

    }
}

class NestObj1 {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class NestObj2 {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Cat {
    private Long id;
    private String name;
    private String color;
    private String eyecolor;
    private String breed;
    private NestObj1 obj1;
    private NestObj2 obj2;

    public Cat() {

    }

    public Cat(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public NestObj1 getObj1() {
        return obj1;
    }

    public void setObj1(NestObj1 obj1) {
        this.obj1 = obj1;
    }

    public NestObj2 getObj2() {
        return obj2;
    }

    public void setObj2(NestObj2 obj2) {
        this.obj2 = obj2;
    }

    // Getters & Setters
    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name +
                '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

