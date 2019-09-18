package kg.test.my.service;

import java.util.List;

public interface MyInterface {
    String insert(String name);
    String findByName(String name);
    List<String> getAll();
}
