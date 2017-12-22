package tk.mybatis.mapper.test;

import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.mapper.mapper.MybatisHelper;

/**
 * TODO 多表之间的关系只做查询而不做任何update的操作
 * <p>
 * 级联关系维护在vo上，实体类只维护本表的字段
 * <p>
 * 做法：修改ms来：本质添加原来在xml配置文件所生成的部分动态添加到mapper方法中的
 * 实例中
 * 为每一个实体类注册ResultMap,默认是全字段都有
 * <p>
 * TODO 设置实体类全字段的进行动态插入（使用拦截器实现）
 */
public class HelloTest {


    @Test
    public void test() {
        SqlSession session = MybatisHelper.getSqlSession();
        Configuration configuration = session.getConfiguration();
        MetaObject metaObject = SystemMetaObject.forObject(configuration);
        Object resultMaps = metaObject.getValue("resultMaps");
        System.out.println(resultMaps);
//        Collection<MappedStatement> mappedStatements = configuration.getMappedStatements();
//        for (MappedStatement mappedStatement : mappedStatements) {
//            String id = mappedStatement.getId();
//            List<ResultMap> resultMaps = mappedStatement.getResultMaps();
//            System.out.println(resultMaps);
//        }


    }

}
