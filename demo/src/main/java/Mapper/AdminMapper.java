package Mapper;

import Model.domain.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

// 继承了BaseMapper，就可以直接操作数据库了
// BaseMapper < T > 指定了对哪个数据类型进行map （我们）
@Repository
public interface AdminMapper extends BaseMapper<Admin> {

}
