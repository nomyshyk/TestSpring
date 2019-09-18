package kg.test.my.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyService implements  MyInterface{
    static List<String> arrayList = new ArrayList<>();

    @Override
    public String insert(String name) {
        arrayList.add(name);
        return name;
    }

    @Override
    public String findByName(String name) {

        for(String s: arrayList){
            if(s.equalsIgnoreCase(name)){
                return name;

            }
        }
        return "not found, sorry";
    }

    @Override
    public List<String> getAll() {
        return arrayList;
    }
}
