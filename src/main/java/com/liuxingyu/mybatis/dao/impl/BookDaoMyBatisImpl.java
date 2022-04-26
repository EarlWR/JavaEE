package com.liuxingyu.mybatis.dao.impl;

import com.liuxingyu.mybatis.Util.MybatisUtil;
import com.liuxingyu.mybatis.dao.BookDao;
import com.liuxingyu.mybatis.entity.Book;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class BookDaoMyBatisImpl implements BookDao {
    @Override
    public Book findById(int id) {
        SqlSession sqlSession = null;
        Book ans=new Book();
        try {
            sqlSession = MybatisUtil.getSqlSession();
            ans = sqlSession.selectOne("com.liuxingyu.mybatis.dao.BookDao.findById",id);
            sqlSession.commit();
            return ans;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (sqlSession!=null)
            sqlSession.close();
        }
        return null;
    }

    @Override
    public Book findById2(int id) {
        SqlSession sqlSession = null;
        Book ans=new Book();
        try {
            sqlSession = MybatisUtil.getSqlSession();
            ans = sqlSession.selectOne("com.liuxingyu.mybatis.dao.BookDao.findById2",id);
            sqlSession.commit();
            return ans;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (sqlSession!=null)
                sqlSession.close();
        }
        return null;
    }
}
