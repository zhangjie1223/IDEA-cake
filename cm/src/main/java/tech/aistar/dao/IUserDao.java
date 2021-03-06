package tech.aistar.dao;

import tech.aistar.entity.User;

/**
 * 用户的业务接口
 * 接口是一个契约,规定了主要完成的功能,但是不关注具体怎么去是实现.
 * */
public interface IUserDao {
    /**
     * 保存用户
     * @param user
     */
    void save(User user);

    /**
     * 根据id进行删除操作.
     * @param id
     */
    void delById(Integer id);

}
