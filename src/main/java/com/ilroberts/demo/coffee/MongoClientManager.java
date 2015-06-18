package com.ilroberts.demo.coffee;

import com.mongodb.MongoClient;
import com.yammer.dropwizard.lifecycle.Managed;
import org.eclipse.jetty.util.component.LifeCycle;

/**
 * Created by iwanroberts on 17/06/15.
 */
public class MongoClientManager implements Managed {
    private final MongoClient mongoClient;

    public MongoClientManager(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    @Override
    public void start() throws Exception {

    }

    @Override
    public void stop() throws Exception {
        mongoClient.close();
    }
}
