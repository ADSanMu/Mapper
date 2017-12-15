package tk.mybatis.mapper.test;

import org.junit.Test;
import tk.mybatis.mapper.mapper.MybatisHelper;
import tk.mybatis.mapper.mapperhelper.SqlHelper;
import tk.mybatis.mapper.model.Country;

public class HelloTest {


    @Test
    public void test() {
        MybatisHelper.getSqlSession();
        String s = SqlHelper.wherePKColumns(Country.class);
        System.out.println(s);
    }

}
