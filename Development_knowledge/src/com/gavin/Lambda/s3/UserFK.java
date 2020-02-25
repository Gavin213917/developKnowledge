package com.gavin.Lambda.s3;

import com.gavin.Lambda.jdbc.User;

@FunctionalInterface
public interface UserFK {

	User test(String username,String password);
}
