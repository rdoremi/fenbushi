package com.springcloud.service.impl;

import com.sc.api.pojo.Dept;
import com.springcloud.dao.DeptDao;
import com.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dept)表服务实现类
 *
 * @author makejava
 * @since 2020-06-30 11:35:18
 */
@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao deptDao;

    /**
     * 通过ID查询单条数据
     *
     * @param deptno 主键
     * @return 实例对象
     */
    @Override
    public Dept queryById(Long deptno) {
        System.out.println(deptno);
        return this.deptDao.queryById(deptno);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Dept> queryAllByLimit(int offset, int limit) {
        return this.deptDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    @Override
    public Dept insert(Dept dept) {
        this.deptDao.insert(dept);
        return dept;
    }

    /**
     * 修改数据
     *
     * @param dept 实例对象
     * @return 实例对象
     */
    @Override
    public Dept update(Dept dept) {
        this.deptDao.update(dept);
        return this.queryById(dept.getDeptno());
    }

    /**
     * 通过主键删除数据
     *
     * @param deptno 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long deptno) {
        return this.deptDao.deleteById(deptno) > 0;
    }
}