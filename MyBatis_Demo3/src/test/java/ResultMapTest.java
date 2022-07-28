import com.kaifeng.mybatis.mapper.DeptMapper;
import com.kaifeng.mybatis.mapper.DynamicSqlMapper;
import com.kaifeng.mybatis.mapper.EmpMapper;
import com.kaifeng.mybatis.pojo.Emp;
import com.kaifeng.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
        System.out.println(mapper.getEmpByCondition(new Emp(null, "张三", null, "男", "zhangsan@test.com")));
    }
}
