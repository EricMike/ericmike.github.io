package com.hspedu.generic.homework;

import java.util.*;

/**
 * @author jacky
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class DAO<T> {
    private Map<String,T> map = new HashMap<>();

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        map.put(id,entity);
    }

    public List<T>list(){
        List<T>list = new ArrayList<>();
        Set<String> keySet = map.keySet();
        Set<Map.Entry<String, T>> entries = map.entrySet();
        Iterator<Map.Entry<String, T>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, T> next =  iterator.next();
            list.add(map.get(next.getKey()));
        }
//        for (String key :keySet) {
//            list.add(map.get(key));
//        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
    public void save(String id,T entity){
        map.put(id, entity);
    }
}

