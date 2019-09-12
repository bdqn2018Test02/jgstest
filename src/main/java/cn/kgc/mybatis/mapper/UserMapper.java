package cn.kgc.mybatis.mapper;

import cn.kgc.mybatis.bean.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created with IDEA
 * author:bdqn kgc zhou qi chao
 * Date:2019/8/28
 * Time:15:50
 */
public interface UserMapper {

    /**
     * 查询记录数
     * @return
     */
    public Integer getUserCount();

    /**
     * 查询所有
     * @return
     */
    public List<User> getUserList();
}
