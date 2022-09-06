package org.meroot;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import org.meroot.model.User;

public class SomeMapping {

	public static void main(String[] args) {

		User sarah = new User("Sarah");
		User james = new User("James");
		User mary = new User("Mary");
		User john = new User("John");
		
		List<User> users = List.of(sarah, james, mary, john);
		List<String> names = new ArrayList<>();
		Function<User, String> toName = (User user) -> user.getName(); //userların get name ıle namelerı cekmesı saglıyor
		for (User user : users) {
			String name = toName.apply(user);
			names.add(name);
		}
		users.forEach(user -> System.out.println(user));
		Consumer<String> action = string -> System.out.println(string); // consumerların aksıyonu alıuor
		names.forEach(action);
	}

}
