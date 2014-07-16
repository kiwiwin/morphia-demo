package org.kiwi.morphia;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class UserTest extends MorphiaBaseTest {
    @Test
    public void should_get_user_contact() {
        final User user = new User("kiwi", new Contact("chengdu", "028-83003008"));

        datastore.save(user);

        final User userFromDb = datastore.get(User.class, user.getId());
        assertThat(userFromDb.getName(), is("kiwi"));
        assertThat(userFromDb.getContact().getLocation(), is("chengdu"));
        assertThat(userFromDb.getContact().getPhoneNumber(), is("028-83003008"));
    }

    @Test
    public void should_get_user_car() {
        final Car car = new Car("SC0404", 10000, "BMW");
        datastore.save(car);

        final User user = new User("kiwi", new Contact("chengdu", "028-83003008"));
        datastore.save(user);

        user.addCar(car);
        datastore.save(user);

        final User userFromDb = datastore.get(User.class, user.getId());
        assertThat(userFromDb.getCar().getCarNumber(), is("SC0404"));
        assertThat(userFromDb.getCar().getBrand(), is("BMW"));
        assertThat(userFromDb.getCar().getPrice(), is(10000));
    }
}
