package com.ilroberts.demo.coffee;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;

@Path("/coffeeshop")
@Produces(MediaType.APPLICATION_JSON)
public class CoffeeShopResource {
    private Datastore datastore;

    public CoffeeShopResource(final MongoClient mongoClient) {
        datastore = new Morphia().createDatastore(mongoClient,"cafelito");
    }

    public CoffeeShopResource() {

    }

    @Path("/order")
    @POST()
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveOrder(Order order) {
        datastore.save(order);
        return Response.created(URI.create(order.getId())).entity(order).build();
    }

}
