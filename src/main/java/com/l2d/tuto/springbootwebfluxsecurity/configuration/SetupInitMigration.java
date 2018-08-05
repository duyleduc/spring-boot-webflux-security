package com.l2d.tuto.springbootwebfluxsecurity.configuration;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.l2d.tuto.springbootwebfluxsecurity.security.AuthoritiesConstants;
import com.l2d.tuto.springbootwebfluxsecurity.user.domain.Authority;
import com.l2d.tuto.springbootwebfluxsecurity.user.domain.User;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author duc-d
 */
@ChangeLog(order = "001")
public class SetupInitMigration {

    @ChangeSet(order = "01", author = "initiator", id = "01-addAuthorities")
    public void addAuthorities(MongoTemplate mongoTemplate) {
        Authority adminAuthority = new Authority();
        adminAuthority.setName(AuthoritiesConstants.ADMIN);
        Authority userAuthority = new Authority();
        userAuthority.setName(AuthoritiesConstants.USER);
        mongoTemplate.save(adminAuthority);
        mongoTemplate.save(userAuthority);
    }

    @ChangeSet(order = "02", author = "initiator", id = "02-addUsers")
    public void addUsers(MongoTemplate mongoTemplate) {
        Authority adminAuthority = new Authority();
        adminAuthority.setName(AuthoritiesConstants.ADMIN);
        Authority userAuthority = new Authority();
        userAuthority.setName(AuthoritiesConstants.USER);

        User adminUser = new User();
        adminUser.setLogin("admin");
        adminUser.setPassword("$2a$10$MYkP3aeSQy7DI.qgk4noreZ5uchb0i61OOeWu2tVHAO1yNSsGqCVG"); // password: password
        adminUser.getAuthorities().add(adminAuthority);
        adminUser.getAuthorities().add(userAuthority);

        User aprilonUser = new User();
        aprilonUser.setLogin("user");
        aprilonUser.setPassword("$2a$10$MYkP3aeSQy7DI.qgk4noreZ5uchb0i61OOeWu2tVHAO1yNSsGqCVG"); // password: password
        aprilonUser.getAuthorities().add(userAuthority);

        mongoTemplate.save(adminUser);
        mongoTemplate.save(aprilonUser);
    }
}
