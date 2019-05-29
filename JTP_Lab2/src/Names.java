import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Names {
    private List<String> names;
    private Random generator;
    public Names() {
        names = new ArrayList<String>();
        generator = new Random();
    }

    public void addName(String name){
        this.names.add(name);
    }

    public String choose(){
        int index = generator.nextInt(names.size() - 1) + 1;
        return this.names.get(index);
    }
}
