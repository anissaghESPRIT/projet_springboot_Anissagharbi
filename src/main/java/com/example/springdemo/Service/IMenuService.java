package com.example.springdemo.Service;

import com.example.springdemo.entities.Menu;

import java.util.List;

public interface IMenuService {
    Menu createMenu(Menu menu);
    Menu updateMenu(Long id, Menu menu);
    void deleteMenu(Long id);
    Menu getMenuById(Long id);
    List<Menu> getAllMenus();
}
