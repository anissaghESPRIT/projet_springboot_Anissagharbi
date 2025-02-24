package com.example.springdemo.Service;

import com.example.springdemo.entities.Menu;
import com.example.springdemo.repositories.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class MenuService implements IMenuService {
   @Autowired
   MenuRepository menuRepository;
    @Override
    public Menu createMenu(Menu menu) {
        return null;
    }

    @Override
    public Menu updateMenu(Long id, Menu menu) {
        return null;
    }

    @Override
    public void deleteMenu(Long id) {

    }

    @Override
    public Menu getMenuById(Long id) {
        return null;
    }

    @Override
    public List<Menu> getAllMenus() {
        return List.of();
    }
}
