package com.springcloud.service;

import com.sc.api.pojo.Dept;

import java.util.List;

/**
 * (Dept)表服务接口
 *
 * @author makejava
 * @since 2020-06-30 11:35:16
 */
public interface DeptService {

    /**
     * 通过ID查询单条数据
     *
     * @param deptno 主键
     * @return 实例对象
     */
    Dept queryById(Long deptno);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Dept> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    Dept insert(Dept dept);

    /**
     * 修改数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    Dept update(Dept dept);

    /**
     * 通过主键删除数据
     *
     * @param deptno 主键
     * @return 是否成功
     */
    boolean deleteById(Long deptno);

}