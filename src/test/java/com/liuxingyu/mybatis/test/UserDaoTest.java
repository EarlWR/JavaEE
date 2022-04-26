package com.liuxingyu.mybatis.test;

import com.liuxingyu.mybatis.dao.BookDao;
import com.liuxingyu.mybatis.dao.impl.BookDaoMyBatisImpl;
import com.liuxingyu.mybatis.entity.Book;
import org.junit.Test;

public class UserDaoTest {
    @Test
    public void testFindById()
    {
        BookDao bookDao=new BookDaoMyBatisImpl();
        Book book=bookDao.findById(21);
        System.out.println(book);
    }
    @Test
    public void testFindById2()
    {
        BookDao bookDao=new BookDaoMyBatisImpl();
        Book book=bookDao.findById2(21);
        System.out.println(book);
    }

}
