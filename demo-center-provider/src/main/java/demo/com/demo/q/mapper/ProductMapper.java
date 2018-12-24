package demo.com.demo.q.mapper;

import demo.com.demo.q.domain.eo.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by donh on 2018/7/24.
 */
@Mapper
public interface ProductMapper {

    //使用xml的方式
    Product getById(Integer id);

}
