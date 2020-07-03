package com.springcloud.dao;

import com.sc.api.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (Dept)表数据库访问层
 *
 * @author makejava
 * @since 2020-06-30 11:30:39
 */
@Mapper
@Repository
public interface DeptDao {

    /**
     * 通过ID查询单条数据
     *
     * @param deptno 主键
     * @return 实例对象
     */
    Dept queryById(Long deptno);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Dept> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dept 实例对象
     * @return 对象列表
     */
    List<Dept> queryAll(Dept dept);

    /**
     * 新增数据
     *
     * @param dept 实例对象
     * @return 影响行数
     */
    int insert(Dept dept);

    /**
     * 修改数据
     *
     * @param dept 实例对象
     * @return 影响行数
     */
    int update(Dept dept);

    /**
     * 通过主键删除数据
     *
     * @param deptno 主键
     * @return 影响行数
     */
    int deleteById(Long deptno);

}