/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.CrudRepository;

import com.example.demo.Entities.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author adrix garzon
 */
public interface MessageInterface extends CrudRepository <Message, Integer> {
    
}