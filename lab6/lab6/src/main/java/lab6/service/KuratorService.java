package lab6.service;

import lab6.entity.Kurator;

public interface KuratorService extends Service<Kurator> {

    Kurator readByName(String name);

    Kurator readByphone(String name);

}
