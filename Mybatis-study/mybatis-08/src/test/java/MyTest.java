import com.liu.dao.BlogMapper;
import com.liu.pojo.Blog;
import com.liu.utils.IDutils;
import com.liu.utils.MybatisUtils;
import lombok.Data;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {
    @Test
     public void addInitBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getID());
        blog.setTitle("Mybatis如此简单");
        blog.setCreateTime(new Date());
        blog.setAuthor("刘说");

        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.close();
    }
    @Test
   public void queryBlogIF(){
       SqlSession sqlSession = MybatisUtils.getSqlSession();
       BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
       HashMap map = new HashMap();
       map.put("title","Spring");
       //map.put("author","远方说");
       List<Blog> blogs = mapper.queryBlogIF(map);
       for (Blog blog : blogs) {
          System.out.println(blog);
       }
       sqlSession.close();
    }
    @Test
    public void queryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        //map.put("title","Spring");
        map.put("author","远方说2");
        map.put("views",9999);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","Mybatis如此简单2");
        map.put("author","远方说2");
        map.put("id","a7ae31a9.ac59.431e.9194.56e2d9709bec");
        mapper.updateBlog(map);

        sqlSession.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);


        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}
