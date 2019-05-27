package lab6.service;

import lab6.entity.Group;

public interface GroupService extends Service<Group> {

	Group readByName(String name);

}
