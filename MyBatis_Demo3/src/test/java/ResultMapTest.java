import com.kaifeng.mybatis.mapper.DeptMapper;
import com.kaifeng.mybatis.mapper.DynamicSqlMapper;
import com.kaifeng.mybatis.mapper.EmpMapper;
import com.kaifeng.mybatis.pojo.Emp;
import com.kaifeng.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultMapTest {
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        System.out.println(mapper.getEmpAndDeptSepOne(1));
    }

    @Test
    public void test2(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        System.out.println(mapper.getDeptAndEmpByStepOne(1));
    }

    @Test
    public void test3(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSqlMapper mapper = sqlSession.getMapper(DynamicSqlMapper.class);
        Emp e1 = new Emp(null, "e1", 23, "男", "a1@test.com", null);
        Emp e2 = new Emp(null, "e2", 21, "男", "a2@test.com", null);
        Emp e3 = new Emp(null, "e3", 25, "女", "a3@test.com", null);
        List<Emp> l = Arrays.asList(e1, e2, e3);
        System.out.println(mapper.getEmpByCondition(new Emp(null, "张三", null, "", "")));
    }
}
