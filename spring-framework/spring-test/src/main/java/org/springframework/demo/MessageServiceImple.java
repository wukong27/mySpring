package org.springframework.demo;

import org.springframework.stereotype.Service;

/**
 * @author zy.Lee
 * 2019/2/13 14:59
 */
public class MessageServiceImple implements MessageService {
    @Override
    public String get() {
        return "success";
    }
}
