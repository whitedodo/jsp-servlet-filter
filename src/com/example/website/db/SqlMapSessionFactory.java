/*
 * 프로젝트명(Project Name): MyBatis(iBatis) Factory
 * 작성일자(Create Date): 2020-11-07
 * 작성(Author): Dodo (rabbit.white at daum dot net)
 * 파일명(Filename): SqlMapSessionFactory.java
 * 비고(Description):
 * 
 */
package com.example.website.db;

import java.io.IOException;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;

import org.apache.ibatis.session.SqlSessionFactory;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapSessionFactory {

	public static SqlSessionFactory ssf;

    static{

        String resource = "com/example/website/db/mybatis-config.xml";
        InputStream inputStream = null;

        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ssf = new SqlSessionFactoryBuilder().build(inputStream);

    }

    public static SqlSessionFactory getSqlSessionFactory(){
    	return ssf;
    }

}