package com.neusoft;

import com.neusoft.domain.Emp;
import com.neusoft.utils.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 查询emp中所有的数据
 */
public class JDBCDemo6 {
    public static void main(String[] args) throws Exception {
//        List<Emp> empList = findAll();
        List<Emp> empList = findAll2();
        for (Emp e : empList) {
            System.out.println(e);
        }
    }

    // List<Emp> <>代表泛型的意思， 就是对存储数据的类型做限制
    public static List<Emp> findAll() throws Exception {

        // 多态写法： 父类引用指向子类对象
        // 声明一个list 存储所有emp对象
        List<Emp> list = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://" +
                "localhost:3306/jiangkeda", "root", "root");
        String sql = "select * from emp";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int empno = rs.getInt(1);
            String eName = rs.getString(2);
            String job = rs.getString(3);
            int mgr = rs.getInt(4);
            Date hiredata = rs.getDate(5);
            int sal = rs.getInt(6);
            int comm = rs.getInt(7);
            int deptno = rs.getInt(8);
            Emp emp = new Emp(empno, eName, job, mgr, hiredata, sal, comm, deptno);
            list.add(emp);
        }
        //        8、释放资源
        stmt.close();
        conn.close();
        return list;
    }

    // 调用JDBCUtils 工具类进行操作
    public static List<Emp> findAll2() throws Exception {
        List<Emp> list = new ArrayList<>();
        Connection conn = JDBCUtils.getConnection();
        String sql = "select * from emp";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()) {
            int empno = rs.getIn t(1);
            String eName = rs.getString(2);
            String job = rs.getString(3);
            int mgr = rs.getInt(4);
            Date hiredata = rs.getDate(5);
            int sal = rs.getInt(6);
            int comm = rs.getInt(7);
            int deptno = rs.getInt(8);
            Emp emp = new Emp(empno, eName, job, mgr, hiredata, sal, comm, deptno);
            list.add(emp);
        }
        JDBCUtils.close(rs, stmt, conn);
        return list;
    }
}
