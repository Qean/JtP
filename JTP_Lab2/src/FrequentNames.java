import java.util.*;

public class FrequentNames {
    Map <String, Integer> frequentNames;
    Set <String> nameList;
    public FrequentNames() {
        frequentNames = new TreeMap<>();
        nameList = new HashSet<>();
    }
    public String choose(){
        if (this.frequentNames.isEmpty())
            return "End";
        Integer count = 0;
        Integer max = 0;
        String chosen = null;
        for (String name: nameList) {
            count = this.frequentNames.get(name);
            if (count > max) {
                max = count;
                chosen = name;
            }
        }
        this.frequentNames.remove(chosen);
        this.nameList.remove(chosen);
        return chosen;
    }
    public String insert(String name){
        int count;
        if (frequentNames.containsKey(name))
            count = this.frequentNames.get(name);
        else count = 0;
        this.frequentNames.put(name, count + 1);
        this.nameList.add(name);
        return name;
    }
}
