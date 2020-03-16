package com.restfb.types;
import static java.util.Collections.unmodifiableList;

import com.restfb.*;

import java.util.*;
public class Driver {
    
	//This is a test
	
	
	private static String token = "EAAGXWjmdBVoBAJmBRE7Afz2isHwRS5wCqtbevTQdFKErhOLZBRiM6rVovf4DUOX1TY577xiumgjP385TznSmL1hG2ea3qOsFH4BoYEWtyk8Q6VZCYPUNjutvqwhYFTba62n1cycrE2lq6eYzGEtouLCG9sZCvgxAJZATbzvjjGGnlpthz4CRarpWj9dQ4Op8pjB2IIRlBH8vqeKBgeFqT2WgR0Jka1MgKocO868BewZDZD";



    public static void main(String[] args) {
        FacebookClient facebookClient = new DefaultFacebookClient();
        
	    Connection<Post> myFeed = facebookClient.fetchConnection("me/feed", Post.class);
        
		
		// Connections support paging and are iterable

        User user = facebookClient.fetchObject("me", User.class);
        Page page = facebookClient.fetchObject("cocacola", Page.class, 
                         Parameter.with("fields", "fan_count"));

        System.out.println("User name: " + user.getName());
        System.out.println("Page likes: " + page.getFanCount());

    }






}
