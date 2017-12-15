package tk.mybatis.mapper.test;

import org.junit.Test;
import tk.mybatis.mapper.mapper.MybatisHelper;
import tk.mybatis.mapper.mapperhelper.SqlHelper;
import tk.mybatis.mapper.model.Country;

/**
 * TODO 多表之间的关系只做查询而不做任何update的操作
 *
 *  级联关系维护在vo上，实体类只维护本表的字段
 *
 *  做法：修改ms来：本质添加原来在xml配置文件所生成的部分动态添加到mapper方法中的
 *  实例中
 *
 */
public class HelloTest {


    @Test
    public void test() {
        MybatisHelper.getSqlSession();
        String s = SqlHelper.wherePKColumns(Country.class);
        System.out.println(s);
    }

}
