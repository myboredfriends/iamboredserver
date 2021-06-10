package de.mangolimona.iambored.iamboredserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IamboredserverApplication {
    private Phonebook phonebook = new Phonebook();

    public static void main(String[] args) {

        SpringApplication.run(IamboredserverApplication.class, args);
    }

    @GetMapping("/register-friend")
    public String registerFriend(@RequestParam String id) {
        phonebook.addFriend(new Friend(id));
        return String.format("Registered Friend: \"%s\"",id);
    }

    @GetMapping("/get-friend")
    public String getFriend(@RequestParam String id) {
        if (phonebook.hasFriend(new Friend(id))) {
            return String.format("Friend: %s is %s", id, phonebook.howIsFriend(new Friend(id)));
        }
        return "404 Friend not found";

    }

    @GetMapping("/unregister-friend")
    public String unregisterFriend(@RequestParam String id) {
        if (phonebook.hasFriend(new Friend(id))) {
            phonebook.removeFriend(new Friend(id));
            return String.format("Unregistered Friend: \"%s\"",id);
        }
        return "404 Friend not found";
    }

    @GetMapping("/update-status")
    public String updateStatus (@RequestParam String id) {
        if (phonebook.hasFriend(new Friend(id))) {
            phonebook.iamBored(new Friend(id));
            return String.format("Updated Friend to be bored: \"%s\"",id);
        }
        return "404 Friend not found";
    }
}
