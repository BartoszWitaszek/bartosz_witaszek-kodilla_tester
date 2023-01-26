package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTestSuite {
    ForumStats forumStats;
    List<User> testUsers;

    @BeforeEach
    public void setUp() {
        forumStats = new ForumStats();
        testUsers = new ArrayList<>();
        testUsers.add(new User("T1", 25, 38, "G1"));
        testUsers.add(new User("T2", 45, 211, "G2"));
        testUsers.add(new User("T3", 41, 43, "G3"));
        testUsers.add(new User("T4", 20, 222, "G4"));
        testUsers.add(new User("T5", 50, 1578, "G5"));
    }

    @Test
    public void testAverageNumberOfPostsForUsersOverOrEqual40Years() {

        double averageNumberOfPosts = forumStats.averageNumberOfPostsForUsersOverOrEqual40Years(testUsers);

        assertEquals(610.666, averageNumberOfPosts, 0.001);
    }

    @Test
    public void testAverageNumberOfPostsForUsersUnder40Years() {

        double averageNumberOfPosts = forumStats.averageNumberOfPostsForUsersUnder40Years(testUsers);

        assertEquals(130, averageNumberOfPosts, 0.001);
    }
}