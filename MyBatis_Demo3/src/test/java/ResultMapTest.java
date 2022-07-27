import com.kaifeng.mybatis.mapper.EmpMapper;
import com.kaifeng.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class ResultMapTest {
    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        System.out.println(mapper.getEmpdept(1));
    }
}
