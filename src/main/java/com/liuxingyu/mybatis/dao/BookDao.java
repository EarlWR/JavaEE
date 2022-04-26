package com.liuxingyu.mybatis.dao;

import com.liuxingyu.mybatis.entity.Book;

public interface BookDao {
    Book findById(int id);
    Book findById2(int id);
}
