package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {
        ForumStats forumStats = new ForumStats();
        System.out.println("Average number of posts for users under 40 years: " + forumStats.averageNumberOfPostsForUsersUnder40Years(UsersRepository.getUsersList()));
        System.out.println("Average number of posts for users over or equal to 40 years: " + forumStats.averageNumberOfPostsForUsersOverOrEqual40Years(UsersRepository.getUsersList()));
    }

    public double averageNumberOfPostsForUsersOverOrEqual40Years(List<User> users) {
        double average = users
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
        return average;
    }

    public double averageNumberOfPostsForUsersUnder40Years(List<User> users) {
        double average = users
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .getAsDouble();
        return average;
    }
}
