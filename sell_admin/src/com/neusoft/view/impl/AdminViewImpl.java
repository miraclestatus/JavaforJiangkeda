package com.neusoft.view.impl;

import com.neusoft.dao.AdminDao;
import com.neusoft.dao.impl.AdminDaoImpl;
import com.neusoft.domain.Admin;
import com.neusoft.view.AdminView;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class AdminViewImpl implements AdminView {
   private Scanner input =  new Scanner(System.in);
    @Override
    public Admin login() {
        System.out.println("请输入用户名");
        String adminName = input.next();
        System.out.println("请输入密码");
        String password = input.next();
        AdminDao dao = new AdminDaoImpl();
        Admin admin = dao.getAdminByNameAndPassword(adminName, password);
        return admin;
    }
}
