package security_sso.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDAO {

    List<Map<Object , Object>> getUsers();
}
