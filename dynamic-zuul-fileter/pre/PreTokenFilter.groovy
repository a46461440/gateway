package pre;

import com.netflix.zuul.ZuulFilter
import com.netflix.zuul.context.RequestContext
import com.netflix.zuul.exception.ZuulException
import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.servlet.http.HttpServletRequest;

class Token2Filter extends ZuulFilter {

    Logger logger = LoggerFactory.getLogger(com.netflix.zuul.ZuulFilter.class)

    @Override
    String filterType() {
        return "pre"
    }

    @Override
    int filterOrder() {
        return 0
    }

    @Override
    boolean shouldFilter() {
        return true
    }

    @Override
    Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext()
        HttpServletRequest request = requestContext.getRequest()
        String token = request.getParameter("token")
        this.logger.info("dynamic token码askdhkd:" + token)
        if (token == null) {
            requestContext.setSendZuulResponse(false)
            requestContext.setResponseStatusCode(400)
        }
        return null
    }
}
