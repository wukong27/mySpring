package org.springframework.demo;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.jnlp.BasicService;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @author zy.Lee
 * 2019/3/28 12:42
 */

public class PermissionAspect {

    private Logger logger = LoggerFactory.getLogger(PermissionAspect.class);

    private static final String DEFAULT_TOKEN_NAME = "accessToken";

//    private TokenManager tokenManager;
    private String tokenName;

    private boolean processing = true;

    @Autowired
    private javax.jnlp.BasicService BasicService;

/*    public void setTokenManager(TokenManager tokenManager) {
        this.tokenManager = tokenManager;
    }*/

    public void setTokenName(String tokenName) {
        if (StringUtils.isEmpty(tokenName)) {
            tokenName = DEFAULT_TOKEN_NAME;
        }
        this.tokenName = tokenName;
    }

    //ProceedingJoinPoint只有around的方式才可用
    //JoinPoint则around、before和after均可用
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("切点");
        return null;
    }
}
