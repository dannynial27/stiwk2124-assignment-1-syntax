package com.assignment1.ecommerce.controller;

import com.assignment1.ecommerce.model.Role;
import com.assignment1.ecommerce.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    // Get all roles
    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    // Get role by ID
    @GetMapping("/{id}")
    public ResponseEntity<Role> getRoleById(@PathVariable Long id) {
        return ResponseEntity.ok(roleService.getRoleById(id));
    }

    // Create a new role
    @PostMapping
    public ResponseEntity<Role> createRole(@RequestBody Role role) {
        return new ResponseEntity<>(roleService.createRole(role), HttpStatus.CREATED);
    }

    // Update role
    @PutMapping("/{id}")
    public ResponseEntity<Role> updateRole(@PathVariable Long id, @RequestBody Role roleDetails) {
        return ResponseEntity.ok(roleService.updateRole(id, roleDetails));
    }

    // Delete role
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Boolean>> deleteRole(@PathVariable Long id) {
        roleService.deleteRole(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}