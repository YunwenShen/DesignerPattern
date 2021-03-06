package com.cucci.decorator;

/**
 * @author shenyw
 **/
public class ThirdPartyDecorator implements IThirdPartyService {

    private IThirdPartyService thirdPartyService;

    public ThirdPartyDecorator(IThirdPartyService thirdPartyService) {
        this.thirdPartyService = thirdPartyService;
    }

    @Override
    public String sayMsg() {
        return "[" + thirdPartyService.sayMsg() + "]";
    }
}
