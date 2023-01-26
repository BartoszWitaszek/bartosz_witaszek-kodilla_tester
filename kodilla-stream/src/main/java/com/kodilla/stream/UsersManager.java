package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<User> ageGroupUsers = filterUsersOlderThanAge(40);
        System.out.println(ageGroupUsers);
        List<User> usersWithHigherNumberOfPosts = filterUsersWithNumberOfPostsHigherThanGivenNumber(5);
        System.out.println(usersWithHigherNumberOfPosts);
    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static List<User> filterUsersOlderThanAge(int age) {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());

        return users;
    }

    public static List<User> filterUsersWithNumberOfPostsHigherThanGivenNumber(int numberOfPosts) {
        List<User> users = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > numberOfPosts)
                .collect(Collectors.toList());

        return users;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}