package com.java8.optional;


import java.util.Optional;

/**
 * Optional 类 使用
 */
public class TestOptional1 {

    UserDao userDao = new UserDao();



        public User getUserById(String userId) {
            if(userId != null) {
                return userDao.findById(userId);
            } else {
                return null;
            }
        }

        public User getUserById1(String userId) {
            return Optional.ofNullable(userId)
                    .map(id->userDao.findById(id))
                    .orElse(null);
        }

    public static String getName(User u) {
        if (u == null)
            return "Unknown";
        return u.name;
    }

    public static String getName1(User u) {
        return Optional.ofNullable(u)
                .map(x->x.name)
                .orElse("Unknown");
    }


}
