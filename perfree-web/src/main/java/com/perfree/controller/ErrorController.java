package com.perfree.controller;

import com.perfree.base.BaseController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ErrorController extends BaseController {
    @RequestMapping(value = "/404",produces = {"text/html"})
    public String errorPage404(){
        return view("/404.html", "/404.html",
                "static/admin/pages/exception/404.html");
    }

    @RequestMapping("/404")
    @ResponseBody
    public ResponseEntity<?> error404(){
        return ResponseEntity.status(404).build();
    }

    @RequestMapping(value="/500",produces = {"text/html"})
    public String errorPage500(){
        return view("/500.html", "/500.html",
                "static/admin/pages/exception/500.html");
    }

    @RequestMapping(value = "/500")
    @ResponseBody
    public ResponseEntity<?> error500(){
        return ResponseEntity.status(500).build();
    }

    /**
     * 权限异常
     */
    @RequestMapping(value="/403",produces = {"text/html"})
    public String unauthorizedPage() {
        return view("/403.html", "/403.html", "static/admin/pages/exception/403.html");
    }

    @RequestMapping(value = "/403")
    @ResponseBody
    public ResponseEntity<?> unauthorized(){
        return ResponseEntity.status(403).build();
    }
}
