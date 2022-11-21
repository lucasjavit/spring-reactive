package com.lucasit.servletapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

//
//    @Test
//    void test() {
//
//        User user = new User(null, "user", "user@user.com.br", "123456");
//
//        User postResponse = testRestTemplate.postForObject("/users", user, User.class);
//
//        assertNotNull(postResponse.id());
//        assertEquals(user.username(), postResponse.username());
//        assertEquals(user.password(), postResponse.password());
//
//        User[] getResponse = testRestTemplate.getForObject("/users", User[].class);
//
//        assertNotNull(getResponse[0].id());
//        assertEquals(user.username(), getResponse[0].username());
//        assertEquals(user.password(), getResponse[0].password());
//    }

}