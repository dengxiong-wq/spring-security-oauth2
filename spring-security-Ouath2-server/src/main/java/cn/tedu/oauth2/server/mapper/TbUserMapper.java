package cn.tedu.oauth2.server.mapper;

import cn.tedu.oauth2.server.domain.TbUser;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.MyMapper;


@Mapper
public interface TbUserMapper extends MyMapper<TbUser> {

}