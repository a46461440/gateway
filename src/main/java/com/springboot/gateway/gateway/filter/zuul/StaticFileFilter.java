package com.springboot.gateway.gateway.filter.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class StaticFileFilter extends ZuulFilter {

    private static ThreadLocal<RequestContext> requestContextThreadLocal = new ThreadLocal<RequestContext>();

    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return -1;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        requestContextThreadLocal.set(requestContext);
        HttpServletRequest request = requestContext.getRequest();
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        try {
            throw new Exception();
        } catch (Exception e) {
            RequestContext requestContext = requestContextThreadLocal.get();
            requestContext.set("error.status_code", e.getCause());
            requestContext.set("error.exception", e);
        }
        return null;
    }
}
