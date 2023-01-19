package com.imooc.pay.config;

import com.lly835.bestpay.config.AliPayConfig;
import com.lly835.bestpay.config.WxPayConfig;
import com.lly835.bestpay.service.BestPayService;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BestPayConfig {

    @Bean
    public BestPayService bestPayService(){
        WxPayConfig wxPayConfig = new WxPayConfig();
        wxPayConfig.setAppId("wx3e6b9f1c5a7ff034");
        wxPayConfig.setMchId("1614433647");
        wxPayConfig.setMchKey("Aa111111111122222222223333333333");
        wxPayConfig.setNotifyUrl("http://mzbcy4.natappfree.cc/pay/notify");

        AliPayConfig aliPayConfig = new AliPayConfig();
        aliPayConfig.setAppId("2021003174657911");
        aliPayConfig.setPrivateKey("MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQDCuTWDkBGij9ne+mzWfWO/2c2YqFmvAYJonEUA/0IW7e30Fbvmo/cSDul2celJCcmxoRmdzXiFjx/smJswLY1E04Y3DR9HD7san7Tz2VjSAqMoAuSJgCoCbAvlRruoHKcOZPjVzKcsHuv5LFPItAaJyWQsENq5SFYvcA/oN+3v33x4arsu3W9RKi7s6I9bPA8E7c+f2+wPWYotHjR1085j/hxuA1c3Qm844kyu75xEs9ar8jB8A0psFchR39+nZn6NOnEjMESdDiX2dTmADvf21qIuR1LfBGwEZdQpSPTvDVwA+xOtub4/whovPB3ICA8SJbF8zQLQzSqxNIk9AriLAgMBAAECggEADCVxaRt7fiBq/rWwRFDeAAGeCX+22GvHrq7QvxctEDEXPrp8Vg60QrQba///BUdPBX1/E5DVi785xpBeXcr5nOl03co7wTsB+M8tgmh0WeVAOCa2Cr2r4SrMMykOW5Yt9X/m5a82XlIvdgOF1mckYUPms7j5a8VPWvYqh9m1RdkXBbxaOAH9EvB0P7Q0gzmmiaN6NVy/Um5N/6ncEMScaTzcrC+xmEonG0Ag4Hu8mn0jKfFVGGsLQnyPB7pLsplpv1Hxkzy8+cjVvM5MJ6/f6r+kRiKAE6D9592a4IhACto0QbmJQtT6u+WMoeVGnOfY7CiQ9LCqCjXHaQFE51z8gQKBgQDvxpIYsVl6w/wkl0/lWhNvT5hxjMEUjegbwecEFcax0ye+pe+FdRG3o4Dbu+K9pxAmJfkYaLz5wpGXfbh9e4NXFNxn88257xKhQG0RZ31Enhu3mT6tyYUIQncXA56N5M8v3/SBUlBYzokEviSxusp4rXJx+vWqQV4oXCb5E4QFuQKBgQDP5jzVUSp2f06nobd18D2N99ZhByWR68yVHxNizzngFQQWE3OlLCm9wgQAMOH3xpxSZaD7aO7qHcE3ErFwZK3HPIUOXxVgsJ/eiLDtG1KaIiawG19tF29DI+eNq7tmWEE76g5mf5ejgj0O9ru2D1dF/GdHsdVr6x/Ax7wI27mSYwKBgHcgAJWkBwCnPi4vvtID3oP+144SkBrWJesketHcv8q5TZW6ezWi5BqIcQy6W/w9dBh/5THrV3f+4raRD4fIRYiOJLLAvgUScf8LMyTidaoRo1OkHy/YXu+rld8pPSzh8M2oRqG5c5GriweAMFrcopsyERnvxP3BXDZREkvNFlqBAoGAJfPmDxsuIUvEVB3VnBYrZotj+3qOhUECrAZsR5GFAz9S66TJa9HQHPAaQt6poc4EI5ah+MODOgIMj70930LB5qlJsQHyqSAVT06s3dwrDDBH18ZneUbZ7OvVDavYHirmXcWws01/pT3VX7HzOp06VXBqelAgof7eYRcVYJicG/kCgYBtmNsNEuhP9h2VJxAKYfg671uv/7JbBewuUU58p5RiI6P9gv9t8IAfdEAIHboF+oHyadjNNJOyNfZ2hvbzqh3uqkRgJGnpj7NSYM6xUZQz8P4hsFrpf82+7NNlEoz/8/Ca/LXneO9QTXZcLef9pSKk3GHmoKBbw+16yppapcxOzg==");
        aliPayConfig.setAliPayPublicKey("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgd3eBxPDN+F7kZQHKODLQKQw88DRIO5qm7p3RQyTeRzleukzLdtp+nz9bcooi93fmbc2ScssEVpVPyzN4PCYqRpeTSVcuGKqIDH22KpZBR4nKNweVuuRdyEZPSDeZgXrBNqyBL1tcd/Vks+httzqBlbQ/T60jo4jzvVNqHrGG18tiGnVYLJSdUKADpDONk2bAeyac2NtpkpAPgQqkxNGnlGLirIZ4pZKfDpsaDa3QSeQGHOdLAYlixoktVWDIofSwpimlfJR/65+6cIgL7J0jKuO+fIyU9Ir8coC/2fQh6WUClM5yiRZLH+DLQ+lFO5knG2++7uu0+j/oFXekyPF1wIDAQAB");
        aliPayConfig.setNotifyUrl("http://mzbcy4.natappfree.cc");
        aliPayConfig.setReturnUrl("http://127.0.0.1");


        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayConfig(wxPayConfig);
        bestPayService.setAliPayConfig(aliPayConfig);
        return bestPayService;
    }
}
