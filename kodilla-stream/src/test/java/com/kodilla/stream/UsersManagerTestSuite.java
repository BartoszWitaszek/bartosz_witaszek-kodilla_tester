package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTestSuite {

    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> resultUsernames = UsersManager.filterChemistGroupUsernames();

        List<String> usernames = new ArrayList<>();
        usernames.add("Walter White");
        usernames.add("Gale Boetticher");
        assertEquals(usernames, resultUsernames);
    }

    @Test
    public void testFilterUsersOlderThanAge() {
        List<User> resultUsers = UsersManager.filterUsersOlderThanAge(49);

        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Mike Ehrmantraut", 57, 0, "Security"));
        assertEquals(users, resultUsers);
    }

    @Test
    public void testFilterUsersWithNumberOfPostsHigherThanGivenNumber() {
        List<User> resultUsers = UsersManager.filterUsersWithNumberOfPostsHigherThanGivenNumber(5);

        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        assertEquals(users, resultUsers);
    }
}