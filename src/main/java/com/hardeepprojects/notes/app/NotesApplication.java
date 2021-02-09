package com.hardeepprojects.notes.app;

import com.hardeepprojects.notes.rest.*;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@ApplicationPath("/rest")
public class NotesApplication extends Application{
    private Set<Object> singletons= new HashSet<>();

    public NotesApplication(){
        singletons.add(new NotesRestServices());
    }

    @Override
    public Set<Object> getSingletons(){
        return singletons;
    }

    @Override
    public Set<Class<?>> getClasses(){
        return super.getClasses();
    }

    @Override
    public Map<String, Object> getProperties(){
        return super.getProperties();
    }
}
